import java.util.Scanner;

public class Exercise24R_SWITCH_CASE {
    public static void main(String[] args) {
//        EXERCISE 24R
//        The letter that belongs to each DNI is calculated on the basis of the
//        following table:
//        The remainder of the integer division of the DNI number and the number
//        23 is obtained. This remainder is the position in the table with the letter
//        that belongs to the DNI.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your DNI number (only numbers): ");
        int dni = scanner.nextInt();

        int remainder = dni % 23;

        char letter;

        switch (remainder) {
            case 0:  letter = 'T'; break;
            case 1:  letter = 'R'; break;
            case 2:  letter = 'W'; break;
            case 3:  letter = 'A'; break;
            case 4:  letter = 'G'; break;
            case 5:  letter = 'M'; break;
            case 6:  letter = 'Y'; break;
            case 7:  letter = 'F'; break;
            case 8:  letter = 'P'; break;
            case 9:  letter = 'D'; break;
            case 10: letter = 'X'; break;
            case 11: letter = 'B'; break;
            case 12: letter = 'N'; break;
            case 13: letter = 'J'; break;
            case 14: letter = 'Z'; break;
            case 15: letter = 'S'; break;
            case 16: letter = 'O'; break;
            case 17: letter = 'V'; break;
            case 18: letter = 'H'; break;
            case 19: letter = 'L'; break;
            case 20: letter = 'C'; break;
            case 21: letter = 'K'; break;
            case 22: letter = 'E'; break;
            default:
                System.out.println("Error: Invalid remainder.");
                return;
        }

        System.out.println("The letter for DNI " + dni + " is: " + letter);

    }
}
