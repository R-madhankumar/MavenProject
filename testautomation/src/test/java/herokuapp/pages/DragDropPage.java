package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DragDropPage {

    private WebDriver driver;

    public DragDropPage(WebDriver driver) {
        Reporter.log("Initializing DragDrop Page", true);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "column-a")
    private WebElement source;

    @FindBy(id = "column-b")
    private WebElement target;

    public void dragAndDrop() {
        try {
            Actions act = new Actions(driver);
            act.dragAndDrop(source, target).perform();
            Reporter.log("Drag and drop performed successfully", true);
        } catch (Exception e) {
            Reporter.log("Error during drag and drop: " + e.getMessage(), true);
        }
    }
}
