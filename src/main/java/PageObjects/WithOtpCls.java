package PageObjects;

import BasePage.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WithOtpCls extends BaseClass
{
    WebDriver driver;

public WithOtpCls(WebDriver driver)
{
    this.driver=driver;
    PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//input[@id='email']")
WebElement userEmail;

    @FindBy(xpath ="//button[normalize-space()='Send OTP']")
    WebElement SendBtn;


@FindBy(xpath = "//input[@id='otp_form_otp']")
WebElement EnterOtp;

@FindBy(xpath = "//button[normalize-space()='Verify OTP']")
WebElement VerifyOtpbtn;


public void setUserEmail(String Email)
{
    userEmail.sendKeys(Email);
}

    public void setSendBtn()
    {
        SendBtn.click();
    }

public void setEnterOtp()
{
    EnterOtp.sendKeys("876321");
}

public void setVerifyOtpbtn()
{
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(VerifyOtpbtn)).click();
    //VerifyOtpbtn.click();
}
}





