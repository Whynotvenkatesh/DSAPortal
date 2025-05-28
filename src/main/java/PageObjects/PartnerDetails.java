package PageObjects;

import BasePage.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
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

@FindBy(xpath ="//li[normalize-space()='Residential']")
WebElement SubProductList;

@FindBy(xpath ="//input[@id='branch']")
WebElement BranchDropDown;

@FindBy(xpath ="//li[normalize-space()='INDIQUBE LEXINGTON AUDUGODI- BENGALURU']")
WebElement BranchDropDownList;

@FindBy(xpath ="//input[@id='salesManager']")
WebElement SalesMangerDropdown;

@FindBy(xpath ="//li[@id='salesManager-option-3']")
WebElement SalesManagerList;

@FindBy(xpath ="//button[@id=':r13:']")
WebElement NextButton;



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

    public void setSubProductList()
    {
        SubProductList.click();
    }

    public void setBranchDropDown()
    {
        BranchDropDown.click();
    }

    public void setBranchDropDownList()
    {
        BranchDropDownList.click();
    }

    public void setSalesMangerDropdown()
    {
        SalesMangerDropdown.click();
    }

    public void setSalesManagerList()
    {
        SalesManagerList.click();
    }

    public void setNextButton()
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(NextButton));
        NextButton.click();
    }
}
