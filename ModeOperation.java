import java.util.Scanner;

public class ModeOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integers");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("What number do you want to find it's mode: ");
        int mode = scanner.nextInt();

        scanner.close();
    }
}
