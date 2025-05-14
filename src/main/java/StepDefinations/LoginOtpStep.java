package StepDefinations;

import BasePage.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class LoginOtpStep extends BaseClass
{

    public class LoginwithOtp extends BaseClass {
        @Given("the user navigates to login page")
        public void the_user_navigates_to_login_page() {
            BaseClass.launchdriver();
        }

        @When("user enters email as {string}")
        public void user_enters_email_as_and_password_as(String email) {
            LoginOtp.setTxtUsername(email);

        }

        @And("the user clicks on the Login button")
        public void the_user_clicks_on_the_Sendotp_button() {
            LoginOtp.setSendOtpbtn();
        }

        @And("the user enter the Input_Otp")
        public void user_enter_Input_the_otp() {
            LoginOtp.setInputOtpfield();
        }


        @And("user_click_Verify_Button")
        public void user_click_Verify_Button() {
            LoginOtp.setVerifyOtpbtn();
        }
    }


    }
