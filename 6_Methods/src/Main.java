import Utilities.BasicUtilities;
import ArrayUtilities.ArrayUtilities;


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




    }
}