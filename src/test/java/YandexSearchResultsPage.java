import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class YandexSearchResultsPage {
    public SelenideElement logoLink() {
        return $x("/html/body/div[1]/div[1]/header/form/div[1]/a");
    }

    public SelenideElement logo() {
        return logoLink().$("svg");
    }

    public SelenideElement firstPath() {
        return logo().$("path:nth-child(1)");
    }

    public SelenideElement secondPath() {
        return logo().$("path:nth-child(2)");
    }
}