import java.util.Scanner;

public class Exercise4A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        EXERCISE 4A
//        Write a program that receives as input the lengths of the two legs of a
//        right triangle, and outputs the length of the hypotenuse an of the triangle,
//        given by the Pythagorean theorem.
//        Math.sqrt()


        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();


        double hypotenuse = Math.sqrt(a * a + b * b);


        System.out.println("The hypotenuse is: " + hypotenuse);

    }
}
