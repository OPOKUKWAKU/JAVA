import java.util.Scanner;

public class First {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("************");
            System.out.println("BANKING PROGRAM");
            System.out.println("**********");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("**********");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

        System.out.println("**********");
        System.out.println("Thank you! Have  a nice day");
        System.out.println("\n**********");

        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.println("**********");
        System.out.printf("$%.2f\n", balance);
    }

    static double deposit() {
        double amount;
        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount can't be negative");
        } else {
            return amount;
        }
        return 0;
    }

    static double withdraw(double balance) {
        double amount;
        System.out.print("Enter the amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }
    }
}
/*
 * char[][] telephone = { { '1', '2', '3' },
 * { '4', '5', '6' },
 * { '7', '8', '9' },
 * { '*', '0', '#' } };
 * 
 * for (char[] row : telephone) {
 * for (char number : row) {
 * System.out.print(number + " ");
 * }
 * System.out.println();
 * }
 */