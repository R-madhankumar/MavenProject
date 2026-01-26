package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.FileUploadPage;

public class FT13_FileUploadTest extends BaseTest {

    @Test
    public void verifyFileUpload() {
        try {
            FileUploadPage page = new FileUploadPage(driver);
            page.uploadFile("C:\\test.txt");
        } catch (Exception e) {
            throw new RuntimeException("File Upload test failed");
        }
    }
}
