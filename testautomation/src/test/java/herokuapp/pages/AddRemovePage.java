package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import herokuapp.utility.WaitUtil;

public class AddRemovePage {

    private WebDriver driver;

    public AddRemovePage(WebDriver driver) {
        try {
            this.driver = driver;
            PageFactory.initElements(driver, this);
            Reporter.log("AddRemovePage initialized", true);
        } catch (Exception e) {
            System.out.println("Error initializing AddRemovePage");
        }
    }

    @FindBy(xpath = "//button[text()='Add Element']")
    private WebElement addElementBtn;

    @FindBy(className = "added-manually")
    private WebElement deleteBtn;

    public void clickAddElement() {
        try {
            WaitUtil.waitForClickable(driver, addElementBtn);
            addElementBtn.click();
        } catch (Exception e) {
            System.out.println("Unable to click Add Element button");
        }
    }

    public boolean isDeleteDisplayed() {
        try {
            WaitUtil.waitForVisibility(driver, deleteBtn);
            return deleteBtn.isDisplayed();
        } catch (Exception e) {
            System.out.println("Delete button not displayed");
            return false;
        }
    }
}
