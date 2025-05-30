package StepDefinations;

import BasePage.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WithOtpLogin extends BaseClass {
    @Given("the user navigates to login page")
    public void the_user_navigates_to_login_page() {
        BaseClass.launchdriver();
    }

    @When("the user Add the Loginpage info")
    public void the_user_add_the_loginpage_info() {

        LoginWithOtp.LoginPagewithOtp();
    }
}

