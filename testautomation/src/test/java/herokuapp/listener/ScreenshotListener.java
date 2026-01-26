package herokuapp.listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

import herokuapp.basetest.BaseTest;
import herokuapp.utility.ScreenShotUtil;

public class ScreenshotListener extends BaseTest
        implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        try {
            ScreenShotUtil.capture(
                    driver,
                    result.getName(),
                    "PASSED"
            );
        } catch (Exception e) {
            System.out.println("Screenshot failed on test success");
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        try {
            ScreenShotUtil.capture(
                    driver,
                    result.getName(),
                    "FAILED"
            );
        } catch (Exception e) {
            System.out.println("Screenshot failed on test failure");
        }
    }
}
