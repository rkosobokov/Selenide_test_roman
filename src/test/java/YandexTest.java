import org.apache.commons.lang3.ObjectUtils;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;
import io.qameta.allure.Step;

@TestMethodOrder(OrderAnnotation.class)
public class YandexTest extends BaseTest {
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
    @DisplayName("Получение всех атрибутов и проверка цвета значка яндекс на красный #F8604A")
    @Step("Получение всех атрибутов и проверка цвета значка яндекс на красный #F8604A")
    void getAllAttributes() {
        System.out.println("Атрибуты элемента:");
        System.out.println("href = " + searchResultsPage.logoLink.attr("href"));
        System.out.println("class = " + searchResultsPage.logoLink.attr("class"));
        System.out.println("aria-label = " + searchResultsPage.logoLink.attr("aria-label"));
        System.out.println("data-counter = " + searchResultsPage.logoLink.attr("data-counter"));
        System.out.println("data-log-node = " + searchResultsPage.logoLink.attr("data-log-node"));

        System.out.println("\nАтрибуты SVG:");
        System.out.println("xmlns = " + searchResultsPage.logo.attr("xmlns"));
        System.out.println("width = " + searchResultsPage.logo.attr("width"));
        System.out.println("height = " + searchResultsPage.logo.attr("height"));
        System.out.println("fill = " + searchResultsPage.logo.attr("fill"));
        System.out.println("viewBox = " + searchResultsPage.logo.attr("viewBox"));

        System.out.println("\nАтрибуты первого path:");
        System.out.println("fill = " + searchResultsPage.firstPath.attr("fill"));
        System.out.println("d = " + searchResultsPage.firstPath.attr("d"));

        System.out.println("\nАтрибуты второго path:");
        System.out.println("fill = " + searchResultsPage.secondPath.attr("fill"));
        System.out.println("d = " + searchResultsPage.secondPath.attr("d"));

        searchResultsPage.firstPath.shouldHave(attribute("fill", "#F8604A"));
    }

}