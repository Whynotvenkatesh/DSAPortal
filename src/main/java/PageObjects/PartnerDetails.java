package PageObjects;

import BasePage.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PartnerDetails extends BaseClass
{
    WebDriver driver;

    //Constructor
    public PartnerDetails(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Elements

    @FindBy(xpath ="//input[@id='partnerName']")
    WebElement partnerdropdown;


    @FindBy(xpath ="//li[@id='partnerName-option-0']")
    WebElement PartnerList;

    @FindBy(xpath="//div[@id='scheme']")
    WebElement SchemeDrpDwn;

@FindBy(xpath="//li[normalize-space()='New']")
WebElement SchemeList;

@FindBy(xpath ="//div[@id='subProduct']")
WebElement SubProduct;

    //Methods

    public void setPartnerdropdown()
    {
        partnerdropdown.click();
    }

    public void setPartnerList()
    {
        PartnerList.click();
    }

    public void setSchemeDrpDwn()
    {
        SchemeDrpDwn.click();
    }

    public void setSchemeList()
    {
        SchemeList.click();
    }

    public void setSubProduct()
    {
        SubProduct.click();
    }
}
