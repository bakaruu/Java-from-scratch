import java.util.Scanner;
public class Exercise10R {
    public static void main(String[] args) {
//        EXERCISE 10R
//        Write a program that receives a single instant of time in hours, minutes
//        and seconds.seconds. The program tells us how much time is left until midnight
//        in hours, minutes and seconds.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an instant of time (hh mm ss)");
        System.out.println("Hours: ");
        int h1 = scanner.nextInt();

        System.out.println("Minutes: ");
        int m1 = scanner.nextInt();

        System.out.println("Seconds: ");
        int s1 = scanner.nextInt();

        int totalSeconds = h1 * 3600 + m1 * 60 + s1;
        int fullSeconds = 86400;

        int remainingSeconds = fullSeconds - totalSeconds;

        int diffHours = remainingSeconds / 3600;
        int remainingS = remainingSeconds % 3600;

        int diffMinutes = remainingS / 60;
        int diffSecs = remainingS % 60;


        System.out.printf("Time difference: %d hours, %d minutes, %d seconds\n",
                diffHours, diffMinutes, diffSecs);







    }
}
