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

    @FindBy(xpath="//div[@id='scheme']")
    WebElement SchemeDropdown;

    @FindBy(xpath = "//li[normalize-space()='New']")
    WebElement SchemeOptions;


    @FindBy(xpath = "//div[@id='subProduct']")
    WebElement SubProductDropdown;

    @FindBy(xpath ="//li[normalize-space()='Residential']")
    WebElement SubProductOptions;


    @FindBy(xpath = "//input[@id='branch']")
    WebElement BranchDropdown;

    @FindBy(xpath = "//li[@id='branch-option-0']")
    WebElement BranchOptions;
    //li[normalize-space()='INDIQUBE LEXINGTON AUDUGODI- BENGALURU']


    @FindBy(xpath = "//input[@id='salesManager']")
    WebElement SalesManagerDropdown;

    @FindBy(xpath="//li[@id='salesManager-option-0']")
    WebElement SalesManagerOptions;
    //li[normalize-space()='devi (devi@gmail.com)']


    @FindBy(xpath="//button[normalize-space()='Next']")
    WebElement NextBtn;


    //Methods

    public void setSchemeDropdown()
{
    SchemeDropdown.click();
}

public void setSchemeOptions()
{
 SchemeOptions.click();
}

public void setSubProductDropdown()
{
    SubProductDropdown.click();
}

public void setSubProductOptions()
{
    SubProductOptions.click();
}

public void setBranchDropdown()
{
    BranchDropdown.click();
}

public void setBranchOptions()
{
    BranchOptions.click();
}

public void setSalesManagerDropdown()
{
    SalesManagerDropdown.click();
}

public void setSalesManagerOptions()
{
    SalesManagerOptions.click();
}

public void setNextBtn()
{

//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    wait.until(ExpectedConditions.elementToBeClickable(NextBtn)).click();
//    NextBtn.click();

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
    NextBtn.click();
}
}
