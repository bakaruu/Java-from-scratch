public class Exercise19A_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 19A
//        Develop a program that creates two arrays of integers and creates
//        another one containing the largest numbers for each position in the
//        array. For example, if we have [2,5,6] and [-1,7,4] the result should
//        be [2,7,6]. We assume they have the same size.

        int[] arr1 = {2, 5, 6};
        int[] arr2 = {-1, 7, 4};
        int[] result = new int[arr1.length]; // same size assumed

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr2[i]) {
                result[i] = arr1[i];
            } else {
                result[i] = arr2[i];
            }
        }

        //for each
        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }


    }
}
