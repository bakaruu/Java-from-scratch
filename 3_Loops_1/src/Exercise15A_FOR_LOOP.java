import java.util.Random;
import java.util.Scanner;

public class Exercise15A_FOR_LOOP {
    public static void main(String[] args) {
//        EXERCISE 15A
//        We are going to make a dice game. Ask the user to enter a number
//    between 1 and 6 (one side of a dice). Generate 10 random numbers (using the
//    Random class) between 1 and 6 by displaying them and tell if the number
//        chosen by the user came up at least once.


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Choose a number between 1 and 6: ");
        int chosen = scanner.nextInt();

//        Optional: Validate input
        if (chosen < 1 || chosen > 6) {
            System.out.println("Invalid number. Please choose a number between 1 and 6.");
            return;
        }

        boolean appeared = false;
        System.out.print("Dice rolls: ");

        for (int i = 0; i < 10; i++) {
            int roll = random.nextInt(6) + 1; // Generates [1,6]
            System.out.print(roll + " ");
            if (roll == chosen) {
                appeared = true;
            }
        }

        System.out.println();
        if (appeared) {
            System.out.println("Your number " + chosen + " appeared at least once!");
        } else {
            System.out.println("Your number " + chosen + " did not appear.");
        }

    }
}
