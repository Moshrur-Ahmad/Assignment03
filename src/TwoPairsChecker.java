import java.util.*;
public class TwoPairsChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter four integers separated by spaces:");
        int[] numbers = new int[4];
        for (int i = 0; i < 4; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        if ((numbers[0] == numbers[1] && numbers[2] == numbers[3]) || (numbers[0] == numbers[2] && numbers[1] == numbers[3]) || (numbers[0] == numbers[3] && numbers[1] == numbers[2])) {
            System.out.println("two pairs");
        } else {
            System.out.println("not two pairs");
        }

        scanner.close();
    }
}
