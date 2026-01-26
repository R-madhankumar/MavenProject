package herokuapp.constant;
import java.io.File;

public class Constant {

    // URLs
    public static final String BASE_URL =
            "https://the-internet.herokuapp.com";

    // Timeouts
    public static final int EXPLICIT_WAIT = 10;
    public static final int IMPLICIT_WAIT = 10;

    // Screenshot path
    public static final String SCREENSHOT_PATH =
            "./screenshots/";

    // Test data
    public static final String USERNAME = "admin";
    public static final String PASSWORD = "admin";

    // Static block with try-catch (VALID USE)
    static {
        try {
            File dir = new File(SCREENSHOT_PATH);
            if (!dir.exists()) {
                dir.mkdirs();
            }
        } catch (Exception e) {
            System.out.println("Failed to create screenshot directory");
        }
    }

    private Constant() {
        // prevent object creation
    }
}
