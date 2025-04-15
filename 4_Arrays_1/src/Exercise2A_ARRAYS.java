public class Exercise2A_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 2A
//        Develop a program that, given an array of integers, displays the
//        number of numbers that are positive.

        int [] numbers = {1,-2,3,-4,5,-6,7,-8,9,-10};
        int output= 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                output++;
            }
        }

        System.out.print("Positive numbers: "+ output);
    }
}
