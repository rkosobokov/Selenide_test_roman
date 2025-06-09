import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class SubjectsInput {
    private final SelenideElement subjectsInput = $("#subjectsInput");
  //  private final SelenideElement subjectsContainer = $("#subjectsContainer");

    public SubjectsInput selectSubject(String subject) {
        subjectsInput.setValue(subject);
        $(".subjects-auto-complete__menu-list").$x(".//div[text()='" + subject + "']").click();
        return this;
    }
}
