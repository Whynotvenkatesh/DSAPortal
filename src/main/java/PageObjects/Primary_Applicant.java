package PageObjects;

import BasePage.BaseClass;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class Primary_Applicant extends BaseClass
{
    WebDriver driver;

    public Primary_Applicant(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//div[@id='applicantType']")
    WebElement ApplicantTypeDropDown;

    @FindBy(xpath="//li[normalize-space()='Entity']")
    WebElement ApplicantTypeDropDownLists;

    @FindBy(xpath="//input[@id='panNumber']")
    WebElement  CompanyPan;

    @FindBy(xpath="//div[@id='entityType']")
    WebElement  EntityTypeDropDown;

    @FindBy(xpath="//li[normalize-space()='PVT LTD Company']")
    WebElement  EntityTypeDropDownLists;

    @FindBy(xpath="(//button[normalize-space()='Verify'])[1]")
    WebElement  VerifyButtonforCompanyPAN;

    @FindBy(xpath="//input[@id='dob']")
    WebElement  DateOfRegistration;

    @FindBy(xpath="//div[@id='businessType']")
    WebElement  BusinessTypeDroDown;

    @FindBy(xpath="//li[normalize-space()='Micro']")
    WebElement  BusinessTypeDroDownLists;

    @FindBy(xpath="//input[@id='udyam']")
    WebElement UdyamText;  //UDYAM-AD-12-1234567

    @FindBy(xpath="//input[@id='emailId']")
    WebElement EmailText;

    @FindBy(xpath="(//button[normalize-space()='Verify'])[2]")
    WebElement VerifyButtonEmail;

    @FindBy(xpath="//textarea[@id='operatingOfficeAddressLine1']")
    WebElement operatingOfficeAddressLine1Text;

    @FindBy(xpath="//textarea[@id='operatingOfficeAddressLine2']")
    WebElement operatingOfficeAddressLine2Text;

    @FindBy(xpath="//input[@id='operatingOfficeAddressPincode']")
    WebElement operatingOfficeAddressPincodeText;

    @FindBy(xpath="//div[@id='operatingOfficeAddressOwnership']")
    WebElement operatingOfficeAddressOwnershipDropDown;

    @FindBy(xpath="//li[normalize-space()='Self Owned']']")
    WebElement SelfOwneditem;

// Add Obligation
    @FindBy(xpath="//button[normalize-space()='+ Add Obligation']")
    WebElement AddObligationButton;

    @FindBy(xpath="//div[@name='obligationType']//div//div[@role='button']")
    WebElement obligationTypeDropDown;

    @FindBy(xpath="//p[normalize-space()='Home loan']")
    WebElement obligationTypeDropDownitem;

    @FindBy(xpath="//input[@id='financier']")
    WebElement financierText;

    @FindBy(xpath="//input[@id='emiAmount']")
    WebElement emiAmountText;

    @FindBy(xpath="//input[@id='accountNumber']")
    WebElement accountNumberText;

    @FindBy(xpath="//input[@id='currentOutstanding']")
    WebElement currentOutstandingText;

    @FindBy(xpath="//input[@id='remainingTenure']")
    WebElement remainingTenureText;

    @FindBy(xpath="//input[@id='obligate']")
    WebElement obligateDropDown;

    @FindBy(xpath="//li[contains(text(),'Yes')]")
    WebElement obligateDropDownitem;

    @FindBy(xpath="//input[@id='closeType']")
    WebElement closeTypeDropDown;


    @FindBy(xpath="//li[contains(text(),'Self Close')]")
    WebElement closeTypeDropDownitem;

    @FindBy(xpath="(//button[normalize-space()='Save'])[1]")
    WebElement SaveButton;

    @FindBy(xpath="//button[contains(text(),'Submit')]")
    WebElement SubmitButton;







public void setApplicantTypeDropDown()
{
    ApplicantTypeDropDown.click();
}

public void setApplicantTypeDropDownLists()
{
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ApplicantTypeDropDownLists));
    ApplicantTypeDropDownLists.click();
}

