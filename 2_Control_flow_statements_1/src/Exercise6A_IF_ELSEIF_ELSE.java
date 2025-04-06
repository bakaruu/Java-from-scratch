import java.util.Scanner;

public class Exercise6A_IF_ELSEIF_ELSE {
    public static void main(String[] args) {
//        EXERCISE 6A
//        Make a program that reads a positive 4-digit number and tells us if
//        it is palindrome or not. If it is not a positive 4-digit number,
//            display an error message.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a 4-digit number: ");
        int x = scanner.nextInt();

        if (x >= 1000 && x <= 9999) {

            if (x / 1000 == x % 10 && (x / 100 % 10) == (x / 10) % 10) {
                System.out.println("It is a palindrome.");
            } else {
                System.out.println("It is not a palindrome.");
            }
        } else {
            System.out.println("The number is not 4-digits.");
        }


    }
}
