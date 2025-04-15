public class Exercise3A_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 3A
//        Develop a program that, given an array of integers, displays the
//        average of the even numbers.

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int count = 0;


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
                count++;
            }
        }

        if (count > 0) {
            System.out.println("The average of even numbers: " + (sum / count));
        } else {
            System.out.println("No even numbers found.");
        }
    }
}
