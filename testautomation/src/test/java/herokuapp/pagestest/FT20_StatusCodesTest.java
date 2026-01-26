package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.StatusCodesPage;

public class FT20_StatusCodesTest extends BaseTest {

    @Test
    public void verifyStatusCodes() {
        try {
            new StatusCodesPage(driver);
        } catch (Exception e) {
            throw new RuntimeException("Status Codes test failed");
        }
    }
}
