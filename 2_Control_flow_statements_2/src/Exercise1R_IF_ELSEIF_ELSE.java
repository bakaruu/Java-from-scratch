import java.util.Scanner;

public class Exercise1R_IF_ELSEIF_ELSE {
    public static void main(String[] args) {
//        EXERCISE 1R
//        Make a program that reads three integers that correspond to a
//        date and indicates whether it corresponds to Christmas Day of any year.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day:");
        int day = scanner.nextInt();

        System.out.println("Enter a month:");
        int month = scanner.nextInt();

        System.out.println("Enter a year:");
        int year = scanner.nextInt();

        if (day == 25 && month == 12) {
            System.out.println("🎄 It's Christmas Day " + year + "!");
        } else {
            System.out.println("❌ It's not Christmas.");
        }

    }
}