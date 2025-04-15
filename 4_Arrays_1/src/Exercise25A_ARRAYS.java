public class Exercise25A_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 24A
//        Develop a program as in exercise 22A, but return the result
//        in a new array.


        int[] original = {1, 3, 5, 7, 9};
        int[] result = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            result[i] = original[i] * i;
        }

        // Print result array
        System.out.print("Resulting array: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

}
