package StepDefinations;

import BasePage.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashBoardStep extends BaseClass {

    @When("the user clicks on the Choose_dropdown")
    public void the_user_selects_from_the_dropdown_list()
    {
        db.setChooseDropDown();
    }

    @Then("the user clicks on the LoanAgainstProperty_button")
    public void the_user_clicks_on_the_button()
    {
        db.setLoanAgainstProperty();
    }

    @Then("the user clicks on the AddApplication_btn")
    public void the_user_should_be_redirected_to_the_pag()
    {
        db.setAddApplicationBtn();
    }

}