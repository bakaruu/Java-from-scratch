public class Exercise8A_2DARRAYS {
    public static void main(String[] args) {
//        EXERCISE 8A
//        Develop a program which, given a matrix, shows us its transposed matrix
//        in a new matrix.


        int[][] table1 = {
                {3, -5, 4},  // row 0
                {9, 8, -7}   // row 1
        };

        System.out.println("Original table: ");
        for (int i = 0; i < table1.length; i++) {
            for (int j = 0; j < table1[0].length; j++) {
                System.out.print(table1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The transposed table is: ");
        for (int i = 0; i < table1[0].length; i++) {
            for (int j = 0; j < table1.length; j++) {
                System.out.print(table1[j][i] + " ");
            }
            System.out.println();
        }

    }
}
