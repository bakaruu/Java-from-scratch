import java.util.Scanner;

public class Exercise5A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        EXERCISE 5A
//        Make in Java a program where the user will type two numbers (a and b),
//        and the program will show the result of the operation (a+b) x (a-b) and
//        on the other hand the result of the operation a2 - b2
//        (a squared minus b squared). They should be equal.

        System.out.println("Enter number a: ");
        int a = scanner.nextInt();
        System.out.println("Enter number b: ");
        int b = scanner.nextInt();

        int result1 = (a + b) * (a - b);
        int result2 = a * a - b * b;

        System.out.println("(a + b) * (a - b) = " + result1);
        System.out.println("a² - b² = " + result2);


    }
}
