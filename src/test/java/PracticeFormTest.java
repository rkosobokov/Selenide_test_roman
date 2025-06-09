import org.junit.jupiter.api.*;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PracticeFormTest extends BaseTest {

    private PracticeFormPage formPage;

    @BeforeAll
    public void setUp() {
        formPage = open("https://demoqa.com/automation-practice-form", PracticeFormPage.class);
    }

    @Test
    @Order(2)
    @DisplayName("Нажать на sumbit и проверить рамку поля на красный цвет")
    public void clickSubmit() {
        formPage.submit();

        formPage.getFirstNameField()
                .shouldHave(cssValue("border-color", "rgb(220, 53, 69)"));
    }

    @Test
    @Order(3)
    @DisplayName("Ввести данные, имя, фамилия, почта, род, телефон, дата рождения")
    public void fillPracticeFormTest() {
        formPage.setFirstName("Roman")
                .setLastName("Smith")
                .setEmail("example@example.com")
                .selectGender("Female")
                .setMobileNumber("3333355555")
                .dateOfBirth().setDate("16", "May", "1990");


    }

    @Test
    @Order(4)
    @DisplayName("Выбрать тег")
    public void fillPracticeFormTest2() {
        formPage
                .subjects().selectSubject("Maths");
    }

    @Test
    @Order(5)
    @DisplayName("Ввести хобби")
    public void fillPracticeFormTest3() {
        formPage
                .hobbies().selectHobby("Sports");
    }

    @Test
    @Order(6)
    @DisplayName("Загрузить картинку")
    public void fillPracticeFormTest4() {
        formPage
                .uploadPicture("test-image.jpg");
    }

    @Test
    @Order(7)
    @DisplayName("Ввести адрес")
    public void fillPracticeFormTest5() {
        formPage
                .setCurrentAddress("123 Main St, New York, USA");
    }

    @Test
    @Order(8)
    @DisplayName("Выбрать местоположение")
    public void fillPracticeFormTest6() {
        formPage
                .stateAndCity()
                .selectState("NCR")
                .selectCity("Delhi");
    }

    @Test
    @Order(9)
    @DisplayName("Нажать submit")
    public void clickSubmit2() {
        formPage.submit();

    }

    @Test
    @Order(9)
    @DisplayName("Проверить данные на форме")
    public void checkTable() {



        $(".table-responsive").shouldBe(visible);

        // Проверка каждой строки таблицы
        $$(".table-responsive tbody tr").shouldHave(
                exactTexts(
                        "Student Name Roman Smith",
                        "Student Email example@example.com",
                        "Gender Female",
                        "Mobile 3333355555",
                        "Date of Birth 16 May,1990",
                        "Subjects Maths",
                        "Hobbies Sports",
                        "Picture test-image.jpg",
                        "Address 123 Main St, New York, USA",
                        "State and City NCR Delhi"
                )
        );
    }
}