package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.DynamicLoadingPage;

public class FT10_DynamicLoadingTest extends BaseTest {

    @Test
    public void verifyDynamicLoading() {
        try {
            DynamicLoadingPage page = new DynamicLoadingPage(driver);
            Assert.assertTrue(page.getTitle().contains("The Internet"));
        } catch (Exception e) {
            Assert.fail("Dynamic Loading test failed");
        }
    }
}
