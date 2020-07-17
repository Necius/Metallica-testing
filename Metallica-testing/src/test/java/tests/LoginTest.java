package tests;

import browser.Browser;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTest extends BaseTest {

    private Object String;


    @Before
    public void testSetup() {
        Browser.getBrowser().get("https://www.metallica.com/");
        Browser.getBrowser().manage().window().maximize();
        if (metallica.getHomePage().getAcceptCookies() != null) {
            metallica.getHomePage().getAcceptCookies().click();
        }

    }

    @Test
    public void testCaseMet_001() {

        assertTrue(metallica.getHomePage().getLoginButton().isDisplayed());
        assertTrue(metallica.getHomePage().getUserAvatar().isDisplayed());
        assertTrue(metallica.getHomePage().getLoginButton().isEnabled());
    }


    @Test
    public void testCaseMet_002() throws InterruptedException {
        metallica.getHomePage().getLoginButton().click();
        assertEquals("https://www.metallica.com/login/?original=%2Faccount%2F", Browser.getBrowser().getCurrentUrl());
        metallica.getLoginPage().getEmailField().sendKeys("nemanja.jovanovic325@gmail.com");
        Thread.sleep(1500);
        metallica.getLoginPage().getPasswordField().sendKeys("Africaner20-19");
        Thread.sleep(1500);
        metallica.getLoginPage().getLoginFormButton().click();
        assertTrue(metallica.getLoginPage().getAccountOverview().isDisplayed());
        metallica.getLoginPage().getAccountButton().click();
        metallica.getLoginPage().getLogOutButton().click();
        assertTrue(metallica.getHomePage().getLoginButton().isDisplayed());
    }

    @Test
    public void testCaseMet_003() throws InterruptedException {
        metallica.getHomePage().getLoginButton().click();
        metallica.getLoginPage().getEmailField().sendKeys("nemanja.jovanovic@gmail.com");
        Thread.sleep(1500);
        metallica.getLoginPage().getPasswordField().sendKeys("Africaner20-19");
        Thread.sleep(1500);
        metallica.getLoginPage().getLoginFormButton().click();
        assertTrue(metallica.getLoginPage().getErrorMessage().isDisplayed());


    }

    @Test
    public void testCaseMet_004() {
        metallica.getHomePage().getLoginButton().click();
        metallica.getLoginPage().getEmailField().sendKeys("nemanja.jovanovic325@gmail.com");
        metallica.getLoginPage().getPasswordField().sendKeys("africaner20-19");
        metallica.getLoginPage().getLoginFormButton().click();
        assertTrue(metallica.getLoginPage().getErrorMessage().isDisplayed());


    }

    @Test
    public void testCaseMet_005() throws InterruptedException {
        metallica.getHomePage().getLoginButton().click();
        metallica.getLoginPage().getEmailField().sendKeys("nemanja.jovanovic325@gmail.com");
        metallica.getLoginPage().getPasswordField().sendKeys("Africaner20-19");
        metallica.getLoginPage().getLoginFormButton().click();
        metallica.getLoginPage().getDownloadMyDataButton().click();
        Thread.sleep(3000);

        File dir = new File("C:\\Users\\Admin\\Downloads");
        File[] dirContents = dir.listFiles();

        boolean isDownloaded = false;
        for (int i = 0; i < dirContents.length; i++) {

            if (dirContents[i].getName().equals("Metallica_Nemanja_Jovanovic.json")) {

                isDownloaded = true;
                dirContents[i].delete();
                break;
            }
        }
        assertEquals(true, isDownloaded);


    }


}
