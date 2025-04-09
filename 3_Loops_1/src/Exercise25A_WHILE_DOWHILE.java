import java.util.Scanner;

public class Exercise25A_WHILE_DOWHILE {
    public static void main(String[] args) {
//        EXERCISE 25A
//        Make a program that reads a number of numbers N and displays
//        a message if all the numbers are positive. If a negative number
//        is encountered, the program must be stopped immediately to indicate
//        that the objective was not achieved.

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int n = scanner.nextInt();

        boolean allPositive = true;
        int count = 0;

        while (count < n && allPositive) {
            System.out.print("Enter number " + (count + 1) + ": ");
            int number = scanner.nextInt();

            if (number < 0) {
                allPositive = false;
                System.out.println("Negative number detected.");
            }

            count++;
        }

        if (allPositive) {
            System.out.println("All numbers were positive. Goal achieved!");
        }




    }
}
