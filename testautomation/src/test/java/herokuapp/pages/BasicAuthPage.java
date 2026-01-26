package herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicAuthPage {

    protected WebDriver driver;
    private static final String BASE_URL =
            "https://the-internet.herokuapp.com";

    public BasicAuthPage(WebDriver driver) {
        this.driver = driver;
    }
    public void openBasicAuthPage() {
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }

    public void open(String path) {
        try {
            driver.get(BASE_URL + path);
        } catch (Exception e) {
            System.out.println("Unable to open URL: " + path);
        }
    }

    public String getPageText() {
        return driver.findElement(By.tagName("p")).getText();
    }
}
