package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.CheckBoxPage;

public class FT05_CheckBoxTest extends BaseTest {

    @Test
    public void verifyCheckbox() {
        try {
            CheckBoxPage page = new CheckBoxPage(driver);
            page.selectCheckbox();
            Assert.assertTrue(page.isSelected());
        } catch (Exception e) {
            Assert.fail("Checkbox test failed");
        }
    }
}
