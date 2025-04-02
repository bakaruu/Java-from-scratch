import java.util.Scanner;

public class Exercise3R {
    public static void main(String[] args) {
//        EXERCISE 3R
//        We want to evaluate a polynomial of integer coefficients,
//        for a value of the unknown that the user is asked to enter from
//        the keyboard. The polynomial in question is the following:

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value for X: ");
        double x = scanner.nextDouble();

        double result = (x * x * x * x * x)
                + 7 * (x * x * x * x)
                - 4 * (x * x * x)
                + 2 * (x * x)
                - x
                + 10;

        System.out.printf("f(%.2f) = %.2f\n", x, result);

    }
}
