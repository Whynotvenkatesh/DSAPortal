package StepDefinations;

import BasePage.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs extends BaseClass {

        @Given("the user navigates to loginhomepage")
        public void user_navigate_loginhomepage()
        {
            BaseClass.launchdriver();
        }


    @When("user enters email as {string}")
    public void user_enters_email_as(String email) {
         loginuser.setTxtUsername(email);
    }
        @And("the user clicks on the Login button")
        public void the_user_clicks_on_the_Sendotp_button() {
            loginuser.setSendOtpbtn();
        }

        @And("the user enter the Input_Otp")
        public void user_enter_Input_the_otp() {
            loginuser.setInputOtpfield();
        }


        @Then("user_click_Verify_Button")
        public void user_click_Verify_Button() {
            loginuser.setVerifyOtpbtn();
        }
    }




