package Pages;

import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {

    private String searchResults = "/html[1]/body[1]/div[1]/div[3]/strong[1]/div[3]/div[1]/div[2]"
            + "/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]";
    private String invalidSearch = "//*[@id=\"primary\"]/div[1]/p";
    private String productSearch = "//*[@id=\"486d07e4675a367acd659a38cb\"]/div[1]/a[1]/img";

    public WebElement getSearchResults() {
        return findElement(searchResults);
    }

    public WebElement getInvalidSearch() {
        return findElement(invalidSearch);
    }

    public WebElement getProductSearch() {
        return findElement(productSearch);
    }

}
