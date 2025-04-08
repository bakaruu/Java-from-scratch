import java.util.Scanner;

public class Exercise2A_FOR_LOOP {
    public static void main(String[] args) {
//        EXERCISE 2A
//        Develop an application that prompts the user for a number
//        and displays only odd numbers from 1 to the number read.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i += 2) {
            System.out.println(i);
        }


    }
}
