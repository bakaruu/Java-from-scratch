public class Exercise4A_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 4A
//        Develop a program that, given an array of integers, displays
//        the average of the numbers in even positions.

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int count = 0;


        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                sum += numbers[i];
                count++;
            }
        }

        if (count > 0) {
            System.out.println("The average of numbers at even positions: " + (sum / count));
        } else {
            System.out.println("No values in even positions.");
        }
    }
}
