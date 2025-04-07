import java.util.Scanner;

public class Exercise15R_IF_ELSEIF_ELSE {
    public static void main(String[] args) {
//        EXERCISE 15R
//        Given a date expressed in day, month and year, make a programme
//        that advances this date by one day (do not take into account leap
//        years and the months are all 30 days).

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter day (1–30): ");
        int day = scanner.nextInt();

        System.out.print("Enter month (1–12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();


        day++;

        if (day > 30) {
            day = 1;
            month++;

            if (month > 12) {
                month = 1;
                year++;
            }
        }


        System.out.printf("Next day: %02d/%02d/%d\n", day, month, year);

    }
}
