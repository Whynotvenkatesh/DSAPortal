package StepDefinations;

import BasePage.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PartnerDetailsStep extends BaseClass
{
    @Then("the user clicks on partnerdropdown")
    public void the_user_clicks_on_partnerdropdown()
    {
        partner.setPartnerdropdown();
    }
    @Then("the user clicks on PartnerList")
    public void the_user_clicks_on_partner_list()
    {
        partner.setPartnerList();

    }

    @Then("the user clicks on the SchemeDrpDwn")
    public void the_user_clicks_on_the_scheme_drp_dwn()
    {
        partner.setSchemeDrpDwn();
    }
    @Then("the user click on the SchemeList")
    public void the_user_click_on_the_scheme_list()
    {
        partner.setSchemeList();
    }

    @Then("the user click on the SubProduct")
    public void the_user_click_on_the_sub_product()
    {
        partner.setSubProduct();
    }

@Then("The user click on the SubProductList")
    public void the_user_click_on_the_sub_product_List()
{
    partner.setSubProductList();
}
    @Then("the user click on the BranchDropDown")
    public void the_user_click_on_the_branch_drop_down()
    {
        partner.setBranchDropDown();

    }
@Then("the user click on the BranchDropDownList")
    public void the_user_click_on_the_Branch_Drop_Down_List()
{
    partner.setBranchDropDownList();
}
@Then ("the user click on the SalesMangerDropdown")
    public void the_user_click_on_the_Sales_Manager_Drop_Down()
{
    partner.setSalesMangerDropdown();
}
    @Then ("the user click on the SalesMangerList")
    public void the_user_click_on_the_Sales_Manager_List()
    {
        partner.setSalesManagerList();
    }

    @Then("the user click on the NextButton")
    public void the_user_click_on_the_Next_Button()
    {
        partner.setNextButton();
    }
}
