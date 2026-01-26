package herokuapp.pagestest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import herokuapp.utility.WaitUtil;

public class BasicAuthPage {

    private WebDriver driver;

    public BasicAuthPage(WebDriver driver) {
        try {
            this.driver = driver;
            driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
            PageFactory.initElements(driver, this);
        } catch (Exception e) {
            System.out.println("Error initializing BasicAuthPage");
        }
    }

    @FindBy(tagName = "p")
    private WebElement successText;

    public String getPageText() {
        try {
            WaitUtil.waitForVisibility(driver, successText);
            return successText.getText();
        } catch (Exception e) {
            return "";
        }
    }
}
