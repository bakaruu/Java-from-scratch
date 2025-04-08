import java.util.Scanner;

public class Exercise12A_FOR_LOOP {
    public static void main(String[] args) {
//        EXERCISE 12A
//        To carry out a program that audits the accounts of a bank. To do this,
//        you have to enter the
//        number of accounts that the bank has and subsequently read the balance
//        of each one of them in order to do the following:

//         Account status-> Show ‘Creditor’ in green if the balance is >0.
//        Debtor' in red if the balance is <0.
//        Nil' in blue if the balance is =0.

//         In addition, at the end of the programme, the following data will be
//        displayed:
//          The sum of the credit balances.
//          If at least one balance of each type has been entered.


        Scanner scanner = new Scanner(System.in);

//        ANSI color codes
        final String GREEN = "\u001B[32m";
        final String RED = "\u001B[31m";
        final String BLUE = "\u001B[34m";
        final String RESET = "\u001B[0m";

        System.out.print("Enter the number of accounts: ");
        int numAccounts = scanner.nextInt();

        double creditSum = 0;

        boolean hasCreditor = false;
        boolean hasDebtor = false;
        boolean hasNil = false;

        for (int i = 1; i <= numAccounts; i++) {
            System.out.print("Enter balance for account " + i + ": ");
            double balance = scanner.nextDouble();

            if (balance > 0) {
                System.out.println(GREEN + "Creditor" + RESET);
                creditSum += balance;
                hasCreditor = true;
            } else if (balance < 0) {
                System.out.println(RED + "Debtor" + RESET);
                hasDebtor = true;
            } else {
                System.out.println(BLUE + "Nil" + RESET);
                hasNil = true;
            }
        }


        System.out.printf("\nTotal sum of credit balances: %.2f€\n", creditSum);

        if (hasCreditor && hasDebtor && hasNil) {
            System.out.println("✅ There is at least one balance of each type.");
        } else {
            System.out.println("⚠️ Not all balance types were present.");
        }
    }
}
