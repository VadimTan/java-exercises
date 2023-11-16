import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five numbers");

        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int currentNumber = scanner.nextInt();

            if (currentNumber < 0) {
                negativeCount++;
            } else if (currentNumber > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }

        scanner.close();

        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of zeros: " + zeroCount);
    }
}
