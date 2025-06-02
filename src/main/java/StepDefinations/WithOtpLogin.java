package StepDefinations;

import BasePage.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/*
public class WithOtpLogin extends BaseClass
{
    @Given("the user navigates to login page")
    public void the_user_navigates_to_login_page()
    {
        BaseClass.launchdriver();
    }

    @When("the user Add the Loginpage info")
    public void the_user_add_the_loginpage_info()
     {

        LoginWithOtp.LoginPagewithOtp();
    }
}
*/

public class WithOtpLogin extends BaseClass {
    // No need to instantiate LoginWithOtp here, it's already done in BaseClass
    // public WithOtpCls LoginWithOtp; // This line is not needed if BaseClass already initializes it

    // Constructor (optional, but good practice if you need to do something specific here)
    public WithOtpLogin() {
        // You might re-initialize page objects here if not done in BaseClass,
        // but with static BaseClass.LoginWithOtp, it's already available.
    }

    @Given("the user navigates to login page")
    public void the_user_navigates_to_login_page() {
        BaseClass.launchdriver();
        // Driver launch logic is now inside BaseClass's @BeforeMethod setup()
        // No need to call launchdriver() directly from here anymore.
        // The driver will be automatically launched before this step executes.
        System.out.println("Navigating to login page via BaseClass launchdriver.");
        // If you need to open a specific URL here, ensure driver is accessible
        // driver.get("https://portal.uat.creditsaison.xyz/signin"); // Already done in BaseClass
    }

    @When("the user Add the Loginpage info")
    public void the_user_add_the_loginpage_info() {
        // Call the method from the LoginWithOtp Page Object instance initialized in BaseClass
        LoginWithOtp.LoginPagewithOtp();
    }

    @Then("the lead should be created successfully") // Example new step for assertion
    public void the_lead_should_be_created_successfully() {
        // Add assertions here to verify lead creation, e.g.,
        // BaseClass.helpers.waitForElementVisible(By.xpath("//div[contains(text(),'Lead created successfully')]"), 15);
        // org.testng.Assert.assertTrue(driver.getCurrentUrl().contains("lead-details"), "Expected lead details page");
        System.out.println("Lead creation assertion step here.");
    }
}




