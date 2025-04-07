import java.util.Scanner;

public class Exercise17R_IF_ELSEIF_ELSE {
    public static void main(String[] args) {
//        EXERCISE 17R

//        Taking up an exercise from the previous topic, given a given amount of money,
//        show the minimum number of 20, 10, 5, 2 and 1 euro notes and coins
//        needed to obtain that amount. If we do not need specific banknotes or coins,
//        do not show them. If the program gets the amount entered before asking for any
//        banknote or coin the program will terminate immediately, for example, if the
//        amount is 35 we do not need coins so the program should skip these checks.
//        Make another version where coins and banknotes are limited, bearing in mind
//        that decomposition may not be possible.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount to return: ");
        int amount = scanner.nextInt();

        if (amount < 0) {
            System.out.println("Invalid amount.");
            return;
        }

        int originalAmount = amount;

        if (amount >= 20) {
            int bill20 = amount / 20;
            amount %= 20;
            System.out.println("20€ bills: " + bill20);
        }

        if (amount >= 10) {
            int bill10 = amount / 10;
            amount %= 10;
            System.out.println("10€ bills: " + bill10);
        }

        if (amount >= 5) {
            int bill5 = amount / 5;
            amount %= 5;
            System.out.println("5€ bills: " + bill5);
        }

        if (amount == 0) {
            System.out.println("Total change for " + originalAmount + "€ returned with bills.");
            return;
        }

        if (amount >= 2) {
            int coin2 = amount / 2;
            amount %= 2;
            System.out.println("2€ coins: " + coin2);
        }

        if (amount >= 1) {
            int coin1 = amount;
            System.out.println("1€ coins: " + coin1);
        }

        System.out.println("Total change for " + originalAmount + "€ returned.");

    }
}
