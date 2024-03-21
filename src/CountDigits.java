import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        if (number < 0) {
            number *= -1;
        }

        int digitCount = 1;
        int temp = number;

        while (temp >= 10) {
            temp /= 10;
            digitCount++;
        }

        System.out.println("The number has " + digitCount + " digits.");
    }
}

