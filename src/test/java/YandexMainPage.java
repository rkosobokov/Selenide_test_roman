import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class YandexMainPage {
    public SelenideElement searchInput() {
        return $x("//input[contains(@class, 'search3__input') and @name='text']");
    }

    public SelenideElement logo() {
        return $x("/html/body/div[1]/div[1]/header/form/div[1]/a");
    }

    public SelenideElement declineButton() {
        return $("button.Distribution-ButtonClose");
    }

    public void searchFor(String text) {
        searchInput().setValue(text).pressEnter();
    }
}