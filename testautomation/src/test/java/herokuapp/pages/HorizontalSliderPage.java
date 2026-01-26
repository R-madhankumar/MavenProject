package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HorizontalSliderPage {
    public HorizontalSliderPage(WebDriver driver) {
        try {
            PageFactory.initElements(driver, this);
            Reporter.log("HorizontalSliderPage initialized successfully", true);
        } catch (Exception e) {
            Reporter.log("Error initializing HorizontalSliderPage: " + e.getMessage(), true);
        }
    }
}
