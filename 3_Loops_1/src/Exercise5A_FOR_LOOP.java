import java.util.Scanner;

public class Exercise5A_FOR_LOOP {
    public static void main(String[] args) {
//        EXERCISE 5A
//        Develop an application that asks the user for 1 number. The program must
//        read as many numbers as the user has indicated and add them all together
//        showing the result.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int output = 0;
        for (int i = 1; i <= number; i++) {
            output += i;

        }

        //or

        for (int i = 1; i <= number; i++) {
            System.out.print("Enter number " + i + ": ");
            int input = scanner.nextInt();
            output += input;
        }
        System.out.println(output);
    }
}
