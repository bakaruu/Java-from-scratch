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

        int[] a = {2, 5, 6};
        int[] b = {-1, 7, 4};

        System.out.println("=== maxArray ===");
        int[] max = ArrayOperations.maxArray(a, b);
        for (int i = 0; i < max.length; i++) {
            System.out.print(max[i] + " ");
        }
        System.out.println();

        System.out.println("\n=== replace ===");
        int[] toReplace = {1, 5, 8, 1, 7, 8};
        ArrayOperations.replace(toReplace, 8, 3);
        for (int i = 0; i < toReplace.length; i++) {
            System.out.print(toReplace[i] + " ");
        }
        System.out.println();

        System.out.println("\n=== reverse (int[]) ===");
        int[] reversedInt = ArrayOperations.reverse(a);
        for (int i = 0; i < reversedInt.length; i++) {
            System.out.print(reversedInt[i] + " ");
        }
        System.out.println();

        System.out.println("\n=== reverse (String[]) ===");
        String[] words = {"apple", "banana", "cherry"};
        String[] reversedStr = ArrayOperations.reverse(words);
        for (int i = 0; i < reversedStr.length; i++) {
            System.out.print(reversedStr[i] + " ");
        }
        System.out.println();

        System.out.println("\n=== sumArrays ===");
        int[] sum = ArrayOperations.sumArrays(a, b);
        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i] + " ");
        }
        System.out.println();

        System.out.println("\n=== transpose ===");
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] transposed = ArrayOperations.transpose(matrix);
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[0].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }


    }
}