public class Exercise23A_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 23A
//        Develop a program that, given an array of integers, changes the sign
//        of the numbers in the array. Positive to negative and vice versa.


        int[] arr = {3, -7, 0, 12, -4, 8, -1};


        for (int i = 0; i < arr.length; i++) {
            arr[i] = -arr[i];
        }


        System.out.print("Array with flipped signs: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
