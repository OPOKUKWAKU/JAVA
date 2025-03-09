import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] numbers = new int[3][3];
        System.out.print("Enter any even numbers from 1-19: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }
        for (int[] number : numbers) {
            for (int num : number) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        int leadingDiagonalProduct = numbers[0][0] * numbers[1][1] * numbers[2][2];
        System.out.println("The product of the leading diagonal is " + leadingDiagonalProduct);

        int trailingDiagonalProduct = numbers[0][2] * numbers[1][1] * numbers[2][0];
        System.out.println("The product of the trailing diagonal " + trailingDiagonalProduct);

        int diffDiagonal = trailingDiagonalProduct - leadingDiagonalProduct;
        System.out.println("The differnce between the trailing and the leading diagonal is " + diffDiagonal);

        scanner.close();
    }
}