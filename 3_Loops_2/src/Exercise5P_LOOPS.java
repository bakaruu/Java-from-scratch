import java.time.LocalDate;
import java.util.Scanner;

public class Exercise5P_LOOPS {
    public static void main(String[] args) {
//        EXERCISE 5P
//        Develop a while program that asks for the current year (2025) and does
//        not terminate until the user completes the request. Show the number of
//        attempts it has taken. Extension investigate the Date class to make the
//        program itself get the current year and work in any year.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter current year: ");
        int year = scanner.nextInt();
        int attempts = 1;

//        LocalDate today = LocalDate.now();
//        int year2 = today.getYear(); //just the year

        while(year!=2025){
            System.out.println("Enter current year: ");
            year = scanner.nextInt();
            attempts++;

        }

        System.out.println("Attempts: " +attempts);
    }
}
