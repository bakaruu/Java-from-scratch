import java.util.Scanner;

public class Exercise34A_WHILE_DOWHILE {
    public static void main(String[] args) {
//        EXERCISE 34A
//        Develop a program that displays the following menu of options.
//        1) Addition
//        2) Subtraction
//        3) Multiplication
//        4) Division
//        5) Subtraction
//        6) Exit
//        Using do-while loop and switch-case, ask for an option, ask for the necessary
//        operands and perform operations until you choose the exit option.
//         If the user chooses an invalid option an error message is displayed.
//
//         At the end of the program show if the result of any operation that was
//        performed was greater than or equal to 1000 (we do not care what
//        it was, the important thing is whether or not there was such a result).
//
//         If the user performs 3 multiplications, the power option is unlocked and
//        appears in the options menu.

        Scanner scanner = new Scanner(System.in);

        int option;
        int multiplicationCount = 0;
        boolean powerUnlocked = false;
        boolean resultOverThousand = false;
        boolean exit = false;

        do {
            // Display the dynamic menu
            System.out.println("\nMENU");
            System.out.println("1) Addition");
            System.out.println("2) Subtraction");
            System.out.println("3) Multiplication");
            System.out.println("4) Division");
            System.out.println("5) Subtraction"); // (Maybe originally intended as 'Modulo')
            if (powerUnlocked) {
                System.out.println("6) Power");
                System.out.println("7) Exit");
            } else {
                System.out.println("6) Exit");
            }

            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            double result = 0;
            double a, b;

            switch (option) {
                case 1: // Addition
                    System.out.print("Enter first number: ");
                    a = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    b = scanner.nextDouble();
                    result = a + b;
                    System.out.println("Result: " + result);
                    break;

                case 2: // Subtraction (first subtraction option)
                case 5: // Subtraction (second subtraction option)
                    System.out.print("Enter first number: ");
                    a = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    b = scanner.nextDouble();
                    result = a - b;
                    System.out.println("Result: " + result);
                    break;

                case 3: // Multiplication
                    System.out.print("Enter first number: ");
                    a = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    b = scanner.nextDouble();
                    result = a * b;
                    multiplicationCount++;
                    if (multiplicationCount == 3) {
                        powerUnlocked = true;
                        System.out.println("Power operation unlocked!");
                    }
                    System.out.println("Result: " + result);
                    break;

                case 4: // Division
                    System.out.print("Enter numerator: ");
                    a = scanner.nextDouble();
                    System.out.print("Enter denominator: ");
                    b = scanner.nextDouble();
                    if (b != 0) {
                        result = a / b;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero.");
                        continue; // This restarts the do-while loop without updating result
                    }
                    break;

                case 6:
                    if (powerUnlocked) {
                        // Power operation (unlocked)
                        System.out.print("Enter base: ");
                        a = scanner.nextDouble();
                        System.out.print("Enter exponent: ");
                        b = scanner.nextDouble();
                        result = Math.pow(a, b);
                        System.out.println("Result: " + result);
                    } else {
                        // Exit when power is not unlocked
                        System.out.println("👋 Exiting...");
                        exit = true;
                    }
                    break;

                case 7:
                    if (!powerUnlocked) {
                        System.out.println("Invalid option.");
                        continue;
                    } else {
                        System.out.println("👋 Exiting...");
                        exit = true;
                    }
                    break;

                default:
                    System.out.println("Invalid option.");
                    continue;
            }

            // Track if any operation produced a result >= 1000
            if (result >= 1000) {
                resultOverThousand = true;
            }

        } while (!exit);

        // Final summary message
        if (resultOverThousand) {
            System.out.println("At least one result was greater than or equal to 1000.");
        } else {
            System.out.println("No result was 1000 or more.");
        }

    }
}
