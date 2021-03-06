package base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class TestBase {

    protected WebDriver driver;
    protected StringBuffer verificationerrors = new StringBuffer();
    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @AfterEach
    void tearDown() {
        driver.quit();
        if(verificationerrors.length() > 0) {
            Assert.fail(verificationerrors.toString());
        }
    }

}