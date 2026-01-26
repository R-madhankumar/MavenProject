package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.DragDropPage;

public class FT07_DragDropTest extends BaseTest {

    @Test
    public void verifyDragDrop() {
        try {
            DragDropPage page = new DragDropPage(driver);
            page.dragAndDrop();
        } catch (Exception e) {
            throw new RuntimeException("Drag Drop test failed");
        }
    }
}
