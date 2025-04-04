import java.util.Scanner;

public class Exercise12A {
    public static void main(String[] args) {
//        EXERCISE 12A
//        Develop an application for a cash register, in which a whole amount
//        to be returned is entered and calculate how many 20, 10 and 5 euro
//        notes are to be handed in and how many 2 and 1 euro coins are to be
//        handed in.


        Scanner scanner = new Scanner(System.in);

        System.out.println("CHANGE");
        System.out.println("--------------------");

        System.out.print("Enter the amount to return: ");
        int amount = scanner.nextInt();

        int bills20 = amount / 20;
        amount %= 20;

        int bills10 = amount / 10;
        amount %= 10;

        int bills5 = amount / 5;
        amount %= 5;

        int coins2 = amount / 2;
        amount %= 2;

        int coins1 = amount; // whatever remains is either 1 or 0

        System.out.println("20€ bills: " + bills20);
        System.out.println("10€ bills: " + bills10);
        System.out.println("5€ bills: " + bills5);
        System.out.println("2€ coins: " + coins2);
        System.out.println("1€ coins: " + coins1);

        System.out.println("Closing application...");
    }
}
