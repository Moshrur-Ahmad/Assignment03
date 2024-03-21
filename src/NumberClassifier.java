import java.util.Scanner;
public class NumberClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        double number = scanner.nextDouble();

        if (number == 0) {
            System.out.println("zero");
        } else if (number > 0) {
            if (Math.abs(number) < 1) {
                System.out.println("positive small");
            } else if (number > 1000000) {
                System.out.println("positive large");
            } else {
                System.out.println("positive");
            }
        } else {
            if (Math.abs(number) < 1) {
                System.out.println("negative small");
            } else if (Math.abs(number) > 1000000) {
                System.out.println("negative large");
            } else {
                System.out.println("negative");
            }
        }

        scanner.close();
    }
}
