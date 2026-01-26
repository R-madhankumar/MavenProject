package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ContextMenuPage {

    private WebDriver driver;

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "hot-spot")
    private WebElement box;

    public void rightClickBox() {
        try {
            new Actions(driver).contextClick(box).perform();
            Reporter.log("Right click performed on context menu box", true);
        } catch (Exception e) {
            Reporter.log("Error while performing right click: " + e.getMessage(), true);
        }
    }
}
