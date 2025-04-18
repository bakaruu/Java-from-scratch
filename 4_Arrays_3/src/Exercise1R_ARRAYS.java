public class Exercise1R_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 1R
//        Develop a program that, given an array of integers, displays the sum of
//        all its elements squared. For example:
//        With the array [1, 2, 2] it should display 9 because 12 + 22 + 22 = 9.

        int[] arr = {1, 2, 2};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] * arr[i];
        }

        System.out.println("Sum of squares: " + sum);
    }


}