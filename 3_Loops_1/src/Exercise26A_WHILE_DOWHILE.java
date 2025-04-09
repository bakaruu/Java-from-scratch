import java.util.Scanner;

public class Exercise26A_WHILE_DOWHILE {
    public static void main(String[] args) {
//        EXERCISE 26A
//        Make a program that reads a number of numbers N and
//        displays a message if a zero has been entered in the
//        series. If a zero is encountered, the program must be
//        stopped to indicate that the objective has been achieved.

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int n = scanner.nextInt();

        boolean zeros = true;
        int count = 0;

        while (count < n && zeros) {
            System.out.print("Enter number " + (count + 1) + ": ");
            int number = scanner.nextInt();

            if (number == 0) {
                zeros = false;
                System.out.println("Zero number detected.");
            }

            count++;
        }
    }
}
