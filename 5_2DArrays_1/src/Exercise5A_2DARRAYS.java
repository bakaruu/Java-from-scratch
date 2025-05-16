import java.util.Scanner;

public class Exercise5A_2DARRAYS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Develop a program that, given a matrix and a row number (assumed valid),
        // displays the sum of the elements in that row.

        int[][] table = {
                {6, 3, 2},   // position 0
                {9, 7, 0},   // position 1
                {0, 4, 2},   // position 2
                {1, 0, 1}    // position 3
        };

        int row, sum = 0;

        System.out.print("Enter the row you want to sum: ");
        row = scanner.nextInt();

        // This is to sum the elements of a row in the matrix,
        // so we create a variable to store the row number
        for (int j = 0; j < table[row].length; j++) {
            sum += table[row][j];
        }

        System.out.println("The sum of row " + row + " is " + sum);
    }
}

