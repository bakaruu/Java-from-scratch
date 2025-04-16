public class Exercise15A2_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 15A
//        Develop a program that, given an array of integers, adds the numbers
//        in the array until it exceeds 100, in which case it will exit and
//        display the final result. If it does not exceed 100, it will add
//        them all up and display the result as well.

        int[] arr = {10, 20, 30, 25, 15, 20, 8, 12, 45};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > 100) {
                break;
            }
        }

        System.out.println("Final sum: " + sum);

    }
}
