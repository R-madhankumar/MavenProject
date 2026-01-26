package herokuapp.utility;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {

    private static final int TIMEOUT = 10;

    public static void waitForVisibility(WebDriver driver, WebElement element) {
        WebDriverWait wait = getWait(driver);
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException e) {
            throw new RuntimeException("Element not visible within " + TIMEOUT + " seconds", e);
        }
    }

    public static void waitForClickable(WebDriver driver, WebElement element) {
        WebDriverWait wait = getWait(driver);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (TimeoutException e) {
            throw new RuntimeException("Element not clickable within " + TIMEOUT + " seconds", e);
        }
    }

    private static WebDriverWait getWait(WebDriver driver) {
        if (driver == null) {
            throw new IllegalArgumentException("WebDriver is null");
        }
        return new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
    }
}
