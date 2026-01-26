package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.ContextMenuPage;

public class FT06_ContextMenuTest extends BaseTest {

    @Test
    public void verifyContextMenu() {
        try {
            ContextMenuPage page = new ContextMenuPage(driver);
            page.rightClickBox();
        } catch (Exception e) {
            throw new RuntimeException("Context Menu test failed");
        }
    }
}
