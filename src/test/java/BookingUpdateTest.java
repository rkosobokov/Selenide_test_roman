import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class BookingUpdateTest {

    private static final String BASE_URL = "https://restful-booker.herokuapp.com/booking/";
    private static final String TOKEN = "262d2857668b111";

    @Test
    @Description("Перезапись данных по книге")
    public void updateBookingTest() {
        // Создаем новый объект для обновления данных бронирования
        String jsonData = "{\n" +
                "    \"firstname\" : \"Roman\",\n" +
                "    \"lastname\" : \"Jaison\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        // Выполняем PUT-запрос для обновления бронирования
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Cookie", "token=" + TOKEN)
                .body(jsonData)
                .when()
                .put(BASE_URL + "2785")
                .then()
                .extract()
                .response();

        // Проверяем статус код
        Assertions.assertEquals(200, response.getStatusCode(), "Expected status code 200");

        // Дополнительно можно проверить обновленные данные
        verifyUpdatedBooking();
    }

    @Step("Проверка обновленных данных")
    private void verifyUpdatedBooking() {
        Response response = given()
                .header("Accept", "application/json")
                .header("Cookie", "token=" + TOKEN)
                .when()
                .get(BASE_URL + "1")
                .then()
                .extract()
                .response();

        Assertions.assertEquals(200, response.getStatusCode(), "Expected status code 200");

        // Дополнительно проверяем, что данные были обновлены корректно
        Assertions.assertEquals("James", response.jsonPath().getString("firstname"), "Firstname should be James");
        Assertions.assertEquals("Jaison", response.jsonPath().getString("lastname"), "Lastname should be Brown");
        Assertions.assertEquals(111, response.jsonPath().getInt("totalprice"), "Total price should be 111");
        Assertions.assertTrue(response.jsonPath().getBoolean("depositpaid"), "Deposit paid should be true");
        Assertions.assertEquals("Breakfast", response.jsonPath().getString("additionalneeds"), "Additional needs should be Breakfast");
    }
}