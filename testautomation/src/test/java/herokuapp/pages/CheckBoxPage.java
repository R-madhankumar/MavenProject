package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import herokuapp.utility.WaitUtil;

public class CheckBoxPage {

    private WebDriver driver;

    public CheckBoxPage(WebDriver driver) {
        Reporter.log("Initializing CheckBox Page", true);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    private WebElement checkbox1;

    public void clickCheckBox() {
        try {
            WaitUtil.waitForClickable(driver, checkbox1);
            checkbox1.click();
        } catch (Exception e) {
            Reporter.log("Error while clicking checkbox: " + e.getMessage(), true);
        }
    }

    public boolean isSelected() {
        try {
            return checkbox1.isSelected();
        } catch (Exception e) {
            Reporter.log("Error while checking checkbox status: " + e.getMessage(), true);
            return false;
        }
    }

    public void selectCheckbox() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectCheckbox'");
    }
}
