package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import herokuapp.utility.WaitUtil;

public class DynamicControlPage {

    private WebDriver driver;

    public DynamicControlPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text()='Remove']")
    private WebElement removeBtn;

    public void clickRemove() {
        try {
            WaitUtil.waitForClickable(driver, removeBtn);
            removeBtn.click();
            Reporter.log("Remove button clicked successfully", true);
        } catch (Exception e) {
            Reporter.log("Error while clicking Remove button: " + e.getMessage(), true);
        }
    }
}
