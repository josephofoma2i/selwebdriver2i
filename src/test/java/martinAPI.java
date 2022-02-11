import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class martinAPI {

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
    public void martinAPI() {
        driver.get("http://localhost:3000/");
        driver.manage().window().setSize(new Dimension(945, 1020));
        driver.findElement(By.id("select-key-drop-basic")).click();
        {
            WebElement dropdown = driver.findElement(By.id("select-key-drop-basic"));
            dropdown.findElement(By.xpath("//option[. = 'First Name']")).click();
        }
        driver.findElement(By.id("btn-add-prop")).click();
        driver.findElement(By.id("select-key-drop-basic")).click();
        {
            WebElement dropdown = driver.findElement(By.id("select-key-drop-basic"));
            dropdown.findElement(By.xpath("//option[. = 'Last Name']")).click();
        }
        driver.findElement(By.id("btn-add-prop")).click();
        driver.findElement(By.id("select-key-drop-basic")).click();
        {
            WebElement dropdown = driver.findElement(By.id("select-key-drop-basic"));
            dropdown.findElement(By.xpath("//option[. = 'Email']")).click();
        }
        driver.findElement(By.id("btn-add-prop")).click();
        driver.findElement(By.id("custom-input")).click();
        driver.findElement(By.id("custom-input")).sendKeys("nickName");
        driver.findElement(By.id("value-select-custom")).click();
        {
            WebElement dropdown = driver.findElement(By.id("value-select-custom"));
            dropdown.findElement(By.xpath("//option[. = 'First Name']")).click();
        }
        driver.findElement(By.id("btn-add-custom")).click();
        driver.findElement(By.id("btn-gen-data")).click();
        driver.findElement(By.id("btn-error-confirm")).click();
    }
}