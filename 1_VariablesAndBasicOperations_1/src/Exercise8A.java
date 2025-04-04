import java.util.Scanner;

public class Exercise8A {
    public static void main(String[] args) {
//        EXERCISE 8A
//        Develop an application that asks the user for two numbers.
//        Then it must exchange the values contained in each variable, i.e.:
//        Tell me a number: 3 Tell me another number: 8 The first one is 3 and
//        the second one 8 Exchange done¡¡¡ The first one is 8 and the second one 3

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number a: ");
        int a = scanner.nextInt();
        System.out.println("Enter number b: ");
        int b = scanner.nextInt();

        System.out.println("First number is: " + a + "\nSecond number is: " + b);
        System.out.println("Exchange done!!!!");

        int aux = a;
        a = b;
        b = aux;

        System.out.println(" ");
        System.out.println("Now first number is: " + a + "\nSecond number is: " + b);




    }
}
