import java.util.Scanner;

public class Exercise3A_FOR_LOOP {
    public static void main(String[] args) {
//        EXERCISE 3A
//        Show the multiplication table for a number entered on
//        the keyboard. For example:

//        Enter a number:
//        4x1=4
//        4x2=8
//        4x3=12
//        4x10=40

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(number + "x" + i + "= " + (number * i));

        }
    }
}
