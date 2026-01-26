package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.TyposPage;

public class FT12_TyposTest extends BaseTest {

    @Test
    public void verifyTypos() {
        try {
            new TyposPage(driver);
        } catch (Exception e) {
            throw new RuntimeException("Typos test failed");
        }
    }
}
