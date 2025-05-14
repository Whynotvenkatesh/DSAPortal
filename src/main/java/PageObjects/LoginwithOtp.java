package PageObjects;

import BasePage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class LoginwithOtp  extends BaseClass
{
    WebDriver driver;

    public LoginwithOtp(WebDriver Driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    // Elements

    @FindBy(xpath = "//input[@id='email']")
    WebElement txtUsername;

    @FindBy(xpath = "//button[normalize-space()='Send OTP']")
    WebElement SendOtpbtn;

    @FindBy(xpath = "//input[@id='otp_form_otp']")
    WebElement InputOtpfield;

    @FindBy( xpath = "//button[normalize-space()='Verify OTP']")
    WebElement VerifyOtpbtn;


    public void setTxtUsername(String email)
    {
        txtUsername.sendKeys(email);
    }

    public void setSendOtpbtn()
    {
        SendOtpbtn.click();
    }

    public void setInputOtpfield()
    {
        InputOtpfield.sendKeys("876321");
    }

    public void setVerifyOtpbtn()
    {
        VerifyOtpbtn.click();
    }
}
