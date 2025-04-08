import java.util.Random;
import java.util.Scanner;

public class Exercise16A_FOR_LOOP {
    public static void main(String[] args) {
//        EXERCISE 16A
//        Variation of the previous exercise where the user also tries to guess
//        how many times the face of the die he/she has chosen comes up.

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Choose a number between 1 and 6: ");
        int chosen = scanner.nextInt();

        if (chosen < 1 || chosen > 6) {
            System.out.println("Invalid number. Please choose between 1 and 6.");
            return;
        }

        System.out.print("Guess how many times your number will appear (out of 10 rolls): ");
        int guess = scanner.nextInt();

        int count = 0;
        System.out.print("Dice rolls: ");
        for (int i = 0; i < 10; i++) {
            int roll = random.nextInt(6) + 1; // 1 to 6
            System.out.print(roll + " ");
            if (roll == chosen) {
                count++;
            }
        }

        System.out.println("\nYour number appeared " + count + " time(s).");

        if (guess == count) {
            System.out.println("Congrats! Your guess was correct.");
        } else {
            System.out.println("Sorry! Your guess was incorrect.");
        }
    }
}
