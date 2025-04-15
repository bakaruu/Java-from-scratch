public class Exercise16A_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 16A
//        Develop a program that starts from an array and creates another array
//        of the same size but with the elements doubled, for example if the
//        array [1, 2, 3] should create the array [2, 4, 6].


        int[] arr1 = {1, 2, 3};
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {

            arr2[i] = arr1[i] * 2;

        }

        for (int j : arr2) {
            System.out.print(j + " ");
        }
    }
}
