import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;
import io.qameta.allure.Step;

@TestMethodOrder(OrderAnnotation.class)
public class YandexTest extends BaseTest1 {
    private YandexMainPage yandexMainPage = new YandexMainPage();
    private YandexSearchResultsPage searchResultsPage = new YandexSearchResultsPage();

    @Test
    @Order(1)
    @DisplayName("Войти на страницу поиска Яндекс, прописать в поиске Selenide, и отменить соглашение на поставить яндекс по умолчанию")
    @Step("Открыть Яндекс, ввести 'Selenide' в поисковую строку и отменить предложение о установке Яндекса по умолчанию")
    void searchTest() {
        open("https://ya.ru");
        yandexMainPage.searchInput.shouldBe(visible);
        yandexMainPage.searchFor("Selenide");
        yandexMainPage.declineButton.click();
    }

    @Test
    @Order(2)
    @DisplayName("Получение всех атрибутов")
    @Step("Получение всех атрибутов")
    void getAllAttributes() {
        searchResultsPage.getAtributes();
    }
    @Test
    @Order(3)
    @DisplayName("Проверить цвет")
    @Step("")
    void logoTest() {
        searchResultsPage.getColor();
    }

}