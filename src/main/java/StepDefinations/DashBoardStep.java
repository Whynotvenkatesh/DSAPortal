package StepDefinations;

import BasePage.BaseClass;
import PageObjects.DashBoard;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashBoardStep extends BaseClass {

    @Given("the user selects {string} from the dropdown list")
    public void the_user_selects_from_the_dropdown_list(String string) {
        db.selectdropdown();
    }

    @Given("the user clicks on the {string} button")
    public void the_user_clicks_on_the_button(String string) {
        db.setAddApplicatinBtn();
    }

    @Then("the user should be redirected to the {string} pag")
    public void the_user_should_be_redirected_to_the_pag(String string) {
        db.btnaddapplication();
    }

}