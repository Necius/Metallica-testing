package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    private static ChromeDriver browser;

    public static ChromeDriver getBrowser() {
        if (browser == null) {
            WebDriverManager.chromedriver().setup();
            browser = new ChromeDriver();
        }
        return browser;
    }
}
