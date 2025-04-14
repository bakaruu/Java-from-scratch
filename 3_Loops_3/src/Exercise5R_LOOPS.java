import java.util.Scanner;

public class Exercise5R_LOOPS {
    public static void main(String[] args) {
//        EXERCISE 5R
//        Make a program that asks for 2 integers and performs their
//        division by successive subtractions. Check that it does not divide
//        by 0.


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();


        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }


        int quotient = 0;
        int remainder = dividend;

        while (remainder >= divisor) {
            remainder -= divisor;
            //System.out.println(remainder);
            quotient++;
        }


        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

    }
}
