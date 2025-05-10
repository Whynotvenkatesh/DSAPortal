package PageObjects;

import BasePage.BaseClass;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashBoard extends BaseClass
{
    WebDriver driver;

    //Constructor
    public DashBoard(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    //Elements
   @FindBy(xpath = "//div[@class='ant-col gutter-row css-1m62vyb']//div//div[@class='ant-select ant-select-compact-item ant-select-compact-first-item css-1m62vyb ant-select-single ant-select-show-arrow']")
    WebElement dropdownitemlistbtn;

    // (//div[contains(text(),'Loan Against Property')])[1]
    // //div[contains(text(),'Loan Against Property')]

    @FindBy(xpath ="//div[contains(text(),'Loan Against Property')]" )
    WebElement LoanAgainstProperty;

    //If condition used ----   select option based on choose

    @FindBy(xpath = "//span[normalize-space()='Add Application']")
    WebElement AddApplicatinBtn;

    //Methods

    public void selectdropdown()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(dropdownitemlistbtn));
        dropdownitemlistbtn.click();
    }

    public void setAddApplicatinBtn()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(LoanAgainstProperty));
        LoanAgainstProperty.click();
    }

    public void btnaddapplication()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(AddApplicatinBtn));
        AddApplicatinBtn.click();
    }

}
