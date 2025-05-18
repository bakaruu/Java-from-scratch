package utilities;

public class BasicUtilities {

//        EXERCISE 1
//        Create a class called BasicUtilities within the utilities package that contains
//        the following methods:
//        1) A method that receives the radius of a circle and returns its length.
//        Take PI from Math.PI
//        2) A method that receives the radius of a circle and returns its area.
//        Take PI from Math.PI
//        3) A method that receives a quantity and another value representing a
//        percent and returns the percent of that quantity.
//        4) A method that receives two integers and returns the power that results
//        from raising the first number to the second, without using Math.pow Make a
//        version for double as well.
//        5) A method that receives the width and height of a rectangle and returns a
//        String with asterisks, for example, if the height is 3 and the width is 5:
//          * * * * *
//          * * * * *
//          * * * * *
//        6) A method that receives the size of the drawing and 3 characters, e.g. A, B
//        and C of size 4 and returns the following String:
//           CBBB
//           ACBB
//           AACB
//           AAAC
//        7) A method that receives an integer and returns whether it has a digit or not.
//        8) A method that receives 3 numbers and tells us if they are in increasing order
//        or not.
    public static double circleLength(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double percentage(double quantity, double percent) {
        return quantity * percent / 100;
    }

    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static double power(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static String rectangle(int height, int width) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < height; i++) {
            result.append("* ".repeat(width)).append("\n");
        }
        return result.toString();
    }

    public static String trianglePattern(int size, char a, char b, char c) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == size - 1) {
                    result.append(c);
                } else if (j >= size - 1 - i) {
                    result.append(b);
                } else {
                    result.append(a);
                }
            }
            result.append("\n");
        }
        return result.toString();
    }

    public static boolean hasDigit(int number) {
        return Integer.toString(number).matches(".*\\d.*");
    }

    public static boolean isIncreasing(int a, int b, int c) {
        return a < b && b < c;
    }
}
