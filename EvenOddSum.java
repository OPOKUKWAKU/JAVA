import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of positive integers: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter the " + size + " positive integers");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        double evenSum = 0;
        double oddSum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenSum += number;
            }
            if (number % 2 != 0) {
                oddSum += number;
            }
        }
        System.out.println("The sum of the even numbers is " + evenSum);
        System.out.println("The sum of the odd numbers is " + oddSum);

        scanner.close();
    }
}
