import java.util.Scanner;

public class LargestSmallestIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five integers, one at a time:");

        int largest = Integer.MIN_VALUE; 
        int smallest = Integer.MAX_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter integer " + i + ": ");
            int currentNumber = scanner.nextInt();

            if (currentNumber > largest) {
                largest = currentNumber;
            }

            if (currentNumber < smallest) {
                smallest = currentNumber;
            }
        }

        scanner.close();

        System.out.println("Largest integer: " + largest);
        System.out.println("Smallest integer: " + smallest);
    }
}
