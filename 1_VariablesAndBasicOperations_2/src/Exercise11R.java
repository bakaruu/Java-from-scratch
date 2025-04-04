import java.util.Scanner;

public class Exercise11R {
    public static void main(String[] args) {

//        EXERCISE 11R
//        Make a program that asks for 3 numbers representing a person's date of birth (day, month, year).
//        of a person (day, month, year) and that calculates and displays to the user his lucky number.
//        number. The lucky number is calculated by adding up the day, month and year of the date
//        of birth and then adding the
//        date of birth and then adding up the numbers obtained in the sum. For example: if the
//        date of birth is 12/07/1980, we calculate the lucky number like this: 12+7+1980
//        = 1999; 1+9+9+9+9 = 28. Lucky number: 28.


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth day: ");
        int day = scanner.nextInt();

        System.out.print("Enter your birth month: ");
        int month = scanner.nextInt();

        System.out.print("Enter your birth year: ");
        int year = scanner.nextInt();

        int total = day + month + year;

        int digit1 = total / 1000;
        int digit2 = (total / 100) % 10;
        int digit3 = (total / 10) % 10;
        int digit4 = total % 10;

        int luckyNumber = digit1 + digit2 + digit3 + digit4;

        System.out.println("Your lucky number is: " + luckyNumber);

    }
}
