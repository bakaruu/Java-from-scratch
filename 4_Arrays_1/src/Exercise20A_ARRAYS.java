public class Exercise20A_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 20A
//        Create a program that, given an array, creates another array of the same
//        size where the value of each position is the multiplication of all the
//        values of the original array except the one in that position.
//        For example, if we have [2, 7, 8, 4] create the array
//        [224, 64, 56,112] that comes from  [7*8*4,2*8*4,2*7*4,2*7*8].

        int[] original = {2, 7, 8, 4};
        int[] result = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            int product = 1;
            for (int j = 0; j < original.length; j++) {
                if (i != j) {
                    product *= original[j];
                }
            }
            result[i] = product;
        }

//      for each
        System.out.print("Result array: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
