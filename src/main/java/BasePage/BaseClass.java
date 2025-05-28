package BasePage;
/*
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseClass
{

    public static WebDriver driver;

    public static void launchdriver()
    {


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }

}
*/


import PageObjects.DashBoard;
import PageObjects.PartnerDetails;
import PageObjects.WithOtpCls;
import StepDefinations.WithOtpLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseClass
{

    public static WebDriver driver;
    public static DashBoard db;
    public static PartnerDetails parnter;
   public static  WithOtpCls LoginWithOtp;



    public static void launchdriver()
    {
        // Set Chrome Options (optional)
        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless"); // Uncomment to run in headless mode
        // options.addArguments("--disable-gpu"); // Disable GPU (optional)

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        // Implicit wait adjusted to 10 seconds (better than 3000ms)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        // Open login URL
        driver.get("https://portal.uat.creditsaison.xyz/signin");


        db=new DashBoard(driver);
        parnter=new PartnerDetails(driver);
       LoginWithOtp=new WithOtpCls(driver);




    }
}
