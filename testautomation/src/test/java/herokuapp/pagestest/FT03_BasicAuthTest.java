package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.pages.BasicAuthPage;

public class FT03_BasicAuthTest extends BaseTest {

    @Test
    public void verifyBasicAuth() {
        try {
            
            BasicAuthPage page = new BasicAuthPage(driver);
            page.openBasicAuthPage();
            String text = page.getPageText();
            Assert.assertTrue(
                    text.contains("Congratulations"),
                    "Basic Auth success message not found"
            );

        } catch (Exception e) {
            Assert.fail("FT03 Basic Auth test failed due to exception: " + e.getMessage());
        }
    }
}
