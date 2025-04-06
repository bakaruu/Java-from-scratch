import java.util.Scanner;

public class Exercise2A_IF_ELSEIF_ELSE {
    public static void main(String[] args) {
//        EXERCISE 2A
//        Make a program that reads three integers and checks if the sum of the
//        first and the second is equal to the third by displaying a message
//        according to each case.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int a = scanner.nextInt();

        System.out.println("Enter number 2: ");
        int b = scanner.nextInt();

        System.out.println("Enter number 2: ");
        int c = scanner.nextInt();

        if(a+b == c){
            System.out.printf("%d + %d are equal to %d", a, b, c );
        }else{
            System.out.printf("%d + %d are different to %d", a, b, c );
        }

    }
}
