package Pages;

public class Metallica {

    private HomePage homePage;
    private LoginPage loginPage;
    private SearchPage searchPage;
    private MetStorePage metStorePage;
    private CartPage cartPage;

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public SearchPage getSearchPage() {
        if (searchPage == null) {
            searchPage = new SearchPage();
        }
        return searchPage;
    }

    public MetStorePage getMetStorePage() {
        if (metStorePage == null) {
            metStorePage = new MetStorePage();
        }
        return metStorePage;
    }

    public CartPage getCartPage() {
        if (cartPage == null) {
            cartPage = new CartPage();
        }
        return cartPage;
    }
}


