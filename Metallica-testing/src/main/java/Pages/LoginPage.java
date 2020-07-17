package Pages;

import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private String emailField = "//*[contains(@name,'username')]";
    private String passwordField = "//*[contains(@name,'password')]";
    private String loginFormButton = "//*[@id=\"dwfrm_login\"]/fieldset/div[3]/button";
    private String accountButton = "//*[@id=\"wrapper\"]/div[2]/div[2]/div[1]/a/span";
    private String logoutButton = "//*[@id=\"user-account-wrapper\"]/ul/li/div/ul/li[6]/a";
    private String accountOverview = "//*[@id=\"primary\"]/div[1]/div/div[1]/div/h1";
    private String errorMessage = "//*[@id=\"dwfrm_login\"]/div[2]";
    private String downloadMyDataButton = "//*[@id=\"primary\"]/div[3]/div/a";


    public WebElement getEmailField() {
        return findElement(emailField);
    }

    public WebElement getPasswordField() {
        return findElement(passwordField);
    }

    public WebElement getLoginFormButton() {
        return findElement(loginFormButton);
    }

    public WebElement getAccountButton() {
        return findElement(accountButton);
    }

    public WebElement getLogOutButton() {
        return findElement(logoutButton);
    }

    public WebElement getAccountOverview() {
        return findElement(accountOverview);
    }

    public WebElement getErrorMessage() {
        return findElement(errorMessage);
    }

    public WebElement getDownloadMyDataButton() {
        return findElement(downloadMyDataButton);
    }


}
