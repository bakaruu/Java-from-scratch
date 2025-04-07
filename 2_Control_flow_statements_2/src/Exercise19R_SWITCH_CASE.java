import java.util.Scanner;

public class Exercise19R_SWITCH_CASE {
    public static void main(String[] args) {
//        EXERCISE 19R
//        Make a program that allows to choose between drawing a straight
//        line, a rectangle or a triangle, where the user writes what he wants
//        to see drawn, making the drawings by means of asterisks. If an
//        incorrect option is chosen, display an error message.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose what to draw:");
        System.out.println("1. Line");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Your choice (1-3): ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Line:");
                System.out.println("*****");
                break;

            case 2:
                System.out.println("Rectangle:");
                System.out.println("*****");
                System.out.println("*****");
                System.out.println("*****");
                break;

            case 3:
                System.out.println("Triangle:");
                System.out.println("*");
                System.out.println("**");
                System.out.println("***");
                System.out.println("****");
                break;

            default:
                System.out.println("Error: Invalid option.");
        }
    }
}
