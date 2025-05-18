import utilities.BasicUtilities;


public class Exercise1 {
    public static void main(String[] args) {
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


        System.out.println(BasicUtilities.circleLength(5));
        System.out.println(BasicUtilities.rectangle(3, 5));
        System.out.println(BasicUtilities.trianglePattern(4, 'A', 'B', 'C'));


    }
}