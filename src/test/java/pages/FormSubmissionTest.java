package pages;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import static com.codeborne.selenide.Selenide.open;
import io.qameta.allure.Step;


//@TestMethodOrder(OrderAnnotation.class)
public class FormSubmissionTest extends BaseTest {


    private pagePageElements elements = new pagePageElements();






    @Test
    @Order(1)
    @DisplayName("Зайти на страницу и ввести данные, подвердить")
   // @Step("Зайти на страницу и ввести данные, подвердить")
@Step("Открытие страницы формы")
    public void testFormSubmission() {
        // Открытие страницы с формой
        open("https://demoqa.com/automation-practice-form"); // Замените на действительный путь к вашей форме

        // Ввод данных в форму
        elements.enterFirstName("John");
        elements.enterLastName("Doe");
        elements.enterEmail("john.doe@example.com");
        elements.enterPhoneNumber("1234567890");
        elements.selectGenderMale();
        elements.enterDateOfBirth("01 Jan 2000");
        elements.enterSubjects("Mathematics");
        elements.selectHobbies();
        elements.uploadPicture("path/to/your/image.jpg"); // Замените на актуальный путь к изображению
        elements.enterCurrentAddress("123 Main St");
        elements.selectState("California");
        elements.selectCity("Los Angeles");
    }
        // Отправка формы
        @Step("Отправляем форму")
        public void submitForm() {
            // Логика для отправки формы
            elements.submitForm();
            // Дополнительные проверки могут быть выполнены здесь
        }

        // Здесь вы можете добавить дополнительные проверки, например, на наличие сообщения об успешной отправке
        // или на отображение введённых данных на странице подтверждения
    }
