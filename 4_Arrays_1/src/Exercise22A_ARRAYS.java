public class Exercise22A_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 22A
//        Develop a program that, given an array, modifies it
//        by replacing each value by the result of multiplying it by
//        its index, for example:
//        [1, 2, 3, 4]  [1*0,2*1,3*2,4*3] = [0, 2, 6, 12]

        int[] arr = {1, 3, 5, 7, 9};


        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * i;
        }


        System.out.print("Modified array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }


    }
}
