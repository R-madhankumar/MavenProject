package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class InfiniteScrollPage {


    public InfiniteScrollPage(WebDriver driver) {
        try {
            PageFactory.initElements(driver, this);
            Reporter.log("InfiniteScrollPage initialized successfully", true);
        } catch (Exception e) {
            Reporter.log("Error initializing InfiniteScrollPage: " + e.getMessage(), true);
        }
    }
}
