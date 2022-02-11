package poms;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {

    WebDriver driver;

    public LoginPOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Locators
    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(linkText = "Submit")
    private WebElement submitLoginForm;

    //Service Methods
    public void setUsername(String username){
        usernameField.clear();
        usernameField.sendKeys(username);
    }
    public void setPassword(String password){
        passwordField.clear();
        passwordField.sendKeys(password);
    }
    public void submitLoginForm(){
        submitLoginForm.click();
    }

    public boolean LoginExpectSuccess(String username, String password) throws InterruptedException {
        setUsername(username);
        setPassword(password);
        submitLoginForm();
        Thread.sleep(3000);
        String bodyText = driver.findElement(By.tagName("body")).getText();
        boolean loggedIn = bodyText.contains("User is Logged in");
        return loggedIn;

    }
}
