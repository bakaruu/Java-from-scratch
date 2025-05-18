import Utilities.BasicUtilities;
import ArrayUtilities.ArrayUtilities;
import ArrayUtilities.ArrayOperations;


public class Main {
    public static void main(String[] args) {

//        Exercise1 trys
        System.out.println(BasicUtilities.circleLength(5));
        System.out.println(BasicUtilities.rectangle(3, 5));
        System.out.println(BasicUtilities.trianglePattern(4, 'A', 'B', 'C'));


//        Exercise2 trys
        int[] intArray = {3, 5, 0, 7, 0};
        double[] doubleArray = {2.5, 3.0, 4.5};
        String[] stringArray = {"apple", "banana", "cherry"};

        System.out.println("=== intArrayToString ===");
        System.out.println(ArrayUtilities.intArrayToString(intArray));

        System.out.println("\n=== doubleArrayToString ===");
        System.out.println(ArrayUtilities.doubleArrayToString(doubleArray));

        System.out.println("\n=== sum(int[]) ===");
        System.out.println("Sum: " + ArrayUtilities.sum(intArray));

        System.out.println("\n=== sum(double[]) ===");
        System.out.println("Sum: " + ArrayUtilities.sum(doubleArray));

        System.out.println("\n=== max(int[]) ===");
        System.out.println("Max: " + ArrayUtilities.max(intArray));

        System.out.println("\n=== indexOf(int[], 7) ===");
        System.out.println("Index of 7: " + ArrayUtilities.indexOf(intArray, 7));

        System.out.println("\n=== indexOf(int[], 99) ===");
        System.out.println("Index of 99: " + ArrayUtilities.indexOf(intArray, 99));

        System.out.println("\n=== indexOf(String[], \"banana\") ===");
        System.out.println("Index of 'banana': " + ArrayUtilities.indexOf(stringArray, "banana"));

        System.out.println("\n=== indexOf(String[], \"orange\") ===");
        System.out.println("Index of 'orange': " + ArrayUtilities.indexOf(stringArray, "orange"));

        System.out.println("\n=== hasOnlyZeros ===");
        System.out.println("Only zeros? " + ArrayUtilities.hasOnlyZeros(new int[]{0, 0, 0}));
        System.out.println("Only zeros? " + ArrayUtilities.hasOnlyZeros(intArray));

//        Exercise 3

        int[] array1 = {2, 5, 6};
        int[] array2 = {-1, 7, 4};

        System.out.println("=== maxValuesAtEachPosition ===");
        int[] maxResult = ArrayOperations.maxValuesAtEachPosition(array1, array2);
        printIntArray(maxResult);

        System.out.println("\n=== replaceOccurrences ===");
        int[] original = {1, 5, 8, 1, 7, 8};
        ArrayOperations.replaceOccurrences(original, 8, 3);
        printIntArray(original);

        System.out.println("\n=== invertIntArray ===");
        int[] invertedInt = ArrayOperations.invertIntArray(array1);
        printIntArray(invertedInt);

        System.out.println("\n=== invertStringArray ===");
        String[] strings = {"apple", "banana", "cherry"};
        String[] invertedStrings = ArrayOperations.invertStringArray(strings);
        printStringArray(invertedStrings);

        System.out.println("\n=== sumArrays ===");
        int[] sumResult = ArrayOperations.sumArrays(array1, array2);
        printIntArray(sumResult);

        System.out.println("\n=== transposeMatrix ===");
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] transposed = ArrayOperations.transposeMatrix(matrix);
        printMatrix(transposed);
    }

    public static void printIntArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printStringArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


}