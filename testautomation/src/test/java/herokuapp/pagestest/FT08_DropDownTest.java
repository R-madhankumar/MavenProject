package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.DropDownPage;

public class FT08_DropDownTest extends BaseTest {

    @Test
    public void verifyDropdown() {
        try {
            DropDownPage page = new DropDownPage(driver);
            page.selectOption();
            Assert.assertTrue(page.isOptionSelected());
        } catch (Exception e) {
            Assert.fail("Dropdown test failed");
        }
    }
}
