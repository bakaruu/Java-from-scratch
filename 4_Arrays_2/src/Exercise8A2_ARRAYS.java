public class Exercise8A2_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 8A
//        Develop a program that, starting from an array and an integer,
//        shows us the first position in the array where the number is found.
//        If it does not find it, show -1.

        int[] numbers = {5, 8, 32, 7, 3, 9, 3, 6};
        int num = 3;
        int position = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == num) {
                position = i;
                break; // stop at the first match
            }
        }

        System.out.println("First position of the number: " + position);

    }
}
