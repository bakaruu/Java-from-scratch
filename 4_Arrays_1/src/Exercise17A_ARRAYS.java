public class Exercise17A_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 17A
//        Develop a program that, given an array of integers, creates a
//        new array of the same size, but with the elements in reverse order.

        int[] arr1 = {1, 2, 3};
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[arr1.length - 1 - i];
        }


        for (int j : arr2) {
            System.out.print(j + " ");
        }
    }
}
