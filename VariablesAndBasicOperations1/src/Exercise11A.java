import java.util.Scanner;

public class Exercise11A {
    public static void main(String[] args) {
//        EXERCISE 11A
//        Given a 5-digit number that is read from the keyboard, separate
//        each of its digits using only operations with whole numbers.
//        Assume that the number will always have exactly 5 digits.


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 5-digit number: ");
        int number = scanner.nextInt();

        // Assumes the number has exactly 5 digits
        int digit1 = number / 10000;             // first digit
        int digit2 = (number / 1000) % 10;        // second digit
        int digit3 = (number / 100) % 10;         // third digit
        int digit4 = (number / 10) % 10;          // fourth digit
        int digit5 = number % 10;                 // fifth digit

        System.out.println("The digits are: " + digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);

    }
}
