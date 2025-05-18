package ArrayUtilities;

public class ArrayUtilities {

//    EXERCISE 2
//    Create a class called UtilitiesArray within the utilities.arrays package containing the following
//    methods:
//    1) A method that receives an array of integers and returns a String with its contents.
//    2) A method that receives an array of integers and returns a String with its content.
//    3) A method that receives an array of integers and returns the sum of all its values.
//    4) Make a version of the previous section but where it receives an array of doubles.
//    5) Develop a method that, given an array of integers, returns the largest value.
//    6) Develop a method that given an array of int and an int number returns the position where it
//    is, -1 otherwise. Create the array version of String to search for a String.
//    7) Develop a method that given an array of integers returns whether it has only zeros or not.

    public static String intArrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int value : array) {
            sb.append(value).append(" ");
        }
        return sb.toString().trim();
    }

    public static String doubleArrayToString(double[] array) {
        StringBuilder sb = new StringBuilder();
        for (double value : array) {
            sb.append(value).append(" ");
        }
        return sb.toString().trim();
    }

    public static int sum(int[] array) {
        int total = 0;
        for (int value : array) {
            total += value;
        }
        return total;
    }

    public static double sum(double[] array) {
        double total = 0;
        for (double value : array) {
            total += value;
        }
        return total;
    }

    public static int max(int[] array) {
        int maxValue = array[0];
        for (int value : array) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public static int indexOf(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean hasOnlyZeros(int[] array) {
        for (int value : array) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }

}
