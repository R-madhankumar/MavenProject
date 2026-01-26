package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class FloatingMenuPage {

    public FloatingMenuPage(WebDriver driver) {
        try {
            PageFactory.initElements(driver, this);
            Reporter.log("FloatingMenuPage initialized successfully", true);
        } catch (Exception e) {
            Reporter.log("Error initializing FloatingMenuPage: " + e.getMessage(), true);
        }
    }
}
