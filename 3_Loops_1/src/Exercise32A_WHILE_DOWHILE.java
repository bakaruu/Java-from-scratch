import java.util.Random;
import java.util.Scanner;

public class Exercise32A_WHILE_DOWHILE {
    public static void main(String[] args) {
//        EXERCISE 32A
//        Carry out a programme like the previous one, but giving a
//        limited number of attempts. For example, if we give only 5
//        attempts maximum:

//        GUESS THE NUMBER
//        Attempt number 1: 50
//        Is less than
//        Try number 2: 25
//        It is higher
//        Try number 3: 32
//        Ohhhh! you have run out of tries!
//        Closing application

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

        } while (guess != secret && attempts < 5);


        if (attempts == 5) {
            System.out.println("Ohhhh! you have run out of tries!");

        }
        System.out.println("Closing application.");
    }
}
