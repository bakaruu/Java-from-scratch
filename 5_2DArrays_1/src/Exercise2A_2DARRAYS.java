public class Exercise2A_2DARRAYS {
    public static void main(String[] args) {

//        EXERCISE 2A
//        Develop a program that, given an array of integers, displays the number of 1's in the array.
//        1's in the array.

        int[][] numbers = {{1, 1, 3}, {1, 2, 3}, {1, 2, 3}};
        int count = 0;

        //for each great for reading.
        for (int[] row : numbers) {
            for (int value : row) {
                if (value == 1) {
                    count++;
                }
            }
        }

        System.out.println("Count of 1's:  " + count);

    }
}
