package tests;

import browser.Browser;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MetStoreTest extends BaseTest {

    @Before
    public void testSetup() {
        Browser.getBrowser().get("https://www.metallica.com/");
        Browser.getBrowser().manage().window().maximize();
        if (metallica.getHomePage().getAcceptCookies() != null) {
            metallica.getHomePage().getAcceptCookies().click();
        }
    }

    @Test
    public void testCaseMet_009() {

        assertTrue(metallica.getHomePage().getCartButton().isEnabled());
        assertTrue(metallica.getHomePage().getMetStoreButton().isDisplayed());
        metallica.getHomePage().getMetStoreButton().click();
        assertEquals("https://www.metallica.com/store/", Browser.getBrowser().getCurrentUrl());
        assertTrue(metallica.getHomePage().getCartButton().isEnabled());

    }

    @Test
    public void testCaseMet_010() throws InterruptedException {
        metallica.getHomePage().getSearchButton().click();
        metallica.getHomePage().getSearchField().sendKeys("BORIS DENIM JACKET");
        Thread.sleep(1500);
        metallica.getHomePage().getSearchFormButton().click();
        assertEquals("https://www.metallica.com/search/?q=BORIS+DENIM+JACKET&lang=default",
                Browser.getBrowser().getCurrentUrl());
        metallica.getSearchPage().getProductSearch().click();
        assertEquals("https://www.metallica.com/store/boris-denim-jacket/BORISDENIMJACKET.html#q="
                + "BORIS%2BDENIM%2BJACKET&lang=default&start=1", Browser.getBrowser().getCurrentUrl());
        assertFalse(metallica.getMetStorePage().getAddToCartButton().isEnabled());
        metallica.getMetStorePage().getLargeButton().click();
        Thread.sleep(1500);
        metallica.getMetStorePage().getAddToCartButton().click();
        metallica.getMetStorePage().getViewCartButton().click();
        assertEquals("https://www.metallica.com/cart/", Browser.getBrowser().getCurrentUrl());
        assertEquals("ORDER SUMMARY", metallica.getCartPage().getOrderSummary().getText());
        assertEquals("Subtotal $124.99", metallica.getCartPage().getSubtotalValue().getText());
        metallica.getCartPage().getRemoveButton().click();
        Thread.sleep(2000);
        assertEquals("YOUR SHOPPING CART IS EMPTY", metallica.getCartPage().getShoppingCartEmpty().getText());


    }


    @Test
    public void testCaseMet_011() throws InterruptedException {
        metallica.getHomePage().getMetStoreButton().click();
        metallica.getMetStorePage().getProductNumberOne().click();
        metallica.getMetStorePage().getAddToCartButton().click();
        metallica.getMetStorePage().getViewCartButton().click();
        assertEquals("Subtotal $129.99", metallica.getCartPage().getSubtotalValue().getText());
        metallica.getCartPage().getContinueShoppingButton().click();
        metallica.getMetStorePage().getProductNumberTwo().click();
        metallica.getMetStorePage().getAddToCartButton().click();
        Thread.sleep(1500);
        metallica.getMetStorePage().getViewCartButton().click();
        Thread.sleep(2000);
        assertEquals("Subtotal $146.98", metallica.getCartPage().getSubtotalValue().getText());


    }

    @Test
    public void testCaseMet_012() throws InterruptedException {
        assertTrue(metallica.getHomePage().getCartButton().isEnabled());
        metallica.getHomePage().getCartButton().click();
        Thread.sleep(2000);
        metallica.getCartPage().getViewCartButtonFromCart().click();
        assertEquals("https://www.metallica.com/cart/", Browser.getBrowser().getCurrentUrl());
        metallica.getCartPage().getRadioButton().click();
        Thread.sleep(2000);
        metallica.getCartPage().getEmailFieldRequired().sendKeys("nemanja.jovanovic325@gmail.com");
        metallica.getCartPage().getCheckoutButton().click();
        Thread.sleep(2000);
        assertEquals("https://www.metallica.com/shipping/", Browser.getBrowser().getCurrentUrl());

    }


}