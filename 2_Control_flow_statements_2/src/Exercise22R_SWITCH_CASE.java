import java.util.Scanner;

public class Exercise22R_SWITCH_CASE {
    public static void main(String[] args) {
//        EXERCISE 22R
//        Develop a program that allows you to enter an integer
//        (1 to 10), and displays its Roman equivalent. Any other
//        number will be indicated as out of range.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer (1 to 10): ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Roman numeral: I");
                break;
            case 2:
                System.out.println("Roman numeral: II");
                break;
            case 3:
                System.out.println("Roman numeral: III");
                break;
            case 4:
                System.out.println("Roman numeral: IV");
                break;
            case 5:
                System.out.println("Roman numeral: V");
                break;
            case 6:
                System.out.println("Roman numeral: VI");
                break;
            case 7:
                System.out.println("Roman numeral: VII");
                break;
            case 8:
                System.out.println("Roman numeral: VIII");
                break;
            case 9:
                System.out.println("Roman numeral: IX");
                break;
            case 10:
                System.out.println("Roman numeral: X");
                break;
            default:
                System.out.println("Error: Number out of range.");
        }
    }
}
