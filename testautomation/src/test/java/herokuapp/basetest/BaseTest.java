package herokuapp.basetest;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import herokuapp.config.ConfigReader;
import herokuapp.driver.DriverFactory;

public class BaseTest {

    protected static WebDriver driver;
    Properties prop;

    @BeforeMethod
    @Parameters("browser")
    public void setUp(String browser) {
        try {
            ConfigReader cr = new ConfigReader();
            prop = cr.initProp();

            DriverFactory.initDriver(browser);
            driver = DriverFactory.getDriver();

            driver.manage().window().maximize();
            driver.get(prop.getProperty("url"));

        } catch (Exception e) {
            System.err.println("Exception occurred during test setup");
            e.printStackTrace();
            throw new RuntimeException("Test setup failed", e);
        }
    }

    @AfterMethod
    public void tearDown() {
        try {
            DriverFactory.quitDriver();
        } catch (Exception e) {
            System.err.println("Exception occurred during driver teardown");
            e.printStackTrace();
        }
    }
}
