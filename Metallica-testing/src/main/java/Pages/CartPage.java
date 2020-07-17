package Pages;

import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    private String continueShoppingButton = "//*[@id=\"continue-shopping\"]/fieldset/button";
    private String subtotalValue = "//*[contains(@class,'order-subtotal')]";
    private String removeButton = "//*[@id=\"cart-table\"]/tbody/tr/td[4]/div[2]/button/span";
    private String orderSummary = "//*[@id=\"primary\"]/div[1]/div[1]/h3";
    private String radioButton = "//*[@id=\"guest-checkout\"]";
    private String checkoutButton = "//*[contains(@class,'add-to-cart button button--cta checkout guest-checkout')]";
    private String viewCartButtonFromCart = "//*[@id=\"wrapper\"]/div[2]/div[2]/div[4]/div[3]/a[2]";
    private String emailFieldRequired = "//*[contains(@id,'dwfrm_login_username')]";
    private String shoppingCartEmpty = "//*[@id=\"primary\"]/div[1]/div[2]/div/h1";

    public WebElement getContinueShoppingButton() {
        return findElement(continueShoppingButton);
    }

    public WebElement getSubtotalValue() {
        return findElement(subtotalValue);
    }

    public WebElement getOrderSummary() {
        return findElement(orderSummary);
    }

    public WebElement getRadioButton() {
        return findElement(radioButton);
    }

    public WebElement getCheckoutButton() {
        return findElement(checkoutButton);
    }

    public WebElement getViewCartButtonFromCart() {
        return findElement(viewCartButtonFromCart);
    }

    public WebElement getEmailFieldRequired() {
        return findElement(emailFieldRequired);
    }

    public WebElement getRemoveButton() {
        return findElement(removeButton);
    }

    public WebElement getShoppingCartEmpty() {
        return findElement(shoppingCartEmpty);
    }
}
