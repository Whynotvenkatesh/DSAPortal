package BasePage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Basepage
{

WebDriver driver;

//Constructor
public Basepage(WebDriver driver)
{
    this.driver=driver;
    PageFactory.initElements(driver,this);
}

}




