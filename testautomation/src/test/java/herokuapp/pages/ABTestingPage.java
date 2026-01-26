package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import herokuapp.utility.WaitUtil;

public class ABTestingPage {

    private WebDriver driver;

    public ABTestingPage(WebDriver driver) {
        try {
            this.driver = driver;
            PageFactory.initElements(driver, this);
            Reporter.log("ABTestingPage initialized", true);
        } catch (Exception e) {
            System.out.println("Error initializing ABTestingPage");
        }
    }

    @FindBy(tagName = "h3")
    private WebElement heading;

    public String getHeadingText() {
        try {
            WaitUtil.waitForVisibility(driver, heading);
            return heading.getText();
        } catch (Exception e) {
            System.out.println("Unable to fetch AB Testing heading");
            return "";
        }
    }
}
