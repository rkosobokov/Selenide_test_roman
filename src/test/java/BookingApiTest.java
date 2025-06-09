import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.qameta.allure.Step;
import io.qameta.allure.junit5.AllureJunit5;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

@ExtendWith(AllureJunit5.class)
public class BookingApiTest {

    private static final String BASE_URL = "https://restful-booker.herokuapp.com/booking";

    @Test
    @Step("Получение всех доступных бронирований")
    public void testGetBookingIds() {
        // Устанавливаем базовый URL для Rest Assured
        RestAssured.baseURI = BASE_URL;

        // Выполняем GET-запрос на получение всех бронирований
        Response response = given()
                .when()
                .get()
                .then()
                .statusCode(200) // Проверяем, что статус ответа 200
                .body("bookingid", not(empty())) // Проверяем, что список bookingid не пустой
                .extract()
                .response();

        // Логируем полученные данные
        System.out.println("Response: " + response.asString());
    }

    @Test
    @Step("Получение бронирований по имени")
    public void testGetBookingByFirstname() {
        String firstname = "Roman";  // Пример имени для фильтрации
        Response response = given()
                .queryParam("firstname", firstname)
                .when()
                .get(BASE_URL)
                .then()
                .statusCode(200)
                .extract()
                .response();

        // Проверяем, что возвращается не пустая выборка
        System.out.println("Response: " + response.asString());
        response.then().body("bookingid", not(empty()));
    }

    @Test
    @Step("Получение бронирований по фамилии")
    public void testGetBookingByLastname() {
        String lastname = "Doe";  // Пример фамилии для фильтрации
        Response response = given()
                .queryParam("lastname", lastname)
                .when()
                .get(BASE_URL)
                .then()
                .statusCode(200)
                .extract()
                .response();

        // Проверяем, что возвращается не пустая выборка
        System.out.println("Response: " + response.asString());
        response.then().body("bookingid", not(empty()));
    }
}