package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.AddRemovePage;

public class FT02_AddRemoveTest extends BaseTest {

    @Test
    public void verifyAddRemove() {
        try {
            AddRemovePage page = new AddRemovePage(driver);
            page.clickAddElement();
            Assert.assertTrue(page.isDeleteDisplayed());
        } catch (Exception e) {
            Assert.fail("Add Remove test failed");
        }
    }
}
