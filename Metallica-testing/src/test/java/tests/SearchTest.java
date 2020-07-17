package tests;

import browser.Browser;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SearchTest extends BaseTest {

    @Before
    public void testSetup() {
        Browser.getBrowser().get("https://www.metallica.com/");
        Browser.getBrowser().manage().window().maximize();
        if (metallica.getHomePage().getAcceptCookies() != null) {
            metallica.getHomePage().getAcceptCookies().click();
        }

    }

    @Test
    public void testCaseMet_006() {

        assertTrue(metallica.getHomePage().getSearchButton().isDisplayed());
        assertTrue(metallica.getHomePage().getSearchIcon().isDisplayed());
        metallica.getHomePage().getSearchButton().click();
        metallica.getHomePage().getCloseButton().click();
        assertTrue(metallica.getHomePage().getSearchButton().isDisplayed());

    }

    @Test
    public void testCaseMet_007() throws InterruptedException {
        metallica.getHomePage().getSearchButton().click();
        metallica.getHomePage().getSearchField().sendKeys("Blackened");
        Thread.sleep(1500);
        metallica.getHomePage().getSearchFormButton().click();
        assertEquals("https://www.metallica.com/search/?q=Blackened&lang=default", Browser.getBrowser().getCurrentUrl());
        assertTrue(metallica.getSearchPage().getSearchResults().isDisplayed());
    }

    @Test
    public void testCaseMet_008() throws InterruptedException {
        metallica.getHomePage().getSearchButton().click();
        metallica.getHomePage().getSearchField().sendKeys("InvalidSearchTerm");
        Thread.sleep(1500);
        metallica.getHomePage().getSearchFormButton().click();
        assertTrue(metallica.getSearchPage().getInvalidSearch().isDisplayed());
    }


}