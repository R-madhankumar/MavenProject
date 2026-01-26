package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class EntryAdPage {

    public EntryAdPage(WebDriver driver) {
        try {
            PageFactory.initElements(driver, this);
            Reporter.log("EntryAdPage initialized successfully", true);
        } catch (Exception e) {
            Reporter.log("Error initializing EntryAdPage: " + e.getMessage(), true);
        }
    }
}
