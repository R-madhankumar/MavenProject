package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import base.BaseTest;
import dataprovider.LoginDataProvider;

@Listeners(listener.TestListener.class)
public class LoginTest extends BaseTest {

    @Test(dataProvider = "loginData", dataProviderClass = LoginDataProvider.class)
    public void loginTest(String username, String password, String expectedResult) {
 
        driver.findElement(By.xpath("//input[@name='username']")).clear();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);

        driver.findElement(By.xpath("//input[@name='password']")).clear();
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        try {
            if (expectedResult.equals("success")) {

                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                wait.until(ExpectedConditions.urlContains("dashboard"));

                Assert.assertTrue(
                        driver.getCurrentUrl().contains("dashboard"),
                        "Dashboard URL not loaded");

            } else if (expectedResult.equals("error")) {

                Assert.assertTrue(
                        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"))
                                .isDisplayed());

            } else if (expectedResult.equals("validation")) {
                Assert.assertTrue(driver.findElement(By.xpath(
                        "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']"))
                        .isDisplayed());
            }

        } catch (TimeoutException e) {

            Assert.fail("Expected result not achieved: " + expectedResult);
        }

    }
}
