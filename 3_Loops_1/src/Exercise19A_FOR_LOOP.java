import java.util.Scanner;

public class Exercise19A_FOR_LOOP {
    public static void main(String[] args) {
//        EXERCISE 19A
//        A program to write on the screen the first N multiplication tables
//        starting with 1 where N is a number entered on the keyboard.


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many multiplication tables you want to generate: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\n📋 Multiplication table of " + i + ":");
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
