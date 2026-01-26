package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class StatusCodesPage {

    public StatusCodesPage(WebDriver driver) {
        try {
            PageFactory.initElements(driver, this);
            Reporter.log("StatusCodesPage initialized successfully", true);
        } catch (Exception e) {
            Reporter.log("Error initializing StatusCodesPage: " + e.getMessage(), true);
        }
    }
}
