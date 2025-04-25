import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.*;
import java.util.Map;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class YandexTest {

    @BeforeAll
    static void setup() {
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.timeout = 10000;
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
       // System.setProperty("wdm.chromeDriverVersion", "135.0.7049.114");
    }


    @Test
    @Order(1)
    @DisplayName("Войти на страницу поиска Яндекс, прописать в поиске Selenide, и отменить соглашение на поставить яндекс по умолчанию")
    void searchTest() {
        open("https://ya.ru");

        // Проверить на видимость
        $x("//input[contains(@class, 'search3__input') and @name='text']").shouldBe(visible);

        // Вводим запрос и нажимаем Enter
        $x("//input[contains(@class, 'search3__input') and @name='text']")
                .setValue("Selenide")
                .pressEnter();

        // Клик по кнопке "Нет, спасибо" через цепочку классов
        $("button.Distribution-ButtonClose").click();

           }
    @Test
    @Order(2)
    @DisplayName("Получение всех атрибутов и проверка цвета значка яндекс на красный #F8604A")
    void getAllAttributes() {
        SelenideElement logoLink = $x("/html/body/div[1]/div[1]/header/form/div[1]/a");

        // Получаем отдельные атрибуты
        System.out.println("Атрибуты элемента:");
        System.out.println("href = " + logoLink.attr("href"));
        System.out.println("class = " + logoLink.attr("class"));
        System.out.println("aria-label = " + logoLink.attr("aria-label"));
        System.out.println("data-counter = " + logoLink.attr("data-counter"));
        System.out.println("data-log-node = " + logoLink.attr("data-log-node"));

        // Получаем атрибуты вложенного SVG
        SelenideElement svg = logoLink.$("svg");
        System.out.println("\nАтрибуты SVG:");
        System.out.println("xmlns = " + svg.attr("xmlns"));
        System.out.println("width = " + svg.attr("width"));
        System.out.println("height = " + svg.attr("height"));
        System.out.println("fill = " + svg.attr("fill"));
        System.out.println("viewBox = " + svg.attr("viewBox"));

        // Получаем атрибуты path элементов
        SelenideElement firstPath = svg.$("path:nth-child(1)");
        System.out.println("\nАтрибуты первого path:");
        System.out.println("fill = " + firstPath.attr("fill"));
        System.out.println("d = " + firstPath.attr("d"));

        SelenideElement secondPath = svg.$("path:nth-child(2)");
        System.out.println("\nАтрибуты второго path:");
        System.out.println("fill = " + secondPath.attr("fill"));
        System.out.println("d = " + secondPath.attr("d"));

        // Проверяем, что атрибут fill равен #F8604A (Красный)
        svg.$("path:nth-child(1)").shouldHave(attribute("fill", "#F8604A"));
    }
}