package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.BrokenImagePage;

public class FT04_BrokenImageTest extends BaseTest {

    @Test
    public void verifyBrokenImagePage() {
        try {
            BrokenImagePage page = new BrokenImagePage(driver);
            Assert.assertTrue(page.getTitle().contains("The Internet"));
        } catch (Exception e) {
            Assert.fail("Broken Image test failed");
        }
    }
}
