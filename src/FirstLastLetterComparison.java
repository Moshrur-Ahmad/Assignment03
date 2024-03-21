import java.util.Scanner;
public class FirstLastLetterComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();
        if (!inputString.isEmpty()) {
            char firstChar = inputString.charAt(0);
            char lastChar = inputString.charAt(inputString.length() - 1);
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