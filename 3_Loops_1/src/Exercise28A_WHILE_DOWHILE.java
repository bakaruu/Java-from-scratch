import java.util.Scanner;

public class Exercise28A_WHILE_DOWHILE {
    public static void main(String[] args) {
//        EXERCISE 28A
//        Write a program that reads an integer (positive or negative) until the
//        following 3 conditions are met:

//         Let it be even.
//         Ending in 2.
//         It must have at least two digits.
//        If it does it on the first try, display ‘You're a crack’, if it took 5
//        or more, display ‘It cost you’. Otherwise, nothing is displayed
//        on the screen.

        Scanner scanner = new Scanner(System.in);

        int number;
        int attempts = 0;

        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            attempts++;
        } while (!(number % 2 == 0 && Math.abs(number) % 10 == 2 && Math.abs(number) >= 10));


        if (attempts == 1) {
            System.out.println("You're a crack");
        } else if (attempts >= 5) {
            System.out.println("It cost you");
        }
    }
}
