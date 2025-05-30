package PageObjects;

import BasePage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WithOtpCls extends BaseClass {
    WebDriver driver;

    public WithOtpCls(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //LoginScreen
    @FindBy(xpath = "//input[@id='email']")
    WebElement userEmail;

    @FindBy(xpath = "//button[normalize-space()='Send OTP']")
    WebElement SendBtn;


    @FindBy(xpath = "//input[@id='otp_form_otp']")
    WebElement EnterOtp;

    @FindBy(xpath = "//button[normalize-space()='Verify OTP']")
    WebElement VerifyOtpbtn;


    //DashBoard
    @FindBy(xpath = "//div[@class='ant-select-selector' and descendant::span[contains(text(),'Choose Loan Type')]]") // EXAMPLE - VERIFY THIS
            WebElement ChooseDropDown;


    @FindBy(xpath = "//div[contains(text(),'Loan Against Property')]")
    WebElement LoanAgainstProperty;

    //If condition used ----   select option based on choose

    @FindBy(xpath = "//span[normalize-space()='Add Application']")
    WebElement AddApplicationBtn;


    //Partner Details
    @FindBy(xpath = "//input[@id='partnerName']")
    WebElement partnerdropdown;


    @FindBy(xpath = "//li[@id='partnerName-option-0']")
    WebElement PartnerList;

    @FindBy(xpath = "//div[@id='scheme']")
    WebElement SchemeDrpDwn;

    @FindBy(xpath = "//li[normalize-space()='New']")
    WebElement SchemeList;

    @FindBy(xpath = "//div[@id='subProduct']")
    WebElement SubProduct;

    @FindBy(xpath = "//li[normalize-space()='Residential']")
    WebElement SubProductList;

    @FindBy(xpath = "//input[@id='branch']")
    WebElement BranchDropDown;

    @FindBy(xpath = "//li[normalize-space()='INDIQUBE LEXINGTON AUDUGODI- BENGALURU']")
    WebElement BranchDropDownList;

    @FindBy(xpath = "//input[@id='salesManager']")
    WebElement SalesMangerDropdown;

    @FindBy(xpath = "//li[@id='salesManager-option-3']")
    WebElement SalesManagerList;

    @FindBy(xpath = "//button[normalize-space()='Next']")
    WebElement NextButton;


    //Lead Details

    @FindBy(xpath = "//input[@id='name']")
    WebElement textName;

    @FindBy(xpath = "//input[@id='phoneNumber']")
    WebElement textPhoneNumber;

    @FindBy(xpath = "//input[@id='loanAmount']")
    WebElement textLoanAmount;

    @FindBy(xpath = "//input[@id='tenure']")
    WebElement textTenure;

    @FindBy(xpath = "//input[@id='rateOfInterest']")
    WebElement textInterest;

    @FindBy(xpath = "//div[@id='employmentType']")
    WebElement EmployeTypeDropdown;

    @FindBy(xpath = "//li[normalize-space()='Salaried']")
    WebElement employmentTypeDropDownList;

    @FindBy(xpath = "//input[@name='Loan for purchase of property']")
    WebElement LoanPurposeCheckBox;

    @FindBy(xpath = "//button[normalize-space()='Create Lead']")
    WebElement CeateLeadBtn;


    @FindBy(xpath = "//button[normalize-space()='Send otp']")
    WebElement SendOtpButton;

    @FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[1]")
    WebElement EnterOpt1;

    @FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[2]")
    WebElement EnterOpt2;

    @FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[3]")
    WebElement EnterOpt3;

    @FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[4]")
    WebElement EnterOpt4;

    @FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[5]")
    WebElement EnterOpt5;

    @FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[6]")
    WebElement EnterOpt6;


    //Primary Applicants

    @FindBy(xpath = "//div[@id='applicantType']")
    WebElement ApplicantTypeDropDown;

    @FindBy(xpath = "//li[normalize-space()='Entity']")
    WebElement ApplicantTypeDropDownLists;

    @FindBy(xpath = "//input[@id='panNumber']")
    WebElement CompanyPan;

    @FindBy(xpath = "//div[@id='entityType']")
    WebElement EntityTypeDropDown;

    @FindBy(xpath = "//li[normalize-space()='PVT LTD Company']")
    WebElement EntityTypeDropDownLists;

    @FindBy(xpath = "(//button[normalize-space()='Verify'])[1]")
    WebElement VerifyButtonforCompanyPAN;

    @FindBy(xpath = "//input[@id='dob']")
    WebElement DateOfRegistration;

    @FindBy(xpath = "//div[@id='businessType']")
    WebElement BusinessTypeDroDown;

    @FindBy(xpath = "//li[normalize-space()='Micro']")
    WebElement BusinessTypeDroDownLists;

    @FindBy(xpath = "//input[@id='udyam']")
    WebElement UdyamText;  //UDYAM-AD-12-1234567

    @FindBy(xpath = "//input[@id='emailId']")
    WebElement EmailText;

    @FindBy(xpath = "(//button[normalize-space()='Verify'])[2]")
    WebElement VerifyButtonEmail;

    @FindBy(xpath = "//textarea[@id='operatingOfficeAddressLine1']")
    WebElement operatingOfficeAddressLine1Text;

    @FindBy(xpath = "//textarea[@id='operatingOfficeAddressLine2']")
    WebElement operatingOfficeAddressLine2Text;

    @FindBy(xpath = "//input[@id='operatingOfficeAddressPincode']")
    WebElement operatingOfficeAddressPincodeText;

    @FindBy(xpath = "//div[@id='operatingOfficeAddressOwnership']")
    WebElement operatingOfficeAddressOwnershipDropDown;

    @FindBy(xpath = "//li[normalize-space()='Self Owned']']")
    WebElement SelfOwneditem;

    // Add Obligation
    @FindBy(xpath = "//button[normalize-space()='+ Add Obligation']")
    WebElement AddObligationButton;

    @FindBy(xpath = "//div[@name='obligationType']//div//div[@role='button']")
    WebElement obligationTypeDropDown;

    @FindBy(xpath = "//p[normalize-space()='Home loan']")
    WebElement obligationTypeDropDownitem;

    @FindBy(xpath = "//input[@id='financier']")
    WebElement financierText;

    @FindBy(xpath = "//input[@id='emiAmount']")
    WebElement emiAmountText;

    @FindBy(xpath = "//input[@id='accountNumber']")
    WebElement accountNumberText;

    @FindBy(xpath = "//input[@id='currentOutstanding']")
    WebElement currentOutstandingText;

    @FindBy(xpath = "//input[@id='remainingTenure']")
    WebElement remainingTenureText;

    @FindBy(xpath = "//input[@id='obligate']")
    WebElement obligateDropDown;

    @FindBy(xpath = "//li[contains(text(),'Yes')]")
    WebElement obligateDropDownitem;

    @FindBy(xpath = "//input[@id='closeType']")
    WebElement closeTypeDropDown;


    @FindBy(xpath = "//li[contains(text(),'Self Close')]")
    WebElement closeTypeDropDownitem;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement SaveButton;

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    WebElement SubmitButton;


    public void LoginPagewithOtp() {

        CharSequence Email = "vaibhav.kohli@creditsaison-in.com";
        userEmail.sendKeys(Email);
        SendBtn.click();
        EnterOtp.sendKeys("876321");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(VerifyOtpbtn)).click();

        //DashBaord Details
        ChooseDropDown.click();
        LoanAgainstProperty.click();
        AddApplicationBtn.click();


        //Parnter Details
        partnerdropdown.click();
        PartnerList.click();
        SchemeDrpDwn.click();
        SchemeList.click();
        SubProduct.click();
        SubProductList.click();
        //wait.until(ExpectedConditions.elementToBeClickable(SubProduct)).click();
        BranchDropDown.click();
        BranchDropDownList.click();
        SalesMangerDropdown.click();
        SalesManagerList.click();
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait1.until(ExpectedConditions.elementToBeClickable(NextButton));
        Actions act = new Actions(driver);
        act.moveToElement(NextButton).click().build().perform();

        //Lead Details
        textName.sendKeys("Venky");
        textPhoneNumber.sendKeys("9999791700");
        textLoanAmount.sendKeys("8000000");
        textTenure.sendKeys("35");
        textInterest.sendKeys("45");
        EmployeTypeDropdown.click();
        employmentTypeDropDownList.click();
        LoanPurposeCheckBox.click();

        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(CeateLeadBtn));
        Actions act3 = new Actions(driver);
        act.moveToElement(CeateLeadBtn).click().build().perform();

        SendOtpButton.click();
        EnterOpt1.sendKeys("1");
        EnterOpt2.sendKeys("2");
        EnterOpt3.sendKeys("3");
        EnterOpt4.sendKeys("4");
        EnterOpt5.sendKeys("5");
        EnterOpt6.sendKeys("6");

        //Applicant Details

        ApplicantTypeDropDown.click();
        ApplicantTypeDropDownLists.click();
        // CompanyPan.sendKeys(PanNumber);
        CompanyPan.sendKeys("KTZPA4560F");
        EntityTypeDropDown.click();
        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait4.until(ExpectedConditions.elementToBeClickable(EntityTypeDropDownLists)).click();
        EntityTypeDropDownLists.click(); //remove this line
        VerifyButtonforCompanyPAN.click();
        DateOfRegistration.sendKeys("22/01/1967");
        BusinessTypeDroDown.click();
        BusinessTypeDroDownLists.click();
        UdyamText.sendKeys("UDYAM-AD-12-1234567");
        EmailText.sendKeys("venky@gmail.com");
        VerifyButtonEmail.click();
        operatingOfficeAddressLine1Text.sendKeys("Madiwala");
        operatingOfficeAddressLine2Text.sendKeys("28th main road");
        operatingOfficeAddressPincodeText.sendKeys("560095");
        operatingOfficeAddressOwnershipDropDown.click();
        SelfOwneditem.click();
        AddObligationButton.click();
        obligationTypeDropDown.click();
        obligationTypeDropDownitem.click();
        financierText.sendKeys("80798");
        emiAmountText.sendKeys("8000");
        accountNumberText.sendKeys("987678987678876");
        currentOutstandingText.sendKeys("6");
        remainingTenureText.sendKeys("12");
        obligateDropDown.click();
        obligateDropDownitem.click();
        closeTypeDropDown.click();
        closeTypeDropDownitem.click();
        SaveButton.click();
        SubmitButton.click();

    }

}






