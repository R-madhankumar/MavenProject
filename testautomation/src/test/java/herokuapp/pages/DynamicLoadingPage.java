package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DynamicLoadingPage {

    private WebDriver driver;

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        try {
            return driver.getTitle();
        } catch (Exception e) {
            Reporter.log("Error while getting page title: " + e.getMessage(), true);
            return null;
        }
    }
}
