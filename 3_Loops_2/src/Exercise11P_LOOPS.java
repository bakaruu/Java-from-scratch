import java.util.Scanner;

public class Exercise11P_LOOPS {
    public static void main(String[] args) {
//        EXERCISE 11P
//        Make a program that prints the sequence of integers that is
//        calculated according to the following algorithm:
//        1. Read the first number from the keyboard.
//        2. If it is even we divide it by 2 and if it is odd we multiply
//        it by 3 and add 1.
//        3. With the result of the previous operation we repeat step 2.
//        4. Stop the process when the result of step 2 is 1.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();


        while (number != 1) {
            if (number % 2 == 0) {
                number /= 2;
                System.out.println("Actual number: "+ number);

            } else {
                number = number * 3 + 1;

                System.out.println("Actual number: "+ number);
            }

        }

        System.out.println("Number:"+ number);
    }
}
