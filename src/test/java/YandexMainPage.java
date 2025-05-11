import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class YandexMainPage {
    // Объявляем элементы как поля класса
    public SelenideElement searchInput = $x("//input[contains(@class, 'search3__input') and @name='text']");
    public SelenideElement logo = $x("/html/body/div[1]/div[1]/header/form/div[1]/a");
    public SelenideElement declineButton = $("button.Distribution-ButtonClose");

    public void searchFor(String text) {
        searchInput.setValue(text).pressEnter();
    }
}