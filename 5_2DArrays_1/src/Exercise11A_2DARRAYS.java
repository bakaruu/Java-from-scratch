import java.util.Scanner;

public class Exercise11A_2DARRAYS {
    public static void main(String[] args) {
//        EXERCISE 11A

//        Create a program that starting from the following matrix:
//        {1, 2, 3, 4},
//        {5, 6, 7, 8},
//        {9, 10, 11, 12},
//        {13, 14, 15, 16}

//        Ask for a valid position of the matrix and show us by screen all the
//        numbers in its neighbouring environment, for example, if the position
//        was row 2 and column 1 it should show 5,6,7,9,11,13,14,15 (it does not
//        matter the order) the numbers surrounding 10. We must take into account
//        that the position can be in an edge and not leave the matrix, for example,
//        if the position was row 0 column 4 it should show 3,7,8.
//        Make more versions with the same statement:
//           Show how many neighbours a position has (it may be on an edge).
//           Show the sum of the neighbours of a position.
//           Store in a variable which neighbours of a position are ‘visitable’
//          (use boolean).
//           Visit only the top, bottom, left and right neighbour (CROSS).
//           Visit only the top-left, top-right, bottom-left and bottom-right
//          neighbour (DIAGONALS)


        Scanner scanner = new Scanner(System.in);
        int[][] board = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int row, col;
        System.out.print("Row: ");
        row = scanner.nextInt();
        System.out.print("Column: ");
        col = scanner.nextInt();

        // ALL 8 directions (up, down, left, right, diagonals)
        int[] offset_row = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] offset_col = {-1, 0, 1, -1, 1, -1, 0, 1};

        // CROSS only (up, down, left, right)
//        int[] offset_row = { -1, 0, 0, 1 };
//        int[] offset_col = { 0, -1, 1, 0 };

        // DIAGONALS only
//        int[] offset_row = { -1, -1, 1, 1 };
//        int[] offset_col = { -1, 1, -1, 1 };

        // COUNT NEIGHBORING CELLS (visitable positions)
        int count = 0;
        for (int k = 0; k < offset_col.length; k++) {
            if (row + offset_row[k] >= 0
                    && col + offset_col[k] >= 0
                    && row + offset_row[k] < board.length
                    && col + offset_col[k] < board[0].length) {

                count++;
            }
        }
        System.out.println("It has " + count + " neighbors");

        // SUM OF NEIGHBORING VALUES
        int sum = 0;
        for (int k = 0; k < offset_col.length; k++) {
            if (row + offset_row[k] >= 0
                    && col + offset_col[k] >= 0
                    && row + offset_row[k] < board.length
                    && col + offset_col[k] < board[0].length) {

                sum += board[row + offset_row[k]][col + offset_col[k]];
            }
        }
        System.out.println("Sum of surrounding values: " + sum);

        // MARK VISITABLE NEIGHBORING POSITIONS
        boolean[] visitable = new boolean[offset_row.length];
        for (int k = 0; k < offset_col.length; k++) {
            if (row + offset_row[k] >= 0
                    && col + offset_col[k] >= 0
                    && row + offset_row[k] < board.length
                    && col + offset_col[k] < board[0].length) {

                visitable[k] = true;
            }
        }
        System.out.println("Visitable positions:");
        for (int k = 0; k < visitable.length; k++) {
            if (visitable[k]) {
                System.out.println((row + offset_row[k]) + " " + (col + offset_col[k]));
            }
        }

        // COMMENTED ALTERNATIVE IMPLEMENTATIONS BELOW...
        /*
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i != 0 || j != 0) {
                    if (row + i >= 0 &&
                        col + j >= 0 &&
                        row + i < board.length &&
                        col + j < board[0].length) {
                        System.out.print(board[row + i][col + j] + " ");
                    }
                }
            }
            System.out.println();
        }

        if (row - 1 >= 0 && col - 1 >= 0) {
            System.out.println(board[row - 1][col - 1]);
        }

        if (row - 1 >= 0) {
            System.out.println(board[row - 1][col]);
        }

        System.out.println(board[row - 1][col + 1]);
        System.out.println(board[row][col - 1]);
        System.out.println(board[row][col + 1]);

        if (row + 1 < board.length) {
            System.out.println(board[row + 1][col - 1]);
        }

        System.out.println(board[row + 1][col]);
        System.out.println(board[row + 1][col + 1]);
        */
    }
}
