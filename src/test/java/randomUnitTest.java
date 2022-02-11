import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.is;

public class randomUnitTest{

    WebDriver driver;

    @BeforeEach
    void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterEach
    void tearDown(){
        driver.quit();
    }

    @Test
    void automationPage(){
        // Test name: 2iAutomationPage
        // Step # | name | target | value
        // 1 | open | / |
        driver.get("https://2itesting.com/");
        // 2 | setWindowSize | 945x1020 |
        driver.manage().window().setSize(new Dimension(945, 1020));
        // 3 | click | css=.icon-gecko-show-lines |
        driver.findElement(By.cssSelector(".icon-gecko-show-lines")).click();
        // 4 | verifyText | css=ul:nth-child(2) > li:nth-child(1) .text:nth-child(2) > .title | Test Automation
        assertThat(driver.findElement(By.cssSelector("ul:nth-child(2) > li:nth-child(1) .text:nth-child(2) > .title")).getText(), is("Test Automation"));
        // 5 | click | css=ul:nth-child(2) > li:nth-child(1) .text:nth-child(2) > .title |
        driver.findElement(By.cssSelector("ul:nth-child(2) > li:nth-child(1) .text:nth-child(2) > .title")).click();
        // 6 | verifyText | css=.btn:nth-child(3) | CONTACT
        assertThat(driver.findElement(By.cssSelector(".btn:nth-child(3)")).getText(), is("CONTACT"));
        // 7 | click | css=.btn:nth-child(3) |
        driver.findElement(By.cssSelector(".btn:nth-child(3)")).click();
        // 8 | click | id=1652908b-0cf5-493e-8b80-f18c4e60a917 |
        driver.findElement(By.id("1652908b-0cf5-493e-8b80-f18c4e60a917")).click();
        // 9 | click | css=.icon-logo |
        driver.findElement(By.cssSelector(".icon-logo")).click();
    }
}
