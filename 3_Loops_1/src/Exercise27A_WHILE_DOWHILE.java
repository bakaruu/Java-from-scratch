import java.util.Scanner;

public class Exercise27A_WHILE_DOWHILE {
    public static void main(String[] args) {
//        EXERCISE 27A
//        Repeat the previous exercises but using the do-while loop.

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int n = scanner.nextInt();

        boolean foundZero = true;
        int count = 0;

        //The differences about do and do while
        if (n > 0) {
            do {
                System.out.print("Enter number " + (count + 1) + ": ");
                int number = scanner.nextInt();

                if (number == 0) {
                    foundZero = false;
                    System.out.println("Zero number detected.");
                }

                count++;
            } while (count < n && foundZero);
        } else {
            System.out.println("Nothing to check.");
        }
    }
}
