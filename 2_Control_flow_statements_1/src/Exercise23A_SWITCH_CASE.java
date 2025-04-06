import java.util.Scanner;

public class Exercise23A_SWITCH_CASE {
    public static void main(String[] args) {

//        EXERCISE 23A
//        Create a Java application that programs the following menu
//        of options using the switch-case structure:
//        1) Calculate and display the VAT (21%) of an amount of euros
//        entered by keyboard. Define VAT as a variable.
//        2) Average 3 double numbers entered by keyboard, displaying it
//        on the screen.
//        3) Calculate the area of a rectangle given the base and the
//        height entered by keyboard, showing the result on the screen.
//         Ask the user for an option (if it does not match any available option,
//        display an error message and terminate the program) and
//        carry out the chosen option.
//         In options 1 and 3, check that the numbers entered by the user are
//        greater than or equal to 0, otherwise only display an error message.


        Scanner scanner = new Scanner(System.in);

        final double VAT_RATE = 0.21;


        System.out.println("Option 1. VAT Calculation");
        System.out.println("Option 2. Average Calculation");
        System.out.println("Option 3. Area Calculation");
        System.out.print("Enter a valid option: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:

                System.out.print("Enter the amount in euros: ");
                double amount = scanner.nextDouble();
                if (amount >= 0) {
                    double vat = amount * VAT_RATE;
                    System.out.printf("The VAT (21%%) of %.2f€ is: %.2f€\n", amount, vat);
                } else {
                    System.out.println("Error: The amount must be greater than or equal to 0.");
                }
                break;

            case 2:
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();
                System.out.print("Enter the third number: ");
                double num3 = scanner.nextDouble();
                double average = (num1 + num2 + num3) / 3;
                System.out.printf("The average is: %.2f\n", average);
                break;

            case 3:
                System.out.print("Enter the base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height: ");
                double height = scanner.nextDouble();
                if (base >= 0 && height >= 0) {
                    double area = base * height;
                    System.out.printf("The area of the rectangle is: %.2f\n", area);
                } else {
                    System.out.println("Error: Base and height must be greater than or equal to 0.");
                }
                break;

            default:
                System.out.println("Error: Invalid option.");
        }
    }
}
