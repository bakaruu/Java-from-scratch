package ArrayUtilities;

public class ArrayOperations {


//    EXERCISE 3
//    Create a class called ArrayOperations within the utilities.arrays package containing the
//    following methods:
//    1) Develop a method that given two arrays of integers returns another one containing the
//    largest numbers for each position in the array. For example, if we have [2,5,6] and
//    [-1,7,4] the result should be [2,7,6]. We assume that they have the same size.
//    2) Develop a method that, given an array of integers and two integers, substitutes
//    the occurrences of the first number for the second. For example, if we call the method
//    with {1,5,8,1,7,8} with the numbers 8 and 3 it should modify (not a new one) the array
//    to {1,5,3,1,7,3}.
//    3) Develop a method that receives an array of int and returns a new inverted one.
//    Create a String array version of the same program.
//    4) Develop a method that given two integer arrays returns the sum array of them.
//    5) Develop a method which, given an array of integers, returns the matrix transpose.


    public static int[] maxValuesAtEachPosition(int[] a, int[] b) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) {
                result[i] = a[i];
            } else {
                result[i] = b[i];
            }
        }
        return result;
    }

    public static void replaceOccurrences(int[] array, int from, int to) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == from) {
                array[i] = to;
            }
        }
    }

    public static int[] invertIntArray(int[] array) {
        int[] inverted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            inverted[i] = array[array.length - 1 - i];
        }
        return inverted;
    }

    public static String[] invertStringArray(String[] array) {
        String[] inverted = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            inverted[i] = array[array.length - 1 - i];
        }
        return inverted;
    }

    public static int[] sumArrays(int[] a, int[] b) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] + b[i];
        }
        return result;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
}
