import base.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static helpers.HelperLib.*;

public class SecondUnit5Test extends TestBase {


    @Test
    void loginlogout() {
        driver.get("https://www.edgewordstraining.co.uk/webdriver2/");
        driver.findElement(By.linkText("Login To Restricted Area")).click();
        driver.findElement(By.id("username")).sendKeys("edgewords");
        driver.findElement(By.id("password")).sendKeys("edgewords123");
        driver.findElement(By.linkText("Submit")).click();

        waitHelper(By.linkText("Log Out"), 3, driver);

        driver.findElement(By.linkText("Log Out")).click();
        driver.switchTo().alert().accept();

        waitHelper(By.id("username"), 10, driver);

        driver.findElement(By.id("username")).sendKeys("finished");

    }

}
