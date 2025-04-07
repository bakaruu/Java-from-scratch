import java.util.Scanner;

public class Exercise1P_IF_ELSEIF_ELSE {
    public static void main(String[] args) {


//        EXERCISE 1P Make a program that, given a year, tells us whether
//        it is a leap year or not. A year is a leap year under the following
//        conditions:  The year entered must be after 1582, the year in which the
//        Gregorian calendar we use today was established.  A year divisible
//        by 4 is a leap year if it is not divisible by 100.  If a year is
//        divisible by 100 and is also divisible by 400, it is also a leap
//        year.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (year <= 1582) {
            System.out.println("Invalid year. Must be after 1582.");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("NICE " + year + " is a leap year.");
        } else {
            System.out.println("WRONG " + year + " is not a leap year.");
        }

    }
}
