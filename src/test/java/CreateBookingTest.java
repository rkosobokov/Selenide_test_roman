import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.TmsLink;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class CreateBookingTest {

    @TmsLink("Тестовый ID")
    @Description("Создание бронирования с указанными данными пользователя.")
    @Step("Запуск теста на создание бронирования")
    public void createBookingTest() {
        // Установка базового URI
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";

        // Создание тела запроса
        String requestBody = "{\n" +
                "    \"firstname\": \"Roman\",\n" +
                "    \"lastname\": \"Smith\",\n" +
                "    \"totalprice\": 50,\n" +
                "    \"depositpaid\": true,\n" +
                "    \"bookingdates\": {\n" +
                "        \"checkin\": \"2024-04-04\",\n" +
                "        \"checkout\": \"2025-04-04\"\n" +
                "    },\n" +
                "    \"additionalneeds\": \"sdsdsdsdsd\"\n" +
                "}";

        // Отправка POST запроса
        Response response = sendPostRequest(requestBody);

        // Вывод статуса ответа
        printResponseDetails(response);
    }

    @Step("Отправка POST запроса для создания бронирования")
    private Response sendPostRequest(String requestBody) {
        return given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/booking")
                .then()
                .extract()
                .response();
    }

    @Step("Вывод деталей ответа")
    private void printResponseDetails(Response response) {
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.asString());
    }

    public static void main(String[] args) {
        CreateBookingTest test = new CreateBookingTest();
        test.createBookingTest();
    }
}