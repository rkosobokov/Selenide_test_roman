import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class YandexSearchResultsPage {

    // Объявляем элементы как поля класса
    public SelenideElement logoLink = $x("/html/body/div[1]/div[1]/header/form/div[1]/a");
    public SelenideElement logo = logoLink.$("svg");
    public SelenideElement firstPath = logo.$("path:nth-child(1)");
    public SelenideElement secondPath = logo.$("path:nth-child(2)");


    public YandexSearchResultsPage getAtributes() {
        System.out.println("Атрибуты элемента:");
        System.out.println("href = " + logoLink.attr("href"));
        System.out.println("class = " + logoLink.attr("class"));
        System.out.println("aria-label = " + logoLink.attr("aria-label"));
        System.out.println("data-counter = " + logoLink.attr("data-counter"));
        System.out.println("data-log-node = " + logoLink.attr("data-log-node"));

        System.out.println("\nАтрибуты SVG:");
        System.out.println("xmlns = " + logo.attr("xmlns"));
        System.out.println("width = " + logo.attr("width"));
        System.out.println("height = " + logo.attr("height"));
        System.out.println("fill = " + logo.attr("fill"));
        System.out.println("viewBox = " + logo.attr("viewBox"));

        System.out.println("\nАтрибуты первого path:");
        System.out.println("fill = " + firstPath.attr("fill"));
        System.out.println("d = " + firstPath.attr("d"));

        System.out.println("\nАтрибуты второго path:");
        System.out.println("fill = " + secondPath.attr("fill"));
        System.out.println("d = " + secondPath.attr("d"));
        return this ;
    }
    public YandexSearchResultsPage getColor() {
        firstPath.shouldBe(visible)
                .shouldHave(attribute("fill", "#F8604A11"));
        return this ;
    }
}