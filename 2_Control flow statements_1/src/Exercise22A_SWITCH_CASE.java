import java.util.Scanner;

public class Exercise22A_SWITCH_CASE {
    public static void main(String[] args) {
//        EXERCISE 22A
//        Create a program, using the if-else and switch-case structure,
//            that transforms an amount of money in euros to yen, dollars
//        or bitcoins, depending on the user's choice, and displays the result
//        on the screen. First it will ask for the amount of money to
//      transform, if the amount of money is negative it will show an error
//      message, otherwise it will show the possible conversions that can be
//      done, and then asking the user to write the name of the currency (String).
//        By means of a switch case structure, if the currency chosen
//        is correct, the result of the conversion will be shown on the screen
//        , if the user's answer does not coincide with any of the available
//      currencies, an error message will be displayed. The equivalences between
//        currencies that will be used for this exercise are the following:
//
//        1 euro = 1.16 dólares |
//                1 euro = 131.79 yenes |
//                1 euro = 0.000024 bitcoins

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the amount in euros to convert: ");
        double euros = scanner.nextDouble();


        if (euros < 0) {
            System.out.println("Error: Amount cannot be negative.");
        } else {

            System.out.println("Available currencies for conversion:");
            System.out.println("- yen");
            System.out.println("- dollar");
            System.out.println("- bitcoin");
            System.out.print("Enter the currency name: ");
            String currency = scanner.next().toLowerCase();


            final double TO_DOLLARS = 1.16;
            final double TO_YEN = 131.79;
            final double TO_BITCOIN = 0.000024;


            switch (currency) {
                case "dollar":
                    System.out.printf("%.2f euros = %.2f dollars\n", euros, euros * TO_DOLLARS);
                    break;

                case "yen":
                    System.out.printf("%.2f euros = %.2f yen\n", euros, euros * TO_YEN);
                    break;

                case "bitcoin":
                    System.out.printf("%.2f euros = %.8f bitcoins\n", euros, euros * TO_BITCOIN);
                    break;

                default:
                    System.out.println("Error: Currency not recognized.");
                    break;
            }
        }


    }
}
