import java.util.Scanner;

public class Exercise12A_IF_ELSEIF_ELSE {
    public static void main(String[] args) {
//        EXERCISE 12A
//        Make a program that allows you to load a whole number of up to
//        three digits and displays a message indicating whether it has 1, 2, or 3
//        digits.message indicating whether it has 1, 2, or 3 digits. Display
//        an error message if the number of digits of the number
//        number entered is greater.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int x = scanner.nextInt();

        if (x >= 0 && x <= 9) {
            System.out.println("The number has 1 digit.");
        } else if (x >= 10 && x <= 99) {
            System.out.println("The number has 2 digits.");
        } else if (x >= 100 && x <= 999) {
            System.out.println("The number has 3 digits.");
        } else {
            System.out.println("❌ The number has more than 3 digits. Try again.");
        }


    }
}
