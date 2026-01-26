package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.FloatingMenuPage;

public class FT15_FloatingMenuTest extends BaseTest {

    @Test
    public void verifyFloatingMenu() {
        try {
            new FloatingMenuPage(driver);
        } catch (Exception e) {
            throw new RuntimeException("Floating Menu test failed");
        }
    }
}
