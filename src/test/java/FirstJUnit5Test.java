import base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.is;

public class FirstJUnit5Test extends TestBase {



    @Test
    void FirstTest(){

        driver.get("https://www.edgewordstraining.co.uk/webdriver2/");
        driver.findElement(By.linkText("Login To Restricted Area")).click();

        //driver.close();
        driver.quit();
    }

    @Test
    void SecondTest() {
        // Test name: edgewordsDemo
        // Step # | name | target | value
        // 1 | open | /webdriver2/ |
        driver.get("https://www.edgewordstraining.co.uk/webdriver2/");
        // 2 | setWindowSize | 945x1020 |
        driver.manage().window().setSize(new Dimension(945, 1020));
        // 3 | click | css=.last span |
        driver.findElement(By.cssSelector(".last span")).click();
        // 4 | click | linkText=Forms |
        driver.findElement(By.linkText("Forms")).click();
        // 5 | click | id=textInput |
        driver.findElement(By.id("textInput")).click();
        // 6 | type | id=textInput | joseph ofoma
        driver.findElement(By.id("textInput")).sendKeys("joseph ofoma");
        // 7 | click | id=textArea |
        driver.findElement(By.id("textArea")).click();
        // 8 | type | id=textArea | was here
        driver.findElement(By.id("textArea")).sendKeys("was here");
        // 9 | click | id=select |
        driver.findElement(By.id("select")).click();
        // 10 | select | id=select | label=Selection Two
        {
            WebElement dropdown = driver.findElement(By.id("select"));
            dropdown.findElement(By.xpath("//option[. = 'Selection Two']")).click();
        }
        // 11 | click | linkText=Submit |
        driver.findElement(By.linkText("Submit")).click();
        // 12 | click | id=formResults |
        driver.findElement(By.id("formResults")).click();
        // 13 | click | id=formResults |
        driver.findElement(By.id("formResults")).click();
        // 14 | click | css=tr:nth-child(2) > td:nth-child(3) |
        driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(3)")).click();
        // 15 | verifyText | id=textInputValue | joseph ofoma
        assertThat(driver.findElement(By.id("textInputValue")).getText(), is("joseph ofoma"));
        // 16 | click | css=tr:nth-child(3) > td:nth-child(3) |
        driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(3)")).click();
        // 17 | assertText | id=textAreaValue | was here
        try {
            assertThat(driver.findElement(By.id("textAreaValue")).getText(), is("was here"));
        } catch (AssertionError e) {
            System.out.println(e.toString());
            verificationerrors.append(e.toString());
        }
        // 18 | click | linkText=Back to form |
        driver.findElement(By.linkText("Back to form")).click();
        // 19 | click | linkText=Home |
        driver.findElement(By.linkText("Home")).click();
        // 20 | click | css=html |
        driver.findElement(By.cssSelector("html")).click();
    }
}

