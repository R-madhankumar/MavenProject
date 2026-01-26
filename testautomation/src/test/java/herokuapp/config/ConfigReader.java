package herokuapp.config;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop;

    public Properties initProp() {
        prop = new Properties();
        try {
            FileInputStream ip =
                    new FileInputStream("src/test/resources/config.properties");
            prop.load(ip);
        } catch (Exception e) {
            System.err.println("Failed to load config.properties file");
            e.printStackTrace();
            throw new RuntimeException("Config loading failed", e);
        }
        return prop;
    }

    public static String get(String key) {
        if (prop == null) {
            throw new RuntimeException("Properties not initialized. Call initProp() first.");
        }
        return prop.getProperty(key);
    }
}
