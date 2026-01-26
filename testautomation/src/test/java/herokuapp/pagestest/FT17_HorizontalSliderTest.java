package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.HorizontalSliderPage;

public class FT17_HorizontalSliderTest extends BaseTest {

    @Test
    public void verifySlider() {
        try {
            new HorizontalSliderPage(driver);
        } catch (Exception e) {
            throw new RuntimeException("Slider test failed");
        }
    }
}
