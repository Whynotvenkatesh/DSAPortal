package PageObjects;

import BasePage.BaseClass;
import BasePage.Basepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class LoginPage extends BaseClass {
    WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    // Elements

    @FindBy(xpath = "//input[@id='email']")
    WebElement txtUsername;

    @FindBy(xpath = "//input[@id='password']")
    WebElement txtPassword;

    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    WebElement btnLogin;


    // Methods

    public void SetuserName(String username) {
        // Wait until the username field is visible and interactable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(txtUsername));
        txtUsername.sendKeys(username);

    }

    public void setPassword(String password) {
        // Wait until the password field is visible and interactable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(txtPassword));
        txtPassword.sendKeys(password);
    }

    public void setLoginbtn() {
        // Wait until the login button is visible and clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
        btnLogin.click();
    }
}
