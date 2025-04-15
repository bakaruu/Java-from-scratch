public class Exercise7A2_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 7A
//        Develop a program that, starting from an array and an integer, shows a
//        boolean indicating whether the number is in the array or not.

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int num = 3;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == num) {
                found = true;
                break;
            }
        }

        System.out.println("Is the number in the array? " + found);

    }
}
