package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.InfiniteScrollPage;

public class FT19_InfiniteScrollTest extends BaseTest {

    @Test
    public void verifyInfiniteScroll() {
        try {
            new InfiniteScrollPage(driver);
        } catch (Exception e) {
            throw new RuntimeException("Infinite Scroll test failed");
        }
    }
}
