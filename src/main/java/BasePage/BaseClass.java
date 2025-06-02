package BasePage;

import PageObjects.*;
import helpers.HelperMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseClass {

    public static WebDriver driver; // Keep it static for easy access in current setup
    public static WithOtpCls LoginWithOtp;
    public static HelperMethods helpers; // Declare static HelperMethods instance

    // Using TestNG annotations for setup and teardown

    @BeforeMethod
    public static void launchdriver() { // Renamed from launchdriver for TestNG context
        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");
        // options.addArguments("--disable-gpu");
        // options.addArguments("--window-size=1920,1080"); // Good for headless

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // Adjusted implicit wait

        driver.get("https://portal.uat.creditsaison.xyz/signin");

        // Initialize Page Objects and HelperMethods after driver is set up
        LoginWithOtp = new WithOtpCls(driver);
        helpers = new HelperMethods(driver); // Initialize HelperMethods here
    }

    @AfterMethod
    public void tearDown(ITestResult result) {

        // Get the test method name for the screenshot filename
        String testMethodName = result.getMethod().getMethodName();
        String status;

        if (result.getStatus() == ITestResult.FAILURE) {
            status = "Failed";
            System.out.println("Test method '" + testMethodName + "' failed. Taking screenshot...");
            helpers.takeScreenshot(testMethodName, status); // Call the moved screenshot method
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            status = "Passed";
            System.out.println("Test method '" + testMethodName + "' passed. Taking screenshot (optional)...");
            // Optional: Take screenshot on success
            // takeScreenshot(testMethodName, status); // Call the moved screenshot method
        }


        if (driver != null) {
            driver.quit();
        }
    }
}






















    /*
    public static void launchdriver() {
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


        // DashboardpageDetails=new DashBoard(driver);
        LoginWithOtp = new WithOtpCls(driver);

    }
    */


