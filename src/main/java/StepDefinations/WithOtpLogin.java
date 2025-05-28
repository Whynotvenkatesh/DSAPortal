package StepDefinations;

import BasePage.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WithOtpLogin extends BaseClass
{
    @Given("the user navigates to login page")
    public void the_user_navigates_to_login_page()
    {
        BaseClass.launchdriver();
    }
    @When("user enters email as {string}")
    public void user_enters_email_as (String Email)
    {
        LoginWithOtp.setUserEmail(Email);
    }

    @Then("user click_Send_Button")
    public void user_click_send_button() {
        LoginWithOtp.setSendBtn();
    }



    @Then("user_click_EnterOtp_Button")
    public void user_click_SendOtp_button ()
    {
        LoginWithOtp.setEnterOtp();
    }

    @Then("the user clicks on the Login button")
    public void the_user_clicks_on_the_login_button ()
    {
        LoginWithOtp.setVerifyOtpbtn();
    }

}

