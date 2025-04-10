import java.util.Random;
import java.util.Scanner;

public class Exercise31A_WHILE_DOWHILE {
    public static void main(String[] args) {
//        EXERCISE 31A
//        Make a program to play a number guessing game. The game sets at the
//        beginning the randomly generated secret number between 1 and 100.
//        Each time the player enters a number, clues are given as to whether
//        it is above or below the number entered. Only when the number is guessed
//        correctly will the program be exited. For example, a game could be as
//        follows:
//
//        GUESS THE NUMBER
//        Attempt number 1: 50
//        Is less than
//        Try number 2: 25
//        It is higher
//        Try number 3: 32
//        Correct!
//        Closing application
//        In addition to the above messages, if it took 5 attempts or less,
//        display the message ‘You are a crack’, if it took more than 10,
//        display ‘It took you a little while’. Otherwise do not show an
//        extra message.

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secret = random.nextInt(100) + 1; // random number between 1 and 100
        int guess;
        int attempts = 0;

        System.out.println("GUESS THE NUMBER (between 1 and 100)");

        do {
            attempts++;
            System.out.print("Attempt number " + attempts + ": ");
            guess = scanner.nextInt();

            if (guess < secret) {
                System.out.println("It's higher!");
            } else if (guess > secret) {
                System.out.println("It's lower!");
            } else {
                System.out.println("Correct!");
            }

        } while (guess != secret);

        System.out.println("Closing application.");

        if (attempts <= 5) {
            System.out.println("You are a crack!");
        } else if (attempts > 10) {
            System.out.println("It took you a little while...");
        }
    }
}
