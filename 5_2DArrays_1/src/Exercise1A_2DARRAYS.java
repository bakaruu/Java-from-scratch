public class Exercise1A_2DARRAYS {
    public static void main(String[] args) {
//        EXERCISE 1A
//        Develop a program which, given a matrix, displays the sum of
//        all its elements.
        int[][] matrix = {{1, 2, 3}, {2, 3, 5}};


        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {           // Rows
            for (int j = 0; j < matrix[i].length; j++) {    // Columns
                sum += matrix[i][j];
            }
        }

        System.out.println("Sum of all elements: " + sum);
    }
}