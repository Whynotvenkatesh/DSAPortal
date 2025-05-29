package PageObjects;

import BasePage.BaseClass;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;


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

    @FindBy(xpath = "//button[normalize-space()='Create Lead']")
    WebElement CeateLeadBtn;


    @FindBy(xpath ="//button[normalize-space()='Send otp']")
    WebElement SendOtpButton;

    @FindBy(xpath ="(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[1]")
    WebElement EnterOpt1;

    @FindBy(xpath ="(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[2]")
    WebElement EnterOpt2;

    @FindBy(xpath ="(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[3]")
    WebElement EnterOpt3;

    @FindBy(xpath ="(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[4]")
    WebElement EnterOpt4;

    @FindBy(xpath ="(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[5]")
    WebElement EnterOpt5;

    @FindBy(xpath ="(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[6]")
    WebElement EnterOpt6;


    private String generateRandomName()
    {
        // Generates a random alphanumeric string of length 5
        String randomSuffix = RandomStringUtils.randomAlphanumeric(5);
        return "TestUser_" + randomSuffix;

    }

    public void setTextName()
    {
        //textName.sendKeys("WhyNotVenkatesh");
        String randomName = generateRandomName();
        textName.sendKeys(randomName);
        System.out.println("Generated Name: " + randomName); // For debugging
    }

    private String generateRandomPhoneNumber() {
        Random random = new Random();
        StringBuilder phoneNumber = new StringBuilder();

        // First digit (6-9 for Indian mobile numbers)
        phoneNumber.append(random.nextInt(4) + 6); // Generates 0-3, adds 6 -> 6,7,8,9

        // Remaining 9 digits
        for (int i = 0; i < 9; i++)
        {
            phoneNumber.append(random.nextInt(10)); // Generates 0-9
        }
        return phoneNumber.toString();
    }



    public void setTextPhoneNumber()
    {
        //textPhoneNumber.sendKeys("9998791700");
        String randomNumber = generateRandomPhoneNumber();
        textPhoneNumber.sendKeys(randomNumber);
        System.out.println("Generated Phone Number: " + randomNumber); // For debugging

    }


    public void setTextLoanAmount()
    {
        textLoanAmount.sendKeys("8000000");
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
        /*
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.elementToBeClickable(CeateLeadBtn));

        // Scroll the element into view using JavaScript
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CeateLeadBtn);

        // After scrolling, re-wait for clickability as its position might have changed
        wait.until(ExpectedConditions.elementToBeClickable(CeateLeadBtn));
        CeateLeadBtn.click();
*/


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.elementToBeClickable(CeateLeadBtn));

        Actions act = new Actions(driver);
        act.moveToElement(CeateLeadBtn).click().build().perform();

    }

    public void setSendOtpButton()
    {
        SendOtpButton.click();
    }

    public void setEnterOpt1()
    {
        EnterOpt1.sendKeys("1");
    }

    public void setEnterOpt2()
    {
        EnterOpt2.sendKeys("2");
    }

    public void setEnterOpt3()
    {
        EnterOpt3.sendKeys("3");
    }

    public void setEnterOpt4()
    {
        EnterOpt4.sendKeys("4");
    }

    public void setEnterOpt5()
    {
        EnterOpt5.sendKeys("5");
    }

    public void setEnterOpt6()
    {
        EnterOpt6.sendKeys("6");
    }

}
