package Pages;

import org.openqa.selenium.WebElement;


public class MetStorePage extends BasePage {

    private String addToCartButton = "//*[@id=\"add-to-cart\"]";
    private String largeButton = "//*[@id=\"product-content\"]/div[3]/ul/li/div[2]/ul/li[3]/a";
    private String viewCartButton = "//*[@id=\"wrapper\"]/div[2]/div[2]/div[4]/div/div[3]/a[2]";
    private String productNumberOne = "//*[@id=\"795f264f5d649633301b267399\"]/div[1]/a/img";
    private String productNumberTwo = "//*[@id=\"25ec8af76d396227cc093b845b\"]/div[1]/a/img";


    public WebElement getAddToCartButton() {
        return findElement(addToCartButton);
    }

    public WebElement getLargeButton() {
        return findElement(largeButton);
    }

    public WebElement getViewCartButton() {
        return findElement(viewCartButton);
    }


    public WebElement getProductNumberOne() {
        return findElement(productNumberOne);
    }

    public WebElement getProductNumberTwo() {
        return findElement(productNumberTwo);
    }


}



