package PageObjects;

import BasePage.BaseClass;
import BasePage.Basepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadDetails extends BaseClass {
    WebDriver driver;

    LeadDetails(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='name']")
    WebElement textName;

    @FindBy(xpath = "//input[@id='phoneNumber']")
    WebElement textPhoneNumber;

    @FindBy(xpath = "//input[@id='loanAmount']")
    WebElement txtLoanAmount;

    @FindBy(xpath = "//input[@id='tenure']")
    WebElement txtTenure;

    @FindBy(xpath = "//input[@id='rateOfInterest']")
    WebElement txtInterest;

    @FindBy(xpath = "//div[@id='employmentType']")
    WebElement EmployeTypeDropdown;

    @FindBy(xpath = "//li[normalize-space()='Salaried']")
    WebElement SalariedItem;

    @FindBy(xpath = "//input[@id='loanPurpose']")
    WebElement LoanPurposeDropdown;

    ////p[@id='loanPurpose-helper-text']
    @FindBy(xpath = "/p[@id='loanPurpose-helper-text']")    //
            WebElement LoanPurposeItem;

    @FindBy(xpath = "//button[normalize-space()='Create Lead']")
    WebElement CeateLeadBtn;

    public void setTextName() {
        textName.sendKeys(("Venky"));
    }

    public void setTextPhoneNumber() {
        textPhoneNumber.sendKeys("7019791786");
    }

    public void setTxtLoanAmount() {
        txtLoanAmount.sendKeys("4500000");
    }

    public void setTxtTenure() {
        txtTenure.sendKeys("35");
    }

    public void setTxtInterest() {
        txtInterest.sendKeys("45");
    }

    public void setEmployeTypeDropdown() {
        EmployeTypeDropdown.click();
    }

    public void setSalariedItem() {
        SalariedItem.click();
    }

    public void setLoanPurposeDropdown() {
        LoanPurposeDropdown.click();
    }

    public void setLoanPurposeItem() {
        LoanPurposeItem.click();
    }

    public void setCeateLeadBtn() {
        CeateLeadBtn.click();
    }


}
