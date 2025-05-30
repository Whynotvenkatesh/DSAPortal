package StepDefinations;

import BasePage.BaseClass;
import io.cucumber.java.en.Then;

public class PrimaryApplicantStep extends BaseClass
{

    @Then("the user click on the ApplicantTypeDropDown")
    public void the_user_click_on_the_applicant_type_drop_down()
    {
        primaryApplicantpage.setApplicantTypeDropDown();
    }
    @Then("the user click on the ApplicantTypeDropDownLists")
    public void the_user_click_on_the_applicant_type_drop_down_lists() {
        primaryApplicantpage.setApplicantTypeDropDownLists();
    }
    @Then("the user click on the CompanyPan")
    public void the_user_click_on_the_company_pan() {
        primaryApplicantpage.setCompanyPan();
    }
    @Then("the user click on the EntityTypeDropDown")
    public void the_user_click_on_the_entity_type_drop_down() {
        primaryApplicantpage.setEntityTypeDropDown();
    }
    @Then("the user click on the EntityTypeDropDownLists")
    public void the_user_click_on_the_entity_type_drop_down_lists() {
        primaryApplicantpage.setEntityTypeDropDownLists();
    }
    @Then("the user click on the VerifyButtonforCompanyPAN")
    public void the_user_click_on_the_verify_buttonfor_company_pan() {
        primaryApplicantpage.setVerifyButtonforCompanyPAN();
    }
    @Then("the user enter the DateOfRegistration")
    public void the_user_enter_the_date_of_registration() {
        primaryApplicantpage.setDateOfRegistration();
    }
    @Then("the user click on the BusinessTypeDroDown")
    public void the_user_click_on_the_business_type_dro_down() {
        primaryApplicantpage.setBusinessTypeDroDown();
    }
    @Then("the user click on the BusinessTypeDroDownLists")
    public void the_user_click_on_the_business_type_dro_down_lists() {
        primaryApplicantpage.setBusinessTypeDroDownLists();
    }

    @Then("the user enter the UdyamText")
    public void the_user_enter_the_udyam_text() {
        primaryApplicantpage.setUdyamText();
    }
    @Then("the user enter the EmailText")
    public void the_user_enter_the_email_text() {
        primaryApplicantpage.setEmailText();
    }
    @Then("the user click on the VerifyButtonEmail")
    public void the_user_click_on_the_verify_button_email() {
        primaryApplicantpage.setVerifyButtonEmail();
    }
    @Then("the user enter the operatingOfficeAddressLine1Text")
    public void the_user_enter_the_operating_office_address_line1text() {
        primaryApplicantpage.setOperatingOfficeAddressLine1Text();
    }
    @Then("the user enter the operatingOfficeAddressLine2Text")
    public void the_user_enter_the_operating_office_address_line2text() {
        primaryApplicantpage.setOperatingOfficeAddressLine2Text();
    }
    @Then("the user enter the operatingOfficeAddressPincodeText")
    public void the_user_enter_the_operating_office_address_pincode_text() {
        primaryApplicantpage.setOperatingOfficeAddressPincodeText();
    }
    @Then("the user click on the operatingOfficeAddressOwnershipDropDown")
    public void the_user_click_on_the_operating_office_address_ownership_drop_down() {
        primaryApplicantpage.setoperatingOfficeAddressOwnershipDropDown();
    }
    @Then("the user click on the SelfOwneditem")
    public void the_user_click_on_the_self_owneditem() {
        primaryApplicantpage.setSelfOwneditem();
    }
    @Then("the user click on the AddObligationButton")
    public void the_user_click_on_the_add_obligation_button() {
        primaryApplicantpage.setAddObligationButton();
    }
    @Then("the user click on the obligationTypeDropDown")
    public void the_user_click_on_the_obligation_type_drop_down() {
        primaryApplicantpage.setObligationTypeDropDown();
    }
    @Then("the user click on the obligationTypeDropDownitem")
    public void the_user_click_on_the_obligation_type_drop_downitem() {
        primaryApplicantpage.setObligationTypeDropDownitem();
    }
    @Then("the user enter the financierText")
    public void the_user_enter_the_financier_text() {
        primaryApplicantpage.setFinancierText();
    }
    @Then("the user enter the emiAmountText")
    public void the_user_enter_the_emi_amount_text() {
        primaryApplicantpage.setEmiAmountText();
    }
    @Then("the user enter the accountNumberText")
    public void the_user_enter_the_account_number_text() {
        primaryApplicantpage.setAccountNumberText();
    }
    @Then("the user enter the currentOutstandingText")
    public void the_user_enter_the_current_outstanding_text() {
        primaryApplicantpage.setCurrentOutstandingText();
    }
    @Then("the user enter the remainingTenureText")
    public void the_user_enter_the_remaining_tenure_text() {
        primaryApplicantpage.setRemainingTenureText();
    }
    @Then("the user click on the obligateDropDown")
    public void the_user_click_on_the_obligate_drop_down() {
        primaryApplicantpage.setObligateDropDown();
    }
    @Then("the user click on the obligateDropDownitem")
    public void the_user_click_on_the_obligate_drop_downitem() {
        primaryApplicantpage.setObligationTypeDropDownitem();
    }
    @Then("the user click on the closeTypeDropDown")
    public void the_user_click_on_the_close_type_drop_down() {
        primaryApplicantpage.setcloseTypeDropDown();
    }
    @Then("the user click on the closeTypeDropDownitem")
    public void the_user_click_on_the_close_type_drop_downitem() {
        primaryApplicantpage.setcloseTypeDropDownitem();
    }
    @Then("the user click on the SaveButton")
    public void the_user_click_on_the_save_button() {
        primaryApplicantpage.setSaveButton();
    }
    @Then("the user click on the SubmitButton")
    public void the_user_click_on_the_submit_button() {
        primaryApplicantpage.setSubmitButton();
    }

}
