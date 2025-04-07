import java.util.Scanner;

public class Exercise20R_SWITCH_CASE {
    public static void main(String[] args) {
//        EXERCISE 20R
//        Develop an application that prompts the user for a letter.
//        If the letter read is ‘L’, ‘M’, ‘X’, ‘J’ or ‘V’, the following
//        will be displayed: ‘The chosen day is a weekday’. If the letter
//        is ‘S’ or ‘D’, the following message shall be displayed: ‘The
//        selected day is weekend’. In any other case an error will be
//        displayed.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter representing the day (L, M, X, J, V, S, D): ");
        char letter = scanner.next().toUpperCase().charAt(0);

        switch (letter) {
            case 'L':
            case 'M':
            case 'X':
            case 'J':
            case 'V':
                System.out.println("The chosen day is a weekday.");
                break;

            case 'S':
            case 'D':
                System.out.println("The selected day is weekend.");
                break;

            default:
                System.out.println("Error: Invalid day letter.");
        }
    }
}
