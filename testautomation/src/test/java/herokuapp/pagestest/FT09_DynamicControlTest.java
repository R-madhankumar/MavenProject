package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.DynamicControlPage;

public class FT09_DynamicControlTest extends BaseTest {

    @Test
    public void verifyDynamicControl() {
        try {
            DynamicControlPage page = new DynamicControlPage(driver);
            page.clickRemove();
        } catch (Exception e) {
            throw new RuntimeException("Dynamic Control test failed");
        }
    }
}
