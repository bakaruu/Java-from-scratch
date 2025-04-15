public class Exercise24A_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 23A
//        Develop a program that, given an array of integers and two integers,
//        replaces the occurrences of the first number with the second.
//        For example, if we call the method with {1,5,8,1,7,8} with
//        the numbers 8 and 3, it must modify the array to {1,5,3,1,7,3}.


        int[] arr = {1, 5, 8, 1, 7, 8};
        int toReplace = 8;
        int replacement = 13;

        // Replace all occurrences of 'toReplace' with 'replacement'
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toReplace) {
                arr[i] = replacement;
            }
        }

        // Print modified array
        System.out.print("Modified array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
