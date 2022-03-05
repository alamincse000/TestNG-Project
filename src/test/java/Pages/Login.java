package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// ...Login options ...
public class Login {
    WebDriver driver;
    @FindBy(className = "login")
    WebElement linkLogin;
    @FindBy(id = "email")
    WebElement txtEmail;
    @FindBy(id = "passwd")
    WebElement txtPassword;
    @FindBy(id = "SubmitLogin")
    WebElement btnSubmitLogin;
    @FindBy(xpath = "//span[contains(text(),'X E')]")
    WebElement lblUserName;
    @FindBy (xpath = "// li[contains(text(),'Invalid email address')])")
    WebElement lblUserInvalidEmail;
    @FindBy(xpath = "//li[contains(text(),'Invalid Authentications error')]")
    WebElement lblUserAuthError;

    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    public String doLogin(String email, String password){
        linkLogin.click();
        txtEmail.sendKeys(email);
        txtPassword.sendKeys(password);
        btnSubmitLogin.click();
        return lblUserName.getText();
    }
    public String invalidUserEmail(String email, String password){
        linkLogin.click();
        txtEmail.sendKeys(email);
        txtPassword.sendKeys(password);
        btnSubmitLogin.click();
        return lblUserInvalidEmail.getText();
    }
    public String lblUserAutError(String email, String password){
        linkLogin.click();
        txtEmail.sendKeys(email);
        txtPassword.sendKeys(password);
        btnSubmitLogin.click();
        return lblUserAuthError.getText();
    }
}
