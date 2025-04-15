public class Exercise6A_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 6A
//        Develop a program that, given two arrays of integers, shows the
//        scalar product of both arrays. The scalar product consists of
//        multiplying the numbers in correlative positions and adding the
//        results. If they do not have the same size, display an error message.

//        [2]       [1]
//        [8]   ·   [-7]   =  2×1 + 8×(-7) + (-4)×3 = -66
//        [-4]      [3]

        int[] arr1 = {2, 8, -4};
        int[] arr2 = {1, -7, 3, 2};
        int sum = 0;

        if (arr1.length != arr2.length) {
            System.out.println("Error: Arrays must be of the same size.");
            return;
        }else{
            for (int i = 0; i < arr1.length; i++) {
                sum += arr1[i] * arr2[i];
            }

            System.out.println("The scalar product: " + sum);
        }



    }
}
