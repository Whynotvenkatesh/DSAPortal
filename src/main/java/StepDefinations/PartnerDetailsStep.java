package StepDefinations;

import BasePage.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PartnerDetailsStep extends BaseClass
{

    @When("user click the SchemeDropdown list")
    public void user_click_the_scheme_dropdown_list() {

        parnter.setSchemeDropdown();
    }
    @When("user select the SchemeOptions item")
    public void user_select_the_scheme_options_item() {

        parnter.setSchemeOptions();
    }
    @When("user click the SubProductDropdown list")
    public void user_click_the_sub_product_dropdown_list() {

        parnter.setSubProductDropdown();
    }
    @When("user select the SubProductOptions item")
    public void user_select_the_sub_product_options_item() {

        parnter.setSubProductOptions();
    }
    @When("user click the BranchDropdown list")
    public void user_click_the_branch_dropdown_list() {

        parnter.setBranchDropdown();
    }
    @When("user select the BranchOptions item")
    public void user_select_the_branch_options_item() {

        parnter.setBranchOptions();
    }
    @When("user click the SalesManagerDropdown list")
    public void user_click_the_sales_manager_dropdown_list() {

        parnter.setSalesManagerDropdown();
    }
    @When("user select the SalesManagerOptions item")
    public void user_select_the_sales_manager_options_item() {

        parnter.setSalesManagerOptions();
    }
    @When("user click the NextBtn")
    public void user_click_the_next_btn() {

        parnter.setNextBtn();
    }
    @Then("user navigates the Lead details page")
    public void user_navigates_the_lead_details_page()
    {
        Boolean res=driver.findElement(By.xpath("//p[normalize-space()='Lead Details']")).isDisplayed();
        System.out.println(res);

    }






}
