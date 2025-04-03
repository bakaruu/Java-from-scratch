import java.util.Scanner;
public class Exercise9R {
    public static void main(String[] args) {
//        EXERCISE 9R
//        Write a program that receives two time instants in hours, minutes and seconds.
//        The program will show the difference between these two instants of time in hours,
//        minutes and seconds. We assume that the first time entered is before the second.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st time instant (hh mm ss):");
        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int s1 = scanner.nextInt();


        System.out.println("Enter 2nd time instant (hh mm ss):");
        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int s2 = scanner.nextInt();


        //Convert everything into seconds, way better to work with.
        int totalSeconds1 = h1 * 3600 + m1 * 60 + s1;
        int totalSeconds2 = h2 * 3600 + m2 * 60 + s2;


        int diffSeconds = totalSeconds2 - totalSeconds1;


        int diffHours = diffSeconds / 3600;
        int remainingSeconds = diffSeconds % 3600;

        int diffMinutes = remainingSeconds / 60;
        int diffSecs = remainingSeconds % 60;


        System.out.printf("Time difference: %d hours, %d minutes, %d seconds\n",
                diffHours, diffMinutes, diffSecs);




    }
}
