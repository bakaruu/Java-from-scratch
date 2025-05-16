public class Exercise4A_2DARRAYS {
    public static void main(String[] args) {

//        Linear Search in a 2D Array

        int[][] table = {
                {6, 3, 2},  // position 0
                {9, 7, 0},  // position 1
                {0, 4, 2},  // position 2
                {1, 0, 1}   // position 3
        };

        int max = table[0][0];
        int max_i = 0;
        int max_j = 0;

        // With this algorithm, we can also find the positions
        // where the result is located
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] > max) {
                    max = table[i][j];
                    max_i = i;
                    max_j = j;
                }
            }
        }

        System.out.println(max);
        System.out.println("The highest value is at position: " + max_i + " " + max_j);


    }
}
