import java.util.Scanner;

public class Exercise9A_IF_ELSEIF_ELSE {
    public static void main(String[] args) {
//        EXERCISE 9A
//        Develop an application that asks the user for a number and
//        indicates one of these situations:
//         if it is less than or equal to 0
//         If it is greater than 0 and less than 100.
//         if it is greater than or equal to 100.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = scanner.nextInt();


        if (x <= 0) {
            System.out.printf("%d is less or equal to 0.\n", x);

        } else if (x > 0 && x < 100) {
            System.out.printf("%d is greater than 0 and less than 100.\n", x);

        } else {
            System.out.printf("%d is equal or greater than 100.\n", x);
        }
    }
}
