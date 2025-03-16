import java.util.Scanner;

public class MatrixCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] numbersEven = new int[3][3];
        System.out.print("Enter any even numbers from 1-19: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                numbersEven[i][j] = scanner.nextInt();
            }
        }

        int[][] numbersOdd = new int[3][3];
        System.out.println("Enter odd numbers from 1-19: ");

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                numbersOdd[x][y] = scanner.nextInt();
            }
        }

        for (int[] numbers : numbersOdd) {
            for (int nums : numbers) {
                System.out.print(nums + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int[] number : numbersEven) {
            for (int num : number) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        int leadingDiagonalProductEven = numbersEven[0][0] * numbersEven[1][1] * numbersEven[2][2];
        System.out.println("\nThe product of the even leading diagonal is " + leadingDiagonalProductEven);

        int trailingDiagonalProductEven = numbersEven[0][2] * numbersEven[1][1] * numbersEven[2][0];
        System.out.println("\nThe product of the even trailing diagonal " + trailingDiagonalProductEven);

        int diffDiagonal = trailingDiagonalProductEven - leadingDiagonalProductEven;
        System.out.println("\nThe differnce between the trailing and the leading diagonal is " + diffDiagonal);

        int trailingDiagonalProductOdd = numbersOdd[0][2] * numbersOdd[1][1] * numbersOdd[2][0];
        System.out.println("\nThe product of the odd trailing diagonal is " + trailingDiagonalProductOdd);

        int diffTrailingDiagonal = trailingDiagonalProductOdd - trailingDiagonalProductEven;
        System.out.println("\nThe differnce between the odd and even trailing diagonal is " + diffTrailingDiagonal);
        scanner.close();
    }
}