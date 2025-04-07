import java.util.Scanner;

public class Exercise14R_IF_ELSEIF_ELSE {
    public static void main(String[] args) {
//        EXERCISE 14R
//        Given a time expressed in hours, minutes and seconds, make a program
//        that advances this time by one second. Once this has been achieved,
//        make another program that delays a time by 1 second.
//        Auxiliary variables cannot be used.

        Scanner scanner = new Scanner(System.in);

        // Input time
        System.out.print("Enter hours (0–23): ");
        int hours = scanner.nextInt();

        System.out.print("Enter minutes (0–59): ");
        int minutes = scanner.nextInt();

        System.out.print("Enter seconds (0–59): ");
        int seconds = scanner.nextInt();

        //ADVANCE
        seconds++;

        if (seconds == 60) {
            seconds = 0;
            minutes++;

            if (minutes == 60) {
                minutes = 0;
                hours++;

                if (hours == 24) {
                    hours = 0;
                }
            }
        }

        System.out.printf("Time +1 second: %02d:%02d:%02d\n", hours, minutes, seconds);

        //DELAY
//        seconds--;
//
//        if (seconds == -1) {
//            seconds = 59;
//            minutes--;
//
//            if (minutes == -1) {
//                minutes = 59;
//                hours--;
//
//                if (hours == -1) {
//                    hours = 23;
//                }
//            }
//        }
//
//        System.out.printf("Time -1 second: %02d:%02d:%02d\n", hours, minutes, seconds);



    }
}
