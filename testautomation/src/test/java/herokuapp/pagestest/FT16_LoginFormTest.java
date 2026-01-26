package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.LoginFormPage;

public class FT16_LoginFormTest extends BaseTest {

    @Test
    public void verifyLoginForm() {
        try {
            LoginFormPage page = new LoginFormPage(driver);
            page.login("tomsmith", "SuperSecretPassword!");
        } catch (Exception e) {
            throw new RuntimeException("Login Form test failed");
        }
    }
}
