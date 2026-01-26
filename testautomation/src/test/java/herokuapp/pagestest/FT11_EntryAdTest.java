package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.EntryAdPage;

public class FT11_EntryAdTest extends BaseTest {

    @Test
    public void verifyEntryAd() {
        try {
            new EntryAdPage(driver);
        } catch (Exception e) {
            throw new RuntimeException("Entry Ad test failed");
        }
    }
}
