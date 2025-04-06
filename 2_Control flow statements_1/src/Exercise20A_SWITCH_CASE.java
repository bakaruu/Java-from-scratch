import java.util.Scanner;

public class Exercise20A_SWITCH_CASE {
    public static void main(String[] args) {

//        EXERCISE 20A
//        Make an application that displays a small menu offering
//        the possibility to perform 4 operations, asking for the
//        option number and requesting the necessary operands for
//        the chosen operation:
//         [1] Addition: a+b
//         [2] Subtraction: a-b
//         [3] Square root: √ (a >0)
//        Check that a>0 otherwise error

//         [4] Square: a2

//        If the chosen option does not exist, it will exit directly
//        with an error message.

        Scanner scanner = new Scanner(System.in);

        int a, b;
        double result;
        System.out.println("Enter an option: \n" +
                "[1] Addition: a+b\n" +
                "[2] Subtraction: a-b\n" +
                "[3] Square root: √ (a >0)");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Enter number a: ");
                a = scanner.nextInt();
                System.out.println("Enter number b: ");
                b = scanner.nextInt();
                result = a + b;
                System.out.printf("The result of %d + %d = %.2f\n", a, b, result);
                break;

            case 2:
                System.out.println("Enter number a: ");
                a = scanner.nextInt();
                System.out.println("Enter number b: ");
                b = scanner.nextInt();
                result = a - b;
                System.out.printf("The result of %d - %d = %.2f\n", a, b, result);
                break;

            case 3:
                System.out.println("Enter number a: ");
                a = scanner.nextInt();
                if (a > 0) {
                    result = Math.sqrt(a);
                    System.out.printf("The square root of %d is %.2f\n", a, result);
                } else {
                    System.out.println("❌ Error: a must be greater than 0 for square root.");
                }
                break;

            case 4:
                System.out.println("Enter number a: ");
                a = scanner.nextInt();
                result = Math.pow(a, 2);
                System.out.printf("The square of %d is %.2f\n", a, result);
                break;

            default:
                System.out.println("❌ Error: Invalid option. Exiting.");
                break;
        }
    }
}
