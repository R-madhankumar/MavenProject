package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.log4testng.Logger;

import herokuapp.utility.WaitUtil;

public class FileDownloadPage {

    private static final Logger log = Logger.getLogger(FileDownloadPage.class);
    private WebDriver driver;

    public FileDownloadPage(WebDriver driver) {
        Reporter.log("Initializing FileDownloadPage", true);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "some-file.txt")
    private WebElement sampleFileLink;

    public void clickDownloadFile() {
        try {
            Reporter.log("Clicking file download link", true);
            WaitUtil.waitForClickable(driver, sampleFileLink);
            sampleFileLink.click();
            log.info("File download initiated");
        } catch (Exception e) {
            log.error("Failed to click download file", e);
            throw new RuntimeException("File download failed", e);
        }
    }
    public String getDownloadLink() {
        try {
            String href = sampleFileLink.getAttribute("href");
            Reporter.log("Download link: " + href, true);
            return href;
        } catch (Exception e) {
            log.error("Failed to get download link", e);
            throw new RuntimeException("Unable to fetch download link", e);
        }
    }
}
