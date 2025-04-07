import java.util.Scanner;

public class Exercise13R_IF_ELSEIF_ELSE {
    public static void main(String[] args) {
//        EXERCISE 13R
//        We have a padlock that opens by means of a combination of 3 capital
//        letters in the same way as the videogame Residente vil 2 remake.
//        Program this behaviour where the user introduces 3 consecutive
//        letters and the program responds if it is the correct combination.
//        In case it is not the correct one, indicate how many have been
//        correct and how many are in place. The secret combination will be
//        determined manually at the beginning by means of end variables.

        Scanner scanner = new Scanner(System.in);

        // 🔒 Secret combination (hardcoded)
        final char l1 = 'N';
        final char l2 = 'E';
        final char l3 = 'D';

        System.out.println("Enter the 3-letter combination (use uppercase):");
        System.out.print("Letter 1: ");
        char input1 = scanner.next().charAt(0);

        System.out.print("Letter 2: ");
        char input2 = scanner.next().charAt(0);

        System.out.print("Letter 3: ");
        char input3 = scanner.next().charAt(0);

        // ✅ Check if all match
        if (input1 == l1 && input2 == l2 && input3 == l3) {
            System.out.println("🔓 Correct! The padlock is open.");
        } else {
            int correctLetters = 0;
            int correctPosition = 0;

            // Check correct letters (anywhere)
            if (input1 == l1 || input1 == l2 || input1 == l3) correctLetters++;
            if (input2 == l1 || input2 == l2 || input2 == l3) correctLetters++;
            if (input3 == l1 || input3 == l2 || input3 == l3) correctLetters++;

            // Check correct positions
            if (input1 == l1) correctPosition++;
            if (input2 == l2) correctPosition++;
            if (input3 == l3) correctPosition++;

            System.out.println("❌ Incorrect combination.");
            System.out.println("✔️ Correct letters (any position): " + correctLetters);
            System.out.println("📍 Letters in correct position: " + correctPosition);
        }

    }
}
