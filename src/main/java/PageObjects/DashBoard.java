package PageObjects;

import BasePage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;


public class DashBoard extends BaseClass
{
    WebDriver driver;

    //Constructor
    public DashBoard(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//div[@class='ant-select-selector' and descendant::span[contains(text(),'Choose Loan Type')]]") // EXAMPLE - VERIFY THIS

            WebElement ChooseDropDown;


    @FindBy(xpath ="//div[contains(text(),'Loan Against Property')]" )
    WebElement LoanAgainstProperty;

    //If condition used ----   select option based on choose

    @FindBy(xpath = "//span[normalize-space()='Add Application']")
    WebElement AddApplicationBtn;


    public void setChooseDropDown()
    {
// method before clicking:
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(ChooseDropDown));
        wait.until(ExpectedConditions.elementToBeClickable(ChooseDropDown));
        ChooseDropDown.click();

    }

    public void setLoanAgainstProperty()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(LoanAgainstProperty));
        LoanAgainstProperty.click();
    }

    public void setAddApplicationBtn()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(AddApplicationBtn));
        AddApplicationBtn.click();
    }

}
