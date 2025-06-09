import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormPage {
    // Основные элементы формы
    private final SelenideElement firstNameInput = $("#firstName");
    private final SelenideElement lastNameInput = $("#lastName");
    private final SelenideElement emailInput = $("#userEmail");
    private final SelenideElement genderRadio = $("#genterWrapper");
    private final SelenideElement mobileInput = $("#userNumber");
    private final DateOfBirthPicker dateOfBirthPicker = new DateOfBirthPicker();
    private final SubjectsInput subjectsInput = new SubjectsInput();
    private final HobbiesCheckboxes hobbiesCheckboxes = new HobbiesCheckboxes();
    private final SelenideElement uploadPictureInput = $("#uploadPicture");
    private final SelenideElement currentAddressInput = $("#currentAddress");
    private final StateCitySelector stateCitySelector = new StateCitySelector();
    private final SelenideElement submitButton = $("#submit");


    public SelenideElement getFirstNameField() {
        return firstNameInput;
    }


    public PracticeFormPage setFirstName(String firstName) {
        firstNameInput.setValue(firstName);
        return this;
    }


    public PracticeFormPage setLastName(String lastName) {
        lastNameInput.setValue(lastName);
        return this;
    }

    public PracticeFormPage setEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    public PracticeFormPage selectGender(String gender) {
        genderRadio.$x(".//label[text()='" + gender + "']").click();
        return this;
    }

    public PracticeFormPage setMobileNumber(String mobile) {
        mobileInput.setValue(mobile);
        return this;
    }

    public DateOfBirthPicker dateOfBirth() {
        return dateOfBirthPicker;
    }

    public SubjectsInput subjects() {
        return subjectsInput;
    }

    public HobbiesCheckboxes hobbies() {
        return hobbiesCheckboxes;
    }

    public PracticeFormPage uploadPicture(String filePath) {
        uploadPictureInput.uploadFromClasspath(filePath);
        return this;
    }

    public PracticeFormPage setCurrentAddress(String address) {
        currentAddressInput.setValue(address);
        return this;
    }

    public StateCitySelector stateAndCity() {
        return stateCitySelector;
    }

    public void submit() {
        submitButton.click();
    }
}
