public class Exercise2A {

    public static void main(String[] args) {
//        EXERCISE 2A
//        Develop an application that calculates the area and perimeter of a circle.

        final double PI = 3.141592653589793;
//        or
//        double PI = Math.PI;
        double radius = 5.0;
        double perimeter = 2 * PI * radius;
        double area = PI * radius * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
