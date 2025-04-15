import java.util.Scanner;

public class Exercise13R_LOOPS {
    public static void main(String[] args) {
//        EXERCISE 13R
//        Develop a program that displays the following menu.
//        1) Average 3 real numbers.
//        2) Calculate the area of a triangle.
//        3) To convert an amount from euros into pounds and dollars.
//        4) Draw a staircase of a given height.
//        5) Exit the program
//        Using do-while and switch-case loops, ask for an option, ask for the
//        necessary operands and perform operations until you choose the exit
//        option. If the user chooses an invalid option an error message is
//        displayed. In addition:
//         If the user executes option 4 three times in a row, display the
//        message ‘you're a pain drawing stairs’.
//         If the user passes an amount of euros and gets more than 10000
//        dollars, display a message ‘you handle a nice wad of cash’.
//         When exiting, show the options that have not been executed.
        Scanner scanner = new Scanner(System.in);

        final double EURO_TO_DOLLAR = 1.1;
        final double EURO_TO_POUND = 0.85;

        boolean usedOption1 = false;
        boolean usedOption2 = false;
        boolean usedOption3 = false;
        boolean usedOption4 = false;

        int stairCount = 0; // to detect 3 times in a row
        int lastOption = 0;
        int option;

        do {
            System.out.println("\nMENU");
            System.out.println("1) Average 3 real numbers");
            System.out.println("2) Calculate area of a triangle");
            System.out.println("3) Convert euros to pounds and dollars");
            System.out.println("4) Draw a staircase");
            System.out.println("5) Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    usedOption1 = true;
                    stairCount = 0;
                    System.out.println("Enter 3 real numbers:");
                    double n1 = scanner.nextDouble();
                    double n2 = scanner.nextDouble();
                    double n3 = scanner.nextDouble();
                    double average = (n1 + n2 + n3) / 3;
                    System.out.printf("The average is: %.2f\n", average);
                    break;

                case 2:
                    usedOption2 = true;
                    stairCount = 0;
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();
                    double area = (base * height) / 2;
                    System.out.printf("Area of triangle: %.2f\n", area);
                    break;

                case 3:
                    usedOption3 = true;
                    stairCount = 0;
                    System.out.print("Enter amount in euros: ");
                    double euros = scanner.nextDouble();
                    double dollars = euros * EURO_TO_DOLLAR;
                    double pounds = euros * EURO_TO_POUND;
                    System.out.printf("You get %.2f dollars and %.2f pounds\n", dollars, pounds);

                    if (dollars > 10000) {
                        System.out.println("💵 You handle a nice wad of cash!");
                    }
                    break;

                case 4:
                    usedOption4 = true;
                    if (lastOption == 4) {
                        stairCount++;
                    } else {
                        stairCount = 1;
                    }
                    lastOption = 4;

                    System.out.print("Enter the height of the staircase: ");
                    int heightStairs = scanner.nextInt();

                    for (int i = 1; i <= heightStairs; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    if (stairCount == 3) {
                        System.out.println("You're a pain drawing stairs! 😅");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    stairCount = 0;
                    System.out.println("Invalid option.");
                    break;
            }

            if (option != 4) lastOption = option;

        } while (option != 5);

        // Show unexecuted options
        System.out.println("\nOptions you did NOT use:");
        if (!usedOption1) System.out.println("- Option 1: Average 3 real numbers");
        if (!usedOption2) System.out.println("- Option 2: Triangle area");
        if (!usedOption3) System.out.println("- Option 3: Currency conversion");
        if (!usedOption4) System.out.println("- Option 4: Draw a staircase");

    }
}
