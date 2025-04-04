import java.util.Scanner;

public class Exercise8A_IF_ELSEIF_ELSE {
    public static void main(String[] args) {
//        EXERCISE 8A
//        Develop an application that asks for two numbers and indicates which
//        of them is larger or if they are equal.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int x = scanner.nextInt();

        System.out.println("Enter second number: ");
        int j = scanner.nextInt();

        if (x > j) {
            System.out.printf("%d is greater than %d", x, j);
        } else if (x==j) {
            System.out.printf("%d is equal to %d", x, j);

        } else {
            System.out.printf("%d is greater than %d", j, x);

        }
    }
}
