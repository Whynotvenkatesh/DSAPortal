package StepDefinations;

import BasePage.BaseClass;
import io.cucumber.java.en.Then;

public class LeadDetailsStep extends BaseClass
{
    @Then("the user enter the textName")
    public void the_user_enter_the_text_name()
    {
        LeadDetailsPage.setTextName();
    }
    @Then("the user enter the textPhoneNumber")
    public void the_user_enter_the_text_phone_number()
    {
        LeadDetailsPage.setTextPhoneNumber();
    }
    @Then("the user enter the textLoanAmount")
    public void the_user_enter_the_text_loan_amount()
    {
        LeadDetailsPage.setTextLoanAmount();
    }
    @Then("the user enter the textTenure")
    public void the_user_enter_the_text_tenure()
    {
        LeadDetailsPage.setTextTenure();
    }
    @Then("the user enter the textInterest")
    public void the_user_enter_the_text_interest()
    {
        LeadDetailsPage.setTextInterest();
    }
    @Then("the user click on the EmployeTypeDropdown")
    public void the_user_click_on_the_employe_type_dropdown()
    {
        LeadDetailsPage.setEmployeTypeDropdown();
    }
    @Then("the user click on the employmentTypeDropDownList")
    public void the_user_click_on_the_employment_type_drop_down_list()
    {
        LeadDetailsPage.setEmploymentTypeDropDownList();
    }
    @Then("the user click on the LoanPurposeCheckBox")
    public void the_user_click_on_the_loan_purpose_check_box()
    {
        LeadDetailsPage.setLoanPurposeCheckBox();
    }
    @Then("the user click on the CeateLeadBtn")
    public void the_user_click_on_the_ceate_lead_btn()
    {
        LeadDetailsPage.setCeateLeadBtn();
    }
}
