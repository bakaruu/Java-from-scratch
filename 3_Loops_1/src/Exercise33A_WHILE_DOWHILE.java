import java.util.Scanner;

public class Exercise33A_WHILE_DOWHILE {
    public static void main(String[] args) {
//        EXERCISE 33A
//        Develop an algorithm for the following game: The user enters a
//        lower limit, an upper limit and thinks of a number in that range.
//        The computer has to get it right. For this, the computer proposes
//        a number and the user answers with >, < or = (corresponding to
//        correct and the program ends).
//        If the answer is > or <, the computer will propose another number
//        until the user gets it right.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a lower limit: ");
        int lowerLimit = scanner.nextInt();

        System.out.print("Enter an upper limit: ");
        int upperLimit = scanner.nextInt();

        char response;
        int guess;
        int attempts = 0;

        System.out.println("\nThink of a number between " + lowerLimit + " and " + upperLimit + "...");
        System.out.println("I will try to guess it! Respond with:\n'>' if your number is higher\n'<' if it's lower\n'=' if I'm correct\n");

        do {
//            Computer guesses the middle of the current range
            guess = (lowerLimit + upperLimit) / 2;
            attempts++;

            System.out.print("Is it " + guess + "? ");
            response = scanner.next().charAt(0);

            if (response == '>') {
                lowerLimit = guess + 1;
            } else if (response == '<') {
                upperLimit = guess - 1;
            }

        } while (response != '=' && lowerLimit <= upperLimit);

        if (response == '=') {
            System.out.println("Got it in " + attempts + " attempts!");
        } else {
            System.out.println("That doesn't make sense! Check your responses.");
        }
    }
}
