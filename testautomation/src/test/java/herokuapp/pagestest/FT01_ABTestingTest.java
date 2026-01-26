package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.ABTestingPage;

public class FT01_ABTestingTest extends BaseTest {

    @Test
    public void verifyABTestingPage() {
        try {
            ABTestingPage page = new ABTestingPage(driver);
            Assert.assertTrue(page.getHeadingText().length() > 0);
        } catch (Exception e) {
            Assert.fail("AB Testing test failed");
        }
    }
}
