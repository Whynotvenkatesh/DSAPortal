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
    // No need to declare WebDriver driver; again, it's inherited from BaseClass
    WebDriver driver;

    public WithOtpCls(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        // 'this.driver = driver;' is not needed here if driver is static in BaseClass and used directly.
        // If driver in BaseClass was not static, you'd initialize it here.
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


    //Primary Applicants Screen

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

    @FindBy(xpath = "//li[normalize-space()='Self Owned']")
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

    @FindBy(xpath = "(//button[normalize-space()='Co Applicants'])[1]")
    WebElement Coapplicantbutton;

    //Add applicant

    @FindBy(xpath = "//button[normalize-space()='+ Add Applicant']")
    WebElement AddApplicantButton;

    @FindBy(xpath = "//div[@id='applicantType']")
    WebElement applicantTypedrop;

    @FindBy(xpath = "//li[normalize-space()='Individual']")
    WebElement Individuallist;

    @FindBy(xpath = "//div[@id='type']")
    WebElement typedropdown;

    //Financial option

    @FindBy(xpath = "//li[normalize-space()='Financial']")
    WebElement Financialitem;

    @FindBy(xpath = "//input[@id='panNumber']")
    WebElement PanNumberText;

    @FindBy(xpath = "(//button[normalize-space()='Verify'])[1]")
    WebElement VerifyPanButton;

    @FindBy(xpath = "//input[@id='dob']")
    WebElement dobText; //22/01/1967

    @FindBy(xpath = "//div[@id='partyRelation']")
    WebElement RelationshipwithApplDropdown;

    @FindBy(xpath = "//li[normalize-space()='Mother']")
    WebElement RelationshipwithApplDropdownitem;

    @FindBy(xpath = "//input[@id='phoneNumber']")
    WebElement phoneNumberText;

    @FindBy(xpath = "//input[@id='emailId']")
    WebElement EmailIdText;

    @FindBy(xpath = "//input[@id='otherOvd']")
    WebElement OtherOvdDropdown;

    @FindBy(xpath = "")
    WebElement AadhaarLastdigits;

    @FindBy(xpath = "//input[@id='aadhaarLastFourDigit']")
    WebElement aadhaarLastFourDigit;

    @FindBy(xpath = "(//button[normalize-space()='Next'])[1]")
    WebElement CoappNextButton;

    //Current Address -co-app
    @FindBy(xpath = "(//textarea[@id='currentAddressLine1']")
    WebElement coapplicantcurrentAddressLine1;

    @FindBy(xpath = "//textarea[@id='currentAddressLine2']")
    WebElement coapplicantcurrentAddressLine2;

    @FindBy(xpath = "//input[@id='currentAddressPincode']")
    WebElement coapplicantcurrentAddressPincode;

    @FindBy(xpath = "//div[@id='currentAddressOwnership']")
    WebElement coapplicantcurrentAddressOwnershipDrodDown;

    @FindBy(xpath = "//li[normalize-space()='Self Owned']")
    WebElement coapplicantcurrentAddressOwnershipDrodDownitem;

    @FindBy(xpath = "(//input[@name='isAddressSame'])[1]")
    WebElement coapplicantcurrentAddressisAddressSame;

    @FindBy(xpath = "(//input[@name='isCorrespondingAddressSameAsCurrentAddress'])[1]")
    WebElement coapplicantisSameAsCurrentAddress;

    @FindBy(xpath = "(//button[normalize-space()='Next'])[1]")
    WebElement coapplicantNextButton;

    @FindBy(xpath = "//button[normalize-space()='Next']")
    WebElement coapplicantNextButton2;

    @FindBy(xpath = "//div[@id='employmentType']")
    WebElement coapplicantemploymentType;

    @FindBy(xpath = "//li[normalize-space()='Salaried']")
    WebElement coapplicantSalaried;

//Employee Details

    @FindBy(xpath = "//input[@id='employerName']")
    WebElement coapplicantemployerName;

    @FindBy(xpath = "")
    WebElement coapplicantemployeritem;

    @FindBy(xpath = "//input[@id='monthlyIncome']")
    WebElement coapplicanmonthlyIncome;

    @FindBy(xpath = "//input[@id='email']")
    WebElement coapplicantOfficialemail;

    @FindBy(xpath = "//input[@id='designation']")
    WebElement coapplicantdesignation;

    //Coapplicant Employer address

    @FindBy(xpath = "//textarea[@id='officeAddressLine1']")
    WebElement coapplicantofficeAddressLine1;

    @FindBy(xpath = "//textarea[@id='officeAddressLine2']")
    WebElement coapplicantofficeAddressLine2;

    @FindBy(xpath = "//input[@id='officeAddressPincode']")
    WebElement coapplicantofficeAddressPincode;

    @FindBy(xpath = "//div[@id='officeAddressOwnership']")
    WebElement coapplicantofficeAddressOwnership;

    @FindBy(xpath = "(//button[normalize-space()='Submit'])[1]")
    WebElement coapplicantSubmit;

    @FindBy(xpath = "(//button[normalize-space()='Collateral'])[1]")
    WebElement coapplicantCollateralbtn;

    @FindBy(xpath = "(//button[normalize-space()='next'])[1]")
    WebElement DedubpeNextBtn;

    @FindBy(xpath = "//button[normalize-space()='+ Add Collateral']")
    WebElement AddCollateralbtn;

    @FindBy(xpath = "(//div[@id='applicants'])[1]")
    WebElement CollOwnerNameDropDown;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    WebElement Collcheckbox2;

    @FindBy(xpath = "//div[@id='collateralType']")
    WebElement collateralTypeDropdown;

    @FindBy(xpath = "//li[normalize-space()='Residential']")
    WebElement ResidentialDropDownitem;

    @FindBy(xpath = "//div[@id='collateralSubType']")
    WebElement collateralSubTypeDroDown;

    @FindBy(xpath = "//li[normalize-space()='Land']")
    WebElement collateralSubTypeDroDownitem;

    @FindBy(xpath = "//div[@id='collateralStatus']")
    WebElement collateralStatus;

    @FindBy(xpath = "//li[normalize-space()='Self Occupied']")
    WebElement SelfOccupied;

    @FindBy(xpath = "//div[@id='stageOfUnderConstruction']")
    WebElement stageOfUnderConstruction;

    @FindBy(xpath = "//li[normalize-space()='Ready']")
    WebElement Ready;

    @FindBy(xpath = "//input[@value='sqFt']")
    WebElement sqFtcheckbox;

    @FindBy(xpath = "//input[@id='plotArea']")
    WebElement plotAreatext;

    @FindBy(xpath = "//input[@id='pincode']")
    WebElement Collpincode;

    @FindBy(xpath = "//textarea[@id='streetName']")
    WebElement streetNametext;

    @FindBy(xpath = "//input[@id='landMark']")
    WebElement landMarktext;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement CollSavebtn;

    //Documents upload
    @FindBy(xpath = "(//button[normalize-space()='Documents'])[1]")
    WebElement DocumentsBtn;

    public void LoginPagewithOtp() {
        // Use your real email for login if it's static
        userEmail.sendKeys("vaibhav.kohli@creditsaison-in.com");
        SendBtn.click();
        EnterOtp.sendKeys("876321");
        BaseClass.helpers.waitForElementClickable(VerifyOtpbtn, 10).click();

        // DashBaord Details
        BaseClass.helpers.waitForElementClickable(ChooseDropDown, 10).click();
        BaseClass.helpers.waitForElementClickable(LoanAgainstProperty, 10).click();
        BaseClass.helpers.waitForElementClickable(AddApplicationBtn, 10).click();

        // Partner Details
        BaseClass.helpers.waitForElementClickable(partnerdropdown, 10).click();
        BaseClass.helpers.waitForElementClickable(PartnerList, 10).click();
        BaseClass.helpers.waitForElementClickable(SchemeDrpDwn, 10).click();
        BaseClass.helpers.waitForElementClickable(SchemeList, 10).click();

        // **FIX for SubProduct.click() - using JavaScript click**
        // First click the dropdown container to open options
        BaseClass.helpers.waitForElementClickable(SubProduct, 10).click();
        // Then click the specific list item. Using JS click for robustness.
        BaseClass.helpers.javaScriptClick(BaseClass.helpers.waitForElementClickable(SubProductList, 10));
        BaseClass.helpers.waitForElementClickable(BranchDropDown, 10).click();
        BaseClass.helpers.waitForElementClickable(BranchDropDownList, 10).click();
        BaseClass.helpers.waitForElementClickable(SalesMangerDropdown, 10).click();
        BaseClass.helpers.waitForElementClickable(SalesManagerList, 10).click();

        // Action for NextButton
        Actions act = new Actions(driver);
        act.moveToElement(BaseClass.helpers.waitForElementClickable(NextButton, 30)).click().build().perform();

        // Lead Details - Using HelperMethods for random data
        textName.sendKeys(helpers.generateRandomUsername()); // Use generated username
        textPhoneNumber.sendKeys(helpers.generateRandomPhoneNumber()); // Use generated phone number
        textLoanAmount.sendKeys("8000000");
        textTenure.sendKeys("35");
        textInterest.sendKeys("45");
        BaseClass.helpers.waitForElementClickable(EmployeTypeDropdown, 10).click();
        BaseClass.helpers.waitForElementClickable(employmentTypeDropDownList, 10).click();
        // BaseClass.helpers.javaScriptClick(BaseClass.helpers.waitForElementClickable(LoanPurposeCheckBox, 10));
        // BaseClass.helpers.waitForElementClickable(LoanPurposeCheckBox, 10).click();
        LoanPurposeCheckBox.click();
        // Action for CreateLeadBtn - using JavaScript click for robustness
        act.moveToElement(BaseClass.helpers.waitForElementClickable(CeateLeadBtn, 30)).click().build().perform();

        BaseClass.helpers.waitForElementClickable(SendOtpButton, 10).click();
        EnterOpt1.sendKeys("1");
        EnterOpt2.sendKeys("2");
        EnterOpt3.sendKeys("3");
        EnterOpt4.sendKeys("4");
        EnterOpt5.sendKeys("5");
        EnterOpt6.sendKeys("6");

        // Applicant Details
        BaseClass.helpers.waitForElementClickable(ApplicantTypeDropDown, 10).click();
        //BaseClass.helpers.waitForElementClickable(ApplicantTypeDropDownLists, 10).click();
        BaseClass.helpers.javaScriptClick(BaseClass.helpers.waitForElementClickable(ApplicantTypeDropDownLists, 10));
        ApplicantTypeDropDownLists.click();
        CompanyPan.sendKeys("ZTDPR1191S");
        BaseClass.helpers.waitForElementClickable(EntityTypeDropDown, 10).click();
        BaseClass.helpers.waitForElementClickable(EntityTypeDropDownLists, 30).click(); // Corrected, removed duplicate
        BaseClass.helpers.waitForElementClickable(VerifyButtonforCompanyPAN, 10).click();
        DateOfRegistration.sendKeys("22/01/1967");
        BaseClass.helpers.waitForElementClickable(BusinessTypeDroDown, 10).click();
        BaseClass.helpers.waitForElementClickable(BusinessTypeDroDownLists, 10).click();
        UdyamText.sendKeys("UDYAM-AD-12-1234567");
        EmailText.sendKeys(helpers.generateRandomEmail()); // Use generated email
        BaseClass.helpers.waitForElementClickable(VerifyButtonEmail, 10).click();
        operatingOfficeAddressLine1Text.sendKeys("Madiwala");
        operatingOfficeAddressLine2Text.sendKeys("28th main road");
        operatingOfficeAddressPincodeText.sendKeys("560095");
        //BaseClass.helpers.waitForElementClickable(operatingOfficeAddressOwnershipDropDown, 10).click();

        Actions act2 = new Actions(driver);
        act2.moveToElement(BaseClass.helpers.waitForElementClickable(operatingOfficeAddressOwnershipDropDown, 30)).click().build().perform();
        //operatingOfficeAddressOwnershipDropDown.click();


        Actions act3 = new Actions(driver);
        act3.moveToElement(BaseClass.helpers.waitForElementClickable(SelfOwneditem, 30)).click().build().perform();

        Actions act4 = new Actions(driver);
        act4.moveToElement(BaseClass.helpers.waitForElementClickable(AddObligationButton, 30)).click().build().perform();

        BaseClass.helpers.waitForElementClickable(AddObligationButton, 10).click();
        BaseClass.helpers.waitForElementClickable(obligationTypeDropDown, 10).click();
        BaseClass.helpers.waitForElementClickable(obligationTypeDropDownitem, 10).click();
        financierText.sendKeys("80798");
        emiAmountText.sendKeys("8000");
        accountNumberText.sendKeys("987678987678876");
        currentOutstandingText.sendKeys("6");
        remainingTenureText.sendKeys("12");
        BaseClass.helpers.waitForElementClickable(obligateDropDown, 10).click();
        BaseClass.helpers.waitForElementClickable(obligateDropDownitem, 10).click();
        BaseClass.helpers.waitForElementClickable(closeTypeDropDown, 10).click();
        BaseClass.helpers.waitForElementClickable(closeTypeDropDownitem, 10).click();
        BaseClass.helpers.waitForElementClickable(SaveButton, 10).click();


        Actions act5 = new Actions(driver);
        act5.moveToElement(BaseClass.helpers.waitForElementClickable(SubmitButton, 30)).click().build().perform();

        // BaseClass.helpers.waitForElementClickable(SubmitButton, 10).click();
        BaseClass.helpers.waitForElementClickable(Coapplicantbutton, 10);
        BaseClass.helpers.waitForElementClickable(AddApplicantButton, 10).click();

    }
}






















    /*
    public void LoginPagewithOtp() {
        // Use your real email for login if it's static
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

*/




