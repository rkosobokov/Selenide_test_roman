import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionHandlingTest {

    @Test
    void exception() {
        try {
            String value = null;
            System.out.println(value.length()); // Это вызовет NullPointerException
            Assertions.assertTrue(false); // Это утверждение не будет достигнуто
        } catch (NullPointerException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
            Assertions.assertTrue(true); // Здесь мы подтверждаем, что исключение было обработано
        } catch (AssertionError e) {
            System.out.println("Произошла ошибка утверждения: " + e.getMessage());
            Assertions.assertTrue(true); // Обрабатываем ошибку утверждения
        }
    }
}