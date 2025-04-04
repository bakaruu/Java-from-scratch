import java.util.Scanner;

public class Exercise10A {
    public static void main(String[] args) {
//        EXERCISE 10A
//        Given an amount of time in seconds, express that same time in the form of hours,
//        minutes and seconds. For example, 8676 seconds is 2 hours, 24 minutes and 36 seconds.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter time in seconds: ");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;
        int remaining = totalSeconds % 3600;

        int minutes = remaining / 60;
        int seconds = remaining % 60;

        System.out.println(totalSeconds + " seconds = " + hours + " hours, " + minutes + " minutes and " + seconds + " seconds.");





    }
}
