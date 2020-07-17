package Pages;

import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private String acceptCookies = "/html/body/div[2]/div[3]/div/button[1]/span";
    private String loginButton = "//*[@id=\"wrapper\"]/div[2]/div[2]/div[1]/a/span";
    private String userAvatar = "//*[@id=\"wrapper\"]/div[2]/div[2]/div[1]/a";
    private String searchButton = "//*[@id=\"wrapper\"]/div[2]/div[2]/div[1]/button[2]/span";
    private String closeButton = "//body/div[@id='wrapper']/div[@class='top-banner']/div[@class='header']/"
            + "div[@id='search-wrapper']/a[@class='search-close']/span[1]";
    private String searchFormButton = "//*[contains(@class, \"svg-search-dims\")]";
    private String searchField = "//*[@id=\"q\"]";
    private String metStoreButton = "//*[@id=\"wrapper\"]/div[2]/div[2]/div[5]/a";
    private String cartButton = "//*[@id=\"wrapper\"]/div[2]/div[2]/div[5]/div[2]/div[1]/a/span[2]";
    private String cartIcon = "//*[@id=\"wrapper\"]/div[2]/div[2]/div[5]/div[2]/div/a";


    public WebElement getAcceptCookies() {
        return findElement(acceptCookies);
    }

    public WebElement getLoginButton() {
        return findElement(loginButton);
    }

    public WebElement getUserAvatar() {
        return findElement(userAvatar);
    }

    public WebElement getSearchButton() {
        return findElement(searchButton);
    }

    public WebElement getSearchIcon() {
        return findElement(searchButton);
    }

    public WebElement getSearchFormButton() {
        return findElement(searchFormButton);
    }

    public WebElement getCloseButton() {
        return findElement(closeButton);
    }

    public WebElement getSearchField() {
        return findElement(searchField);
    }

    public WebElement getMetStoreButton() {
        return findElement(metStoreButton);
    }

    public WebElement getCartButton() {
        return findElement(cartButton);
    }


}
