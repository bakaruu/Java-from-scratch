import java.util.Scanner;

public class Exercise7R_LOOPS {
    public static void main(String[] args) {
//        EXERCISE 7R
//        Given two integers a and b which can be negative or positive,
//        find the sum of all the numbers between a and b included.
//        Assume a is less than b and if they are equal the sum required is
//        a or b, for example:
//        a=1 b=0 => 1 // 1 + 0 = 1
//        a=1 b=2 => 3 // 1 + 2 = 3
//        a=0 b=1 => 1 // 0 + 1 = 1
//        a=1 b=1 => 1 // 1 They are the same
//        a=-1 b=0 => -1 // -1 + 0 = -1
//        a=-1 b=2 => 2 // -1 + 0 + 1 + 2 = 2

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number:  ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        int sum = 0;

        if (a > b) {
            System.out.println("Invalid input: 'a' must be less than or equal to 'b'.");
        } else {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
            System.out.println("The sum from " + a + " to " + b + " is: " + sum);
        }
    }
}
