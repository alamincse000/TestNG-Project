package TestRunner;

import Pages.ProductPurchase;
import Setup.Setup;
import org.testng.annotations.Test;

public class ProductPurchaseTestRunner extends Setup {
@Test(Priority = 0 , groups = "purchase")
    public void addCart() throws InterruptedException {
        ProductPurchase purchase = new ProductPurchase(driver);
        driver.get("https://envothemes.com/envo-ecommerce/");
        purchase.selectProduct();

    }
//    ... Groups two test case both case...

    @Test(Priority = 1,enabled = false, groups = {"login","purchase"},description ="Allure Product")
    public void addToCart() throws InterruptedException {
    ProductPurchase purchase = new ProductPurchase(driver);
    purchase.addCart();

    }
}
