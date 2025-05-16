public class Exercise6A_2DARRAYS {
    public static void main(String[] args) {
        // Develop a program that, given two matrices (assumed to be the same size),
        // creates a new matrix that is the sum of the two. For example:

        // A square matrix is one with equal rows and columns: 3x3, 2x2, etc.
        int[][] table1 = {
                {3, -5, 4},    // position 0
                {9, 8, -7},    // position 1
                {-6, 4, 2}     // position 2
        };

        int[][] table2 = {
                {-2, -1, 1},   // position 0
                {5, -7, 6},    // position 1
                {9, 3, 2}      // position 2
        };

        // rows           // columns
        int[][] result = new int[table1.length][table1[0].length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = table1[i][j] + table2[i][j];
            }
        }

        // PRINT RESULTING MATRIX
        for (int i = 0; i < result.length; i++) {
            // When the matrices have the same size, it's okay to use 'i';
            // otherwise, use result[0] for columns.
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
