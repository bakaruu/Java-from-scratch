import java.util.Scanner;

public class Exercise23R_SWITCH_CASE {
    public static void main(String[] args) {
//        EXERCISE 23R
//        Make a program that reads a character that will correspond to a
//        Roman digit (I, V, X, L, C, D and M). Display its value in integers.
//        Any other character will be taken as wrong.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral character (I, V, X, L, C, D, M): ");
        char roman = scanner.next().toUpperCase().charAt(0);

        switch (roman) {
            case 'I':
                System.out.println("Value: 1");
                break;
            case 'V':
                System.out.println("Value: 5");
                break;
            case 'X':
                System.out.println("Value: 10");
                break;
            case 'L':
                System.out.println("Value: 50");
                break;
            case 'C':
                System.out.println("Value: 100");
                break;
            case 'D':
                System.out.println("Value: 500");
                break;
            case 'M':
                System.out.println("Value: 1000");
                break;
            default:
                System.out.println("Error: Invalid Roman numeral.");
        }

    }
}
