import java.util.Scanner;

public class Exercise9P_LOOPS {
    public static void main(String[] args) {
//        EXERCISE 9P
//        Given a number N of at least two digits, add its digits and
//        if the resulting number still has more than 2 digits, repeat
//        the operation until it has only 1 digit, for example:
//        16 --> 1 + 6 = 7
//        942 --> 9 + 4 + 2 = 15 --> 1 + 5 = 6
//        132189 --> 1 + 3 + 2 + 1 + 8 + 9 = 24 --> 2 + 4 = 6
//        493193 --> 4 + 9 + 3 + 1 + 9 + 3 = 29 --> 2 + 9 = 11 --> 1 + 1 = 2


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            while (number >= 10) {
                int sum = 0;
                while (number > 0) {
                    sum += number % 10;
                    number /= 10;
                }
                number = sum;
                System.out.println("result: " + number);
            }

            System.out.println("Final result: " + number);
        } else {
            System.out.println("The number must be positive. Try again.");
        }
    }
}
