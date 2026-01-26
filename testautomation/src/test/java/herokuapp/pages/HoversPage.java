package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HoversPage {


    public HoversPage(WebDriver driver) {
        try {
            PageFactory.initElements(driver, this);
            Reporter.log("HoversPage initialized successfully", true);
        } catch (Exception e) {
            Reporter.log("Error initializing HoversPage: " + e.getMessage(), true);
        }
    }
}
