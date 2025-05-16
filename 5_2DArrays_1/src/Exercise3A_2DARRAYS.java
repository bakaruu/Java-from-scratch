public class Exercise3A_2DARRAYS {
    public static void main(String[] args) {
        // Develop a program that, given a matrix, displays the average
        // of the numbers with 3 digits
        int[][] table = {
                {134, 3, 2},     // position 0
                {9, 7, 0},       // position 1
                {0, 222, 2},     // position 2
                {1, 0, 333}      // position 3
        };

        int sum = 0, count = 0;
        double average;

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] >= 100 && table[i][j] < 1000) {
                    count++;
                    sum += table[i][j];
                }
            }
        }

        if (count > 0) {
            average = (double) sum / count;
            System.out.println("The average of the 3-digit numbers is: " + average);
        } else {
            System.out.println("There are no 3-digit numbers in the matrix.");
        }
    }
}
