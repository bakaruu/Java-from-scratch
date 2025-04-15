import java.util.Scanner;

public class Exercise12R_LOOPS {
    public static void main(String[] args) {
//        EXERCISE 12R
//        Create an application using the do-while loop that displays the following menu of options:
//        1) Calculate and display the VAT (21%) of an amount of euros entered by keyboard.
//        2) Make the sum of 3 double type numbers entered by keyboard, showing it on the screen.
//        3) Calculate the area of a triangle given the base and the height entered by keyboard.
//        4) Exit the program by displaying a farewell message.
//        If the user chooses an unavailable option, an error message will be displayed and the user will be returned to the options menu.
//                At the end of the programme the following information will be displayed:
//         If the user has used at least once all options.
//         If the user has calculated an area of more than 100 square metres.
//         If the user tried to add 3 negative numbers.

        Scanner scanner = new Scanner(System.in);

        final double VAT_RATE = 0.21;
        boolean usedOption1 = false;
        boolean usedOption2 = false;
        boolean usedOption3 = false;
        boolean areaOver100 = false;
        boolean addedThreeNegatives = false;

        int option;

        do {
            System.out.println("\nMENU");
            System.out.println("1) Calculate and display VAT (21%)");
            System.out.println("2) Sum 3 double numbers");
            System.out.println("3) Calculate area of a triangle");
            System.out.println("4) Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    usedOption1 = true;
                    System.out.print("Enter an amount in euros: ");
                    double amount = scanner.nextDouble();
                    double vat = amount * VAT_RATE;
                    System.out.printf("The VAT of %.2f€ is %.2f€\n", amount, vat);
                    break;

                case 2:
                    usedOption2 = true;
                    System.out.println("Enter 3 double numbers:");
                    double n1 = scanner.nextDouble();
                    double n2 = scanner.nextDouble();
                    double n3 = scanner.nextDouble();
                    double sum = n1 + n2 + n3;
                    System.out.printf("The sum is: %.2f\n", sum);

                    if (n1 < 0 && n2 < 0 && n3 < 0) {
                        addedThreeNegatives = true;
                    }
                    break;

                case 3:
                    usedOption3 = true;
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();
                    double area = (base * height) / 2;
                    System.out.printf("The area of the triangle is: %.2f square meters\n", area);

                    if (area > 100) {
                        areaOver100 = true;
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (option != 4);

        // Final report
        System.out.println("\n--- FINAL REPORT ---");
        if (usedOption1 && usedOption2 && usedOption3) {
            System.out.println("You used all the options at least once.");
        } else {
            System.out.println("You did not use all the options.");
        }

        if (areaOver100) {
            System.out.println("You calculated an area over 100 square meters.");
        }

        if (addedThreeNegatives) {
            System.out.println("➖ You tried to add 3 negative numbers.");
        }
    }
}
