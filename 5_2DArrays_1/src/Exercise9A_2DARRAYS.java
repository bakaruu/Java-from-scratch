import java.util.Random;
import java.util.Scanner;

public class Exercise9A_2DARRAYS {
    public static void main(String[] args) {
//        EXERCISE 9A
//        Create a program that arranges two arrays, one of numbers between 0 and
//        9 inclusive and one of Booleans. The user marks positions in the Boolean
//        array, which correspond in the integer array.
//        The objective is to add up all the marked positions and see if the sum
//        corresponds to a random number generated and displayed at the beginning
//        of the program so that the user knows how far he has to go.
//        The user can dial N numbers (set in a fixed way at the beginning of the
//        programme). When the user dials them, these numbers are added up and it
//        is shown whether the user has succeeded or not.

        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();

        int[][] board = {
                {4, 2, -8, 7, 3},
                {2, -7, 0, 3, 1},
                {1, 0, 8, 4, -6},
                {0, 9, 3, 1, -2}
        };

        boolean[][] selected = new boolean[board.length][board[0].length];

        int targetNumber = generator.nextInt(41); // random number between 0 and 40
        int row, col, sum = 0;
        int option;

        do {
            for (int i = 0; i < selected.length; i++) {
                for (int j = 0; j < selected[0].length; j++) {
                    if (selected[i][j]) {
                        // Print selected numbers in red
                        System.out.print("\u001B[31m" + board[i][j] + "\u001B[30m ");
                    } else {
                        System.out.print(board[i][j] + " ");
                    }
                }
                System.out.println();
            }

            System.out.println("Your goal is to sum: " + targetNumber);
            System.out.println("1. Add number");
            System.out.println("2. Remove number");
            System.out.println("3. Check sum");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Mark a cell");
                    System.out.print("Row: ");
                    row = scanner.nextInt();
                    System.out.print("Column: ");
                    col = scanner.nextInt();
                    selected[row][col] = true;
                    break;
                case 2:
                    System.out.println("Unmark a cell");
                    System.out.print("Row: ");
                    row = scanner.nextInt();
                    System.out.print("Column: ");
                    col = scanner.nextInt();
                    selected[row][col] = false;
                    break;
                case 3:
                    System.out.println("Let's check if your sum is correct");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (option != 3);

        for (int i = 0; i < selected.length; i++) {
            for (int j = 0; j < selected[0].length; j++) {
                if (selected[i][j]) {
                    sum += board[i][j];
                }
            }
        }

        if (sum == targetNumber) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

    }
}
