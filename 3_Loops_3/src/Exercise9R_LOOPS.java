import java.util.Scanner;

public class Exercise9R_LOOPS {
    public static void main(String[] args) {
//        EXERCISE 9R. Create a program that reads double numbers from the keyboard.
//        The number of numbers to be read is asked to the user at the beginning
//        of the program. Each number to be read is the account balances of a bank.
//        Each account is sorted according to the following table.
//        Balance Account         type
//        500<=X<10000            STANDARD
//        100.000<=X<500.000      VIP
//        X>=1.000.000            MILLIONAIRE

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many accounts do you want to enter? ");
        int numAccounts = scanner.nextInt();

        for (int i = 1; i <= numAccounts; i++) {
            System.out.print("Enter balance for account " + i + ": ");
            double balance = scanner.nextDouble();

            if (balance >= 1000000) {
                System.out.println("Account type: MILLIONAIRE");
            } else if (balance >= 100000) {
                System.out.println("Account type: VIP");
            } else if (balance >= 500) {
                System.out.println("Account type: STANDARD");
            } else {
                System.out.println("Account type: UNKNOWN or below threshold");
            }

            System.out.println(); // just to space out the outputs
        }
    }
}
