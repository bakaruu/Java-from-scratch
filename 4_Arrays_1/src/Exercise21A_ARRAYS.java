public class Exercise21A_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 21A
//        Develop a program that, given an array, modifies it by replacing
//        each value by its double.

        int[] arr = {1, 3, 5, 7, 9};


        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }


        System.out.print("Modified array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
