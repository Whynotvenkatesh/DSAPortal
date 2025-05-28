package PageObjects;

import BasePage.BaseClass;
import BasePage.Basepage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LeadDetails extends BaseClass
{
    WebDriver driver;

    //Constructor
    public LeadDetails(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath ="//input[@id='name']")
    WebElement textName;

    @FindBy(xpath ="//input[@id='phoneNumber']")
    WebElement textPhoneNumber;

    @FindBy(xpath ="//input[@id='loanAmount']")
    WebElement textLoanAmount;

    @FindBy(xpath ="//input[@id='tenure']")
    WebElement textTenure;

    @FindBy(xpath ="//input[@id='rateOfInterest']")
    WebElement textInterest;

    @FindBy(xpath ="//div[@id='employmentType']")
    WebElement EmployeTypeDropdown;

    @FindBy(xpath ="//li[normalize-space()='Salaried']")
    WebElement employmentTypeDropDownList;

    @FindBy(xpath ="//input[@name='Loan for purchase of property']")
    WebElement LoanPurposeCheckBox;

    @FindBy(xpath = "//button[@id=':r1b:']")
    WebElement CeateLeadBtn;



    public void setTextName()
    {
        textName.sendKeys("WhyNotVenkatesh");
    }

    public void setTextPhoneNumber() {
        textPhoneNumber.sendKeys("7019791786");
    }

    public void setTextLoanAmount()
    {
        textLoanAmount.sendKeys("5000000");
    }

    public void setTextTenure() {
        textTenure.sendKeys("35");
    }

    public void setTextInterest() {
        textInterest.sendKeys("45");
    }

    public void setEmployeTypeDropdown() {
        EmployeTypeDropdown.click();
    }

    public void setEmploymentTypeDropDownList() {
        employmentTypeDropDownList.click();
    }

    public void setLoanPurposeCheckBox() {
        LoanPurposeCheckBox.click();
    }

    public void setCeateLeadBtn()
    {
        CeateLeadBtn.click();
    }

}
