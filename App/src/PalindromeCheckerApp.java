/**
 * ===========================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * ===========================================================
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares the original and reversed strings
 * - Displays the validation result
 *
 * This introduces transformation-based validation.
 *
 * @author Developer
 * @version 3.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = args.length == 0 ? "" : args[0];

        if (input.isBlank()) {
            System.out.println("Please provide a text value to validate (e.g. \"level\").");
            return;
        }

        StringBuilder reversedBuilder = new StringBuilder(input.length());

        // Iterate from the last character to the first.
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedBuilder.append(input.charAt(i));
        }

        String reversed = reversedBuilder.toString();

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);

        if (input.equals(reversed)) {
            System.out.println("Validation result: The string is a palindrome.");
        } else {
            System.out.println("Validation result: The string is not a palindrome.");
        }
    }
}
