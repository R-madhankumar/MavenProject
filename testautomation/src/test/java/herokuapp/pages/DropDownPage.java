package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import herokuapp.utility.WaitUtil;

public class DropDownPage {

    private WebDriver driver;

    public DropDownPage(WebDriver driver) {
        Reporter.log("Initializing DropDown Page", true);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "dropdown")
    private WebElement dropdown;

    public void selectByValue(String value) {
        try {
            WaitUtil.waitForVisibility(driver, dropdown);
            Select select = new Select(dropdown);
            select.selectByValue(value);
            Reporter.log("Dropdown value selected: " + value, true);
        } catch (Exception e) {
            Reporter.log("Error selecting dropdown value: " + e.getMessage(), true);
        }
    }

    public String getSelectedText() {
        try {
            Select select = new Select(dropdown);
            return select.getFirstSelectedOption().getText();
        } catch (Exception e) {
            Reporter.log("Error getting selected dropdown text: " + e.getMessage(), true);
            return null;
        }
    }

    public void selectOption() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectOption'");
    }

    public boolean isOptionSelected() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isOptionSelected'");
    }
}
