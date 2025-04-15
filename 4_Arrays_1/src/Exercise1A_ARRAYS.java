public class Exercise1A_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 1A
//        Develop a program that, given an array of integers, displays
//        the positive numbers on the screen.

        int[] numbers = {1, -2, 3, 4, -5, 6, 7, -8, 9, -10};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}