import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class YandexSearchResultsPage {
    // Объявляем элементы как поля класса
    public SelenideElement logoLink = $x("/html/body/div[1]/div[1]/header/form/div[1]/a");
    public SelenideElement logo = logoLink.$("svg");
    public SelenideElement firstPath = logo.$("path:nth-child(1)");
    public SelenideElement secondPath = logo.$("path:nth-child(2)");
}