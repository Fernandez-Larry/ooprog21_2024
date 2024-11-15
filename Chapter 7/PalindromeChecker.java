import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String originalString = userInput.nextLine();
        
        String normalizedString = originalString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedString = new StringBuilder(normalizedString).reverse().toString();

        if (normalizedString.equals(reversedString)) {
            System.out.println("This is a palindrome.");
        } else {
            System.out.println("This is not a palindrome.");
        }
        
        userInput.close();
    }
}
