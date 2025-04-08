import java.util.Scanner;

public class Exercise7A_FOR_LOOP {
    public static void main(String[] args) {
//        EXERCISE 7A
//        Develop an application that calculates the power of a base
//        with a positive exponent (it is not necessary to check that the
//        exponent is positive) without using the pow function of the Math class.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base = scanner.nextInt();

        int output = base;

        System.out.println("Enter the exponent: ");
        int exponent = scanner.nextInt();

        if (exponent == 0) {
            output = 1;
        } else {
            for (int i = 1; i < exponent; i++) {
                output *= base;
            }
        }


        System.out.println(output);
    }
}