/*
    // --- Helper method for random PAN generation ---
    private String generateRandomPanWithPStatus()
    {
        String firstThreeChars = RandomStringUtils.randomAlphabetic(3).toUpperCase();
        // Fourth character: Fixed as 'P' (for Individual)
        char fourthChar = 'P';
        String fifthChar = RandomStringUtils.randomAlphabetic(1).toUpperCase();
        Random random = new Random();
        int randomNumbers = random.nextInt(9999) + 1; // Generates a number between 1 and 9999
        String numericPart = String.format("%04d", randomNumbers); // Formats to 4 digits (e.g., 5 -> "0005")
        String lastChar = RandomStringUtils.randomAlphabetic(1).toUpperCase();
        return firstThreeChars + fourthChar + fifthChar + numericPart + lastChar;
    }

    // --- Action Methods (updated to use random PAN) ---
public void setCompanyPan()
{
    String randomPan = generateRandomPanWithPStatus();
    CompanyPan.sendKeys(randomPan);
    System.out.println("Generated PAN Number (4th char 'P'): " + randomPan); // For debugging
    // CompanyPan.sendKeys("GCFPA6789A");

}
*/



    public void setCompanyPan(String PanNumber)
    {
        CompanyPan.sendKeys(PanNumber);

    }

    public void PrimaryApplicantScreen()
    {
        EntityTypeDropDown.click();
        EntityTypeDropDownLists.click();
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




public void setEntityTypeDropDown()
{
    EntityTypeDropDown.click();
}
public void setEntityTypeDropDownLists()
    {
        EntityTypeDropDownLists.click();
    }

    public void setVerifyButtonforCompanyPAN()
    {
        VerifyButtonforCompanyPAN.click();
    }

    public void setDateOfRegistration()
    {
        DateOfRegistration.sendKeys("22/01/1967");
    }

public void setBusinessTypeDroDown()
{
    BusinessTypeDroDown.click();
}
    public void setBusinessTypeDroDownLists()
    {
        BusinessTypeDroDownLists.click();
    }

    public void setUdyamText()
    {
        UdyamText.sendKeys("UDYAM-AD-12-1234567");
    }

    public  void setEmailText()
    {
        EmailText.sendKeys("venky@gmail.com");
    }

    public void setVerifyButtonEmail()
    {
        VerifyButtonEmail.click();
    }
    //Addhere Switching window for email verify

    public void setOperatingOfficeAddressLine1Text()
    {
        operatingOfficeAddressLine1Text.sendKeys("Madiwala");
    }
    public void setOperatingOfficeAddressLine2Text()
    {
        operatingOfficeAddressLine2Text.sendKeys("28th main road");
    }

    public void setOperatingOfficeAddressPincodeText()
    {
        operatingOfficeAddressPincodeText.sendKeys("560095");
    }


    public void setoperatingOfficeAddressOwnershipDropDown()
    {
        operatingOfficeAddressOwnershipDropDown.click();
    }

    public void setSelfOwneditem()
    {
        SelfOwneditem.click();
    }

    public void setAddObligationButton()
    {
        AddObligationButton.click();
    }

    public void setObligationTypeDropDown()
    {
        obligationTypeDropDown.click();
    }

    public void setObligationTypeDropDownitem()
    {
        obligationTypeDropDownitem.click();
    }
    public void setFinancierText()
    {
        financierText.sendKeys("80798");
    }

    public void setEmiAmountText()
    {
        emiAmountText.sendKeys("8000");
    }

    public void setAccountNumberText()
    {
        accountNumberText.sendKeys("987678987678876");
    }
    public void setCurrentOutstandingText()
    {
        currentOutstandingText.sendKeys("6");
    }

    public void setRemainingTenureText()
    {
        remainingTenureText.sendKeys("12");
    }

    public  void setObligateDropDown()
    {
        obligateDropDown.click();
    }

    public void setObligateDropDownitem()
    {
        obligateDropDownitem.click();
    }

    public void setcloseTypeDropDown()
    {
        closeTypeDropDown.click();
    }
    public void setcloseTypeDropDownitem()
    {
        closeTypeDropDownitem.click();
    }

    public void setSaveButton()
    {
        SaveButton.click();
    }

public void setSubmitButton()
{
    SubmitButton.click();
}

}
