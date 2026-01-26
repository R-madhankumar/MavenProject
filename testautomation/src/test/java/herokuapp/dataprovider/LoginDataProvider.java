package herokuapp.dataprovider;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        try {
            return new Object[][]{
                {"Admin", "admin123", "success"},
                {"Admin", "Wrongpass", "error"},
                {"wrongAdmin", "admin123", "error"},
                {"wrongadmin", "wrongpass", "error"},
                {"", "admin123", "validation"},
                {"Admin", "", "validation"},
                {"", "", "validation"}
            };
        } catch (Exception e) {
            System.err.println("Error occurred while preparing login data");
            e.printStackTrace();
            return new Object[0][0]; // prevents TestNG crash
        }
    }
}
