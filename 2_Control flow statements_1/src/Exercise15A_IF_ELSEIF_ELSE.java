import java.util.Scanner;

public class Exercise15A_IF_ELSEIF_ELSE {
    public static void main(String[] args) {

//        EXERCISE 15A
//        Develop a program that asks for a number and displays on the screen
//        whether it is divisible by 2, divisible by 3, divisible by 2 and 3 at
//        the same time or divisible by none.
//        divisible by 3, divisible by 2 and 3 at the same time or by none.

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number%2 == 0 && number%3 == 0) {
            System.out.printf("%d is divisible by 2 and by 3", number);
        } else if (number % 2 == 0) {
            System.out.printf("%d is divisible by 2", number);
        } else if (number % 3 == 0) {
            System.out.printf("%d is divisible by 3", number);

        } else {
            System.out.printf("%d is divisible by NONE", number);

        }

    }
}
