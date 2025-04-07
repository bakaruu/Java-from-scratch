import java.util.Scanner;

public class Exercise16R_IF_ELSEIF_ELSE {
    public static void main(String[] args) {
//        EXERCISE 16R
//        Develop an application that asks for 3 numbers and displays
//        them in order.


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        System.out.print("Ordered: ");


        if (a <= b && b <= c) {
            System.out.println(a + ", " + b + ", " + c);
        } else if (a <= c && c <= b) {
            System.out.println(a + ", " + c + ", " + b);
        } else if (b <= a && a <= c) {
            System.out.println(b + ", " + a + ", " + c);
        } else if (b <= c && c <= a) {
            System.out.println(b + ", " + c + ", " + a);
        } else if (c <= a && a <= b) {
            System.out.println(c + ", " + a + ", " + b);
        } else {
            System.out.println(c + ", " + b + ", " + a);
        }
    }
}
