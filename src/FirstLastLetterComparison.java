import java.util.Scanner;
public class FirstLastLetterComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Check if the string is not empty
        if (!inputString.isEmpty()) {
            // Extract the first and last characters of the string
            char firstChar = inputString.charAt(0);
            char lastChar = inputString.charAt(inputString.length() - 1);

            // Compare the first and last characters
            if (Character.toLowerCase(firstChar) == Character.toLowerCase(lastChar)) {
                System.out.println("First and last letter are the same.");
            } else {
                System.out.println("First and last letter are different.");
            }
        } else {
            System.out.println("The string is empty.");
        }
    }
}