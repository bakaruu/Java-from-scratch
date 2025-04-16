public class Exercise12A2_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 12A
//        Develop a program that, given an array of integers, displays true if it is
//        a null array (all elements of the array are zeros) or false otherwise.

        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        boolean found = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                found = false;
                break;
            }
        }

        System.out.println("null array?: " + found);
    }
}
