package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class FileUploadPage {
    public FileUploadPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "file-upload")
    private WebElement upload;

    @FindBy(id = "file-submit")
    private WebElement submit;

    public void uploadFile(String path) {
        try {
            upload.sendKeys(path);
            submit.click();
            Reporter.log("File uploaded successfully: " + path, true);
        } catch (Exception e) {
            Reporter.log("Error during file upload: " + e.getMessage(), true);
        }
    }
}
