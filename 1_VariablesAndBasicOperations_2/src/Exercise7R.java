import java.util.Scanner;

public class Exercise7R {
    public static void main(String[] args) {
//        EXERCISE 7R
//        Write a program that asks the user for an amount to invest (Co),
//        the annual interest rate (R) and the number of years (n),
//        and displays the final capital (Cn).annual interest rate (R) and
//        the number of years (n), and displays the final capital (Cn) obtained from
//        the investment. obtained on the investment.

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter initial investment (C0): ");
        double initialCapital = scanner.nextDouble();

        System.out.print("Enter annual interest rate (R) in %: ");
        double interestRate = scanner.nextDouble();

        System.out.print("Enter number of years (n): ");
        int years = scanner.nextInt();

        double finalCapital = initialCapital * Math.pow(1 + interestRate / 100, years);

        System.out.printf("Final capital after %d years: %.2f €\n", years, finalCapital);

    }
}
