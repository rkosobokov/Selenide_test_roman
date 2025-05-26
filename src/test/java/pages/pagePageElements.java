package pages;

import java.io.File;

public class pagePageElements {
    private pagePageObject elements;

    public pagePageElements() {
        this.elements = new pagePageObject(); // Инициализация элементов
    }

    public void enterFirstName(String firstName) {
        elements.firstName.setValue(firstName);
    }

    public void enterLastName(String lastName) {
        elements.lastName.setValue(lastName);
    }

    public void enterEmail(String email) {
        elements.email.setValue(email);
    }

    public void enterPhoneNumber(String phoneNumber) {
        elements.phoneNumber.setValue(phoneNumber);
    }

    public void selectGenderMale() {
        elements.genderMale.click(); // Выбор пола
    }

    public void enterDateOfBirth(String dateOfBirth) {
        elements.dateOfBirthInput.setValue(dateOfBirth); // Ввод даты рождения
    }

    public void enterSubjects(String subjects) {
        elements.subjectsInput.setValue(subjects); // Ввод предметов
    }

    public void selectHobbies() {
        elements.hobbiesCheckbox.click(); // Выбор хобби
    }

    public void uploadPicture(String filePath) {
        elements.uploadPicture.uploadFile(new File(filePath)); // Загрузка файла
    }

    public void enterCurrentAddress(String address) {
        elements.currentAddress.setValue(address); // Ввод текущего адреса
    }

    public void selectState(String state) {
        elements.stateDropdown.setValue(state).pressEnter(); // Выбор штата
    }

    public void selectCity(String city) {
        elements.cityDropdown.setValue(city).pressEnter(); // Выбор города
    }

    public void submitForm() {
        elements.submitButton.click(); // Отправка формы
    }
}