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
        parnter.setPartnerdropdown();
    }
    @Then("the user clicks on PartnerList")
    public void the_user_clicks_on_partner_list()
    {
        parnter.setPartnerList();

    }

    @Then("the user clicks on the SchemeDrpDwn")
    public void the_user_clicks_on_the_scheme_drp_dwn()
    {
        parnter.setSchemeDrpDwn();
    }
    @Then("the user click on the SchemeList")
    public void the_user_click_on_the_scheme_list()
    {
       parnter.setSchemeList();
    }



}
