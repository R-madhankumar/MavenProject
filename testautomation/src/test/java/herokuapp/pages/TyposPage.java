package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class TyposPage {

    public TyposPage(WebDriver driver) {
        try {
            PageFactory.initElements(driver, this);
            Reporter.log("TyposPage initialized successfully", true);
        } catch (Exception e) {
            Reporter.log("Error initializing TyposPage: " + e.getMessage(), true);
        }
    }
}
