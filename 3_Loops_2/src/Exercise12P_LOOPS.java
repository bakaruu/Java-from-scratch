import java.util.Scanner;

public class Exercise12P_LOOPS {
    public static void main(String[] args) {
//        EXERCISE 12P
//        Develop a program that displays the following menu of options:
//        1) View my account balance.
//        2) Withdraw money (only multiples of 10).
//        3) Invest money.
//        4) Exit the program
//         The program will have a variable which will be the balance of the account which
//        will be 1000 € initially.
//         Investing money refers to investing part of your money for a fixed term of 3%.
//        You can only invest if you have a positive balance, at most the money you
//        have and you can only have one ongoing investment. The money must be removed
//        from the account at the time of choosing that option and will be returned
//        along with the money earned when you have made 5 trades after the investment.
//        If any of the criteria is not met, display a message and return to the menu.
//         When exiting the programme show the final balance if at any time we have more than
//        2000 € and/or you have ever had a negative balance show an indicative message.
//         If the user wants to exit and has an investment in progress, warn him/her that
//        he/she will lose the money invested and the interest generated.
//         If the user chooses an invalid option an error message is displayed.

        Scanner scanner = new Scanner(System.in);

        double balance = 1000.0;
        double investment = 0;
        boolean hasInvestment = false;
        int transactionsSinceInvestment = 0;
        boolean hadNegativeBalance = false;
        boolean hadOver2000 = false;

        int option;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1) View account balance");
            System.out.println("2) Withdraw money (only multiples of 10)");
            System.out.println("3) Invest money");
            System.out.println("4) Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.printf("Current balance: %.2f€%n", balance);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw (multiples of 10): ");
                    int withdraw = scanner.nextInt();
                    if (withdraw % 10 == 0) {
                        if (withdraw <= balance) {
                            balance -= withdraw;
                            System.out.printf("You withdrew: %d€. New balance: %.2f€%n", withdraw, balance);
                            if (hasInvestment) transactionsSinceInvestment++;
                        } else {
                            System.out.println("Insufficient funds.");
                        }
                    } else {
                        System.out.println("You must withdraw in multiples of 10.");
                    }
                    break;

                case 3:
                    if (hasInvestment) {
                        System.out.println("You already have an ongoing investment.");
                        break;
                    }
                    if (balance <= 0) {
                        System.out.println("You need a positive balance to invest.");
                        break;
                    }
                    System.out.print("Enter amount to invest: ");
                    double amountToInvest = scanner.nextDouble();
                    if (amountToInvest <= 0 || amountToInvest > balance) {
                        System.out.println("Invalid investment amount.");
                    } else {
                        investment = amountToInvest;
                        balance -= investment;
                        hasInvestment = true;
                        transactionsSinceInvestment = 0;
                        System.out.println("Investment started successfully.");
                    }
                    break;

                case 4:
                    if (hasInvestment) {
                        System.out.println("Warning: You have an ongoing investment.");
                        System.out.println("Exiting will forfeit the invested money and interest.");
                        System.out.print("Are you sure you want to exit? (yes/no): ");
                        String confirm = scanner.next().toLowerCase();
                        if (!confirm.equals("yes")) {
                            option = -1; // Keep running
                            continue;
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid option.");
                    break;
            }


            if (hasInvestment && transactionsSinceInvestment >= 5) {
                double interest = investment * 0.03;
                balance += investment + interest;
                System.out.printf("Investment returned with interest: %.2f€%n", interest);
                hasInvestment = false;
                investment = 0;
                transactionsSinceInvestment = 0;
            }

            if (balance < 0) hadNegativeBalance = true;
            if (balance > 2000) hadOver2000 = true;

        } while (option != 4);


        System.out.printf("Final balance: %.2f€%n", balance);
        if (hadOver2000) System.out.println("At some point you had more than 2000€.");
        if (hadNegativeBalance) System.out.println("At some point your balance was negative.");

        System.out.println("Program ended.");

    }
}
