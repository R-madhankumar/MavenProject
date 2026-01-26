package herokuapp.utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import herokuapp.constant.Constant;

public class ScreenShotUtil {

    public static void capture(WebDriver driver, String testName, String status) {
        try {
            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss")
                    .format(new Date());
            String fileName = testName + "_" + status + "_" + timeStamp + ".png";


            File src = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);

            File dest = new File(Constant.SCREENSHOT_PATH + fileName);

            src.renameTo(dest);

        } catch (Exception e) {
            System.out.println("Screenshot capture failed");
        }
    }
}
