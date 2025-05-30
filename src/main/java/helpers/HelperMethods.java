package helpers;
import org.apache.commons.lang3.RandomStringUtils;
import java.util.Random;

public class HelperMethods
{


        /**
         * Generates a random Indian PAN number with the 4th character fixed as 'P'.
         * The format will be: [3 random letters] P [1 random letter] [4 random digits] [1 random letter]
         * e.g., similar to GCFPA6789A, but with random components.
         *
         * @return A randomly generated PAN number string with 'P' at the 4th position.
         */
        public static String generateRandomPanWithPStatus()
        {
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

        public static void main(String[] args)
        {
            HelperMethods generator = new HelperMethods();
            System.out.println("Generated PAN with 'P': " + generator.generateRandomPanWithPStatus());
            System.out.println("Generated PAN with 'P': " + generator.generateRandomPanWithPStatus());
            System.out.println("Generated PAN with 'P': " + generator.generateRandomPanWithPStatus());
            System.out.println("Generated PAN with 'P': " + generator.generateRandomPanWithPStatus());
        }

}
