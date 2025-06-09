import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class HobbiesCheckboxes {
    private final SelenideElement hobbiesWrapper = $("#hobbiesWrapper");

    public HobbiesCheckboxes selectHobby(String hobby) {
        hobbiesWrapper.$x(".//label[text()='" + hobby + "']").click();
        return this;
    }
}

