package StepDefinations;
/*
import BasePage.BaseClass;
import PageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.http.util.Asserts;
import org.bson.assertions.Assertions;
import org.junit.Assert;

public class LoginStep extends BaseClass
{
    LoginPage lp = new LoginPage(driver);


    @Given("the user navigates to login page")
    public void the_user_navigates_to_login_page()
    {
        BaseClass.launchdriver();

    }
    @When("user enters email as {string} and password as {string}")
    public void user_enters_email_as_and_password_as(String string, String string2)
    {
        lp.SetuserName("Admin");
        lp.setPassword("admin123");

    }

    @And("the user clicks on the Login button")
    public void the_user_clicks_on_the_login_button()
    {
        lp.setLoginbtn();

    }
    @Then("the user should be redirected to the Home Page")
    public void the_user_should_be_redirected_to_the_home_page()
    {
      String value=  driver.getTitle();
      if(value.equals("OrangeHRM"))
        {
            System.out.println("test passed");
        }
        else
        {
            System.out.println("test failed");

        }
    }



}
*/


import BasePage.BaseClass;
import PageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginStep extends BaseClass {
    @Given("the user navigates to login page")
    public void the_user_navigates_to_login_page() {
        BaseClass.launchdriver();
    }

    @When("user enters email as {string} and password as {string}")
    public void user_enters_email_as_and_password_as(String email, String password) {
        loginPage.SetuserName(email);
        loginPage.setPassword(password);
    }

    @And("the user clicks on the Login button")
    public void the_user_clicks_on_the_login_button() {
        loginPage.setLoginbtn();

    }

    @Then("the user should be redirected to the Home Page")
    public void the_user_should_be_redirected_to_the_home_page() {
        String value = driver.getTitle();
        if (value.equals("OrangeHRM")) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
    }
}
