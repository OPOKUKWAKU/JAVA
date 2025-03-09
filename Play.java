import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to know whether is prime or not: ");
        int prime = scanner.nextInt();

        if (prime / prime == 1) {
            System.out.println("This number " + prime + " is a prime number");
        } else {
            System.out.println("The " + prime + " is not prime");
        }

        scanner.close();
    }
}
