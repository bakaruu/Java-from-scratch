import java.util.Scanner;

public class Exercise17A_IF_ELSEIF_ELSE {
    public static void main(String[] args) {
//        EXERCISE 17A
//        Make a program that reads three integers corresponding to hours,
//        minutes and seconds respectively, and checks that it is a valid time.
//        Assume that a time is read in 24-hour mode.

//        Use a single if-else structure and subsequently:

//         Create another version where the program tells us in case of failure
//        that it has failed.

//         Create another version where the program stops as soon as something
//        goes wrong with the data entered.

        Scanner scanner = new Scanner(System.in);

        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds = scanner.nextInt();

        if (hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60 && seconds >= 0 && seconds < 60) {
            System.out.println("Valid time.");
        } else {
            System.out.println("Invalid time.");
        }

        //version 2:
//        boolean valid = true;
//
//        if (hours < 0 || hours >= 24) {
//            System.out.println("❌ Invalid hours. Must be between 0 and 23.");
//            valid = false;
//        }
//
//        if (minutes < 0 || minutes >= 60) {
//            System.out.println("❌ Invalid minutes. Must be between 0 and 59.");
//            valid = false;
//        }
//
//        if (seconds < 0 || seconds >= 60) {
//            System.out.println("❌ Invalid seconds. Must be between 0 and 59.");
//            valid = false;
//        }
//
//        if (valid) {
//            System.out.println("✅ Valid time.");
//        }


        //version 3

//        int hours = scanner.nextInt();
//        if (hours < 0 || hours >= 24) {
//            System.out.println("❌ Invalid hours. Must be between 0 and 23.");
//            return;
//        }
//
//        int minutes = scanner.nextInt();
//        if (minutes < 0 || minutes >= 60) {
//            System.out.println("❌ Invalid minutes. Must be between 0 and 59.");
//            return;
//        }
//
//        int seconds = scanner.nextInt();
//        if (seconds < 0 || seconds >= 60) {
//            System.out.println("❌ Invalid seconds. Must be between 0 and 59.");
//            return;
//        }
//
//        System.out.println("✅ Valid time.");



    }
}
