import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class StateCitySelector {
    private final SelenideElement stateInput = $("#state");
    private final SelenideElement cityInput = $("#city");

    public StateCitySelector selectState(String state) {
        stateInput.click();
        $("#stateCity-wrapper").$x(".//div[text()='" + state + "']").click();
        return this;
    }

    public StateCitySelector selectCity(String city) {
        cityInput.click();
        $("#stateCity-wrapper").$x(".//div[text()='" + city + "']").click();
        return this;
    }
}
