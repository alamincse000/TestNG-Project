package TestRunner;

import Pages.Login;
import Setup.Setup;
import Utils.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RunnerTest extends Setup {
    @Test
    public void doUserLogin() throws Exception {
        driver.get("http://automationpractice.com/");
        Login login = new Login(driver);
        Utils utils = new Utils(driver);
        utils.readJSONArray(0);
        String userName = login.doLogin(utils.getEmail(), utils.getPassword());
        Assert.assertTrue(userName.contains("X,E"));

    }
    @Test
    public void doUserInvalidEmail() throws Exception {
        driver.get("http://automationpractice.com/");
        Login login = new Login(driver);
        Utils utils = new Utils(driver);
        utils.readJSONArray(1);
        String userName = login.invalidUserEmail(utils.getEmail(), utils.getPassword());
        Assert.assertTrue(userName.contains("Invalid email address"));

    }
    @Test
    public void doUserInvalidAuthError() throws Exception {
        driver.get("http://automationpractice.com/");
        Login login = new Login(driver);
        Utils utils = new Utils(driver);
        utils.readJSONArray(2);
        String userName = login.lblUserAutError(utils.getEmail(), utils.getPassword());
        Assert.assertTrue(userName.contains("Authentic Error"));

    }

}

