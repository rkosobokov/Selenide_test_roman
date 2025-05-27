

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest1 {
    @BeforeAll
    static void setup() {
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.timeout = 20000;
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1920";
    }
}