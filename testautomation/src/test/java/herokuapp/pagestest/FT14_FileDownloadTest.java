package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.FileDownloadPage;

public class FT14_FileDownloadTest extends BaseTest {

    @Test
    public void verifyFileDownload() {
        try {
            new FileDownloadPage(driver);
        } catch (Exception e) {
            throw new RuntimeException("File Download test failed");
        }
    }
}
