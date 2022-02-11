import base.TestBase;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import poms.HomePOM;
import poms.LoginPOM;

public class LoginUsingPom extends TestBase {

    @ParameterizedTest
    @CsvFileSource(files = "test-data.csv", useHeadersInDisplayName = true)
    void Login(String username, String password) throws InterruptedException {
        driver.get("https://www.edgewordstraining.co.uk/webdriver2/");
                HomePOM homepage = new HomePOM(driver);
                homepage.goLogin();

                LoginPOM loginpage = new LoginPOM(driver);
//                loginpage.setUsername("edgewords");
//                loginpage.setPassword("edgewords123");
//                loginpage.submitLoginForm();
                Assert.assertTrue(loginpage.LoginExpectSuccess(username, password));

                Thread.sleep(3000);
    }
}
