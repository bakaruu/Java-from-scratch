import java.util.Scanner;

public class Exercise8R {
    public static void main(String[] args) {
//        EXERCISE 8R
//        Write a program that asks the user for the current time of the
//        clock (24h format) and an integer number of hours h, and display
//        what time the clock will strike in h hours, for
//        integer number of hours h, and display what time the clock will
//        strike in h hours, e.g.
//

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the actual time ( 24h format 0-23 ): ");
        int currentTime = scanner.nextInt();
        System.out.println("Now number of hours to add: ");
        int hoursAdded = scanner.nextInt();

        int futureTime = (currentTime + hoursAdded) % 24;


//        What is %d in System.out.printf?
//        %d is a format specifier used in Java (and many other languages)
//        to print integers (whole numbers).

//        The first %d will be replaced by the value of hoursAdded
//
//        The second %d will be replaced by the value of futureTime
        System.out.printf("In %d hours, the clock will show: %d\n", hoursAdded, futureTime);



    }
}
