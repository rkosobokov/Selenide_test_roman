import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookingTest {

    private final String BASE_URL = "https://restful-booker.herokuapp.com";

    @Test
    @Step("Получение информации о бронировании по ID")
    public void getBookingById() {
        // Укажите ID бронирования
        int bookingId = 2785;

        // Выполнение GET запроса для получения информации о бронировании
        Response response = RestAssured.given()
                .header("Accept", "application/json")
                .when()
                .get(BASE_URL + "/booking/" + bookingId);

        // Проверка статуса ответа
        Assertions.assertEquals(200, response.getStatusCode(), "Ожидаемый статус ответа: 200");

        // Проверка содержания ответа
        System.out.println("Ответ: " + response.getBody().asString());
        Assertions.assertNotNull(response.jsonPath().getString("firstname"), "Имя не должно быть null");
        Assertions.assertNotNull(response.jsonPath().getString("lastname"), "Фамилия не должна быть null");
        Assertions.assertNotNull(response.jsonPath().getFloat("totalprice"), "Общая цена не должна быть null");
        Assertions.assertNotNull(response.jsonPath().getBoolean("depositpaid"), "Статус депозита не должен быть null");
        Assertions.assertNotNull(response.jsonPath().getMap("bookingdates"), "Даты бронирования не должны быть null");
    }
}