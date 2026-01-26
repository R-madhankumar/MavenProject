package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BrokenImagePage {

    private WebDriver driver;

    public BrokenImagePage(WebDriver driver) {
        try {
            this.driver = driver;
            PageFactory.initElements(driver, this);
            Reporter.log("BrokenImagePage initialized", true);
        } catch (Exception e) {
            System.out.println("Error initializing BrokenImagePage");
        }
    }

    public String getTitle() {
        try {
            return driver.getTitle();
        } catch (Exception e) {
            System.out.println("Unable to get page title");
            return "";
        }
    }
}
