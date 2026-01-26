package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import herokuapp.utility.WaitUtil;

public class LoginFormPage {

    private WebDriver driver;

    public LoginFormPage(WebDriver driver) {
        Reporter.log("Initializing LoginForm Page", true);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(css = "button[type='submit']")
    private WebElement loginBtn;

    public void login(String user, String pass) {
        try {
            WaitUtil.waitForVisibility(driver, username);
            username.sendKeys(user);
            password.sendKeys(pass);
            loginBtn.click();
            Reporter.log("Login attempted with username: " + user, true);
        } catch (Exception e) {
            Reporter.log("Error during login: " + e.getMessage(), true);
        }
    }
}
