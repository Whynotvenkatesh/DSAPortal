package helpers;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class HelperMethods {

    private WebDriver driver;

    // Constructor to initialize WebDriver for instance-based helper methods
    public HelperMethods(WebDriver driver) {
        this.driver = driver;
    }

    // --- WebDriver-dependent Helper Methods ---
    // Waits for an element to be clickable on the page.
    public WebElement waitForElementClickable(WebElement element, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    //Waits for an element to be clickable on the page using a By locator.
    public WebElement waitForElementClickable(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    //Executes a JavaScript click on an element. Useful for intercepted clicks.
    public void javaScriptClick(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    //Scrolls the browser window to bring a specific element into view.
    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
    }


    //Takes a screenshot and saves it to a specified folder.
    public void takeScreenshot(String scenarioName, String status) {
        if (driver == null) {
            System.err.println("WebDriver is null. Cannot take screenshot.");
            return;
        }

        try {
            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Create timestamp for unique filenames
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));

            // Define the base screenshot directory
            String baseScreenshotDir = System.getProperty("user.dir") + File.separator + "target" + File.separator + "screenshots";

            // Define the status-specific subfolder
            String statusDir = baseScreenshotDir + File.separator + status;

            // Create directories if they don't exist
            File directory = new File(statusDir);
            if (!directory.exists()) {
                directory.mkdirs(); // Creates the directory and any necessary parent directories
            }

            // Define the destination file
            String fileName = scenarioName.replaceAll("[^a-zA-Z0-9.-]", "_") + "_" + timestamp + ".png"; // Sanitize filename
            File destFile = new File(statusDir + File.separator + fileName);

            FileUtils.copyFile(srcFile, destFile);
            System.out.println("Screenshot saved to: " + destFile.getAbsolutePath());

        } catch (IOException e) {
            System.err.println("Failed to take screenshot: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred while taking screenshot: " + e.getMessage());
        }
    }


    //Generates a random username.
    public static String generateRandomUsername() {
        Random random = new Random();
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder username = new StringBuilder("user_");
        for (int i = 0; i < 8; i++) { // 8 random characters
            username.append(characters.charAt(random.nextInt(characters.length())));
        }
        return username.toString();
    }


    //Generates a random 10-digit phone number.
    public static String generateRandomPhoneNumber() {
        Random random = new Random();
        StringBuilder phoneNumber = new StringBuilder("9"); // Starts with 9 or 8 or 7
        for (int i = 0; i < 9; i++) { // 9 more digits
            phoneNumber.append(random.nextInt(10));
        }
        return phoneNumber.toString();
    }

    // Generates a random email address.
    public static String generateRandomEmail() {
        Random random = new Random();
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder email = new StringBuilder("test_");
        for (int i = 0; i < 8; i++) {
            email.append(characters.charAt(random.nextInt(characters.length())));
        }
        email.append("@example.com");
        return email.toString();
    }
}
// public static String generateRandomAlphaNumeric(int length) { ... }


/**
 * Generates a random Indian PAN number with the 4th character fixed as 'P'.
 * The format will be: [3 random letters] P [1 random letter] [4 random digits] [1 random letter]
 * e.g., similar to GCFPA6789A, but with random components.
 *
 * @return A randomly generated PAN number string with 'P' at the 4th position.
 */
      /*
    public static String generateRandomPanWithPStatus() {
        // 1. First 3 characters: Random uppercase letters
        String firstThreeChars = RandomStringUtils.randomAlphabetic(3).toUpperCase();

        // 2. Fourth character: Fixed as 'P' (for Individual)
        char fourthChar = 'P';

        // 3. Fifth character: Random uppercase letter (typically initial of name)
        String fifthChar = RandomStringUtils.randomAlphabetic(1).toUpperCase();

        // 4. Next 4 characters: Random numbers from 0001 to 9999
        Random random = new Random();
        int randomNumbers = random.nextInt(9999) + 1; // Generates a number between 1 and 9999
        String numericPart = String.format("%04d", randomNumbers); // Formats to 4 digits (e.g., 5 -> "0005")

        // 5. Last character: Random uppercase letter (check digit)
        String lastChar = RandomStringUtils.randomAlphabetic(1).toUpperCase();

        // Combine all parts
        return firstThreeChars + fourthChar + fifthChar + numericPart + lastChar;
    }

    public static void main(String[] args) {


        HelperMethods generator = new HelperMethods();
        System.out.println("Generated PAN with 'P': " + generator.generateRandomPanWithPStatus());
        System.out.println("Generated PAN with 'P': " + generator.generateRandomPanWithPStatus());
        System.out.println("Generated PAN with 'P': " + generator.generateRandomPanWithPStatus());
        System.out.println("Generated PAN with 'P': " + generator.generateRandomPanWithPStatus());


    }

}
*/