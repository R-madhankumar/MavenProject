package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.HoversPage;

public class FT18_HoversTest extends BaseTest {

    @Test
    public void verifyHovers() {
        try {
            new HoversPage(driver);
        } catch (Exception e) {
            throw new RuntimeException("Hovers test failed");
        }
    }
}
