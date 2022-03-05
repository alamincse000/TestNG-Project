package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ProductPurchase {
    WebDriverWait wait;
    WebDriver driver;
    @FindBy(css = "img")
    List<WebElement> imgProduct;
    @FindBy(name = "add-to-cart")
    WebElement addToCart;
    @FindBy(xpath = "//a[contains (text(),'View cart')]")
    List<WebElement> viewClick;
    @FindBy(xpath = "//a[contains(text(),'Proceed to checkout')]")
    WebElement proceedCheckOut;
    @FindBy(name = "P")
    WebElement dropDown;
    @FindBy(className = "fa fa-search")
    WebElement search;

    public ProductPurchase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void selectProduct() throws InterruptedException {
        imgProduct.get(2).click();
        Thread.sleep(2000);
        addToCart.click();
        Select select = new Select(dropDown);
        select.selectByIndex(2);
        search.click();
        imgProduct.get(2).click();

//        Explicity process
//        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
//        wait.until(ExpectedConditions.elementToBeClickable((By) viewClick));

    }
    public void addCart() throws InterruptedException {
        addToCart.click();
        Thread.sleep(3000);
        viewClick.get(2).click();
        proceedCheckOut.click();
    }
}
