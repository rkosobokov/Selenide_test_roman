package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class pagePageObject  {
    public SelenideElement firstName = $x("//*[@id='firstName']");
    public SelenideElement lastName = $("#lastName");
    public SelenideElement email = $("#userEmail");
    public SelenideElement phoneNumber = $("#userNumber");
    public SelenideElement genderMale = $("#gender-radio-1");
    public SelenideElement dateOfBirthInput = $("#dateOfBirthInput");
    public SelenideElement subjectsInput = $("#subjectsInput");
    public SelenideElement hobbiesCheckbox = $("#hobbies-checkbox-1");
    public SelenideElement uploadPicture = $("#uploadPicture");
    public SelenideElement currentAddress = $("#currentAddress");
    public SelenideElement stateDropdown = $("#state");
    public SelenideElement cityDropdown = $("#city");
    public SelenideElement submitButton = $("#submit");
}