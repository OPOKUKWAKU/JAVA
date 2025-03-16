import java.util.Scanner;

public class LastOccurence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        System.out.println("Enter " + size + " integers");
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the number you want to find it's last occurence: ");
        int target = scanner.nextInt();

        int lastOccurence = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                lastOccurence = i + 1;
            }
        }

        if (lastOccurence != -1) {
            System.out.println("The last occurence is " + lastOccurence);
        } else {
            System.out.println(target + " is not found in the array");
        }

        scanner.close();
    }
}