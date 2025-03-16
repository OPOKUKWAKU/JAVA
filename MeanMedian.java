import java.util.Scanner;

public class MeanMedian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        System.out.println("Enter " + size + " integers: ");
        int numbers[] = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double mean = sum / size;
        System.out.println("The mean is " + mean);

        int median = 0;
        if (size % 2 != 0) {
            int medianPosition = (size + 1) / 2;
            median = numbers[medianPosition - 1];
        } else {
            int median1 = size / 2;
            int median2 = (size / 2) + 1;
            int medianSum = numbers[median1 - 1] + numbers[median2 - 1];
            median = medianSum / 2;
        }
        System.out.println("The median is " + median);

        scanner.close();
    }
}