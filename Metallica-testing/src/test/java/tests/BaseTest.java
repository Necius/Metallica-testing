package tests;

import Pages.Metallica;
import browser.Browser;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseTest {

    protected static Metallica metallica;

    @BeforeClass
    public static void setup() {
        metallica = new Metallica();
        ChromeDriverManager.chromedriver().setup();

    }

    @AfterClass
    public static void cleanUp() {
        Browser.getBrowser().quit();
    }

}
