import java.util.Scanner;

public class Exercise1A_FOR_LOOP {
    public static void main(String[] args) {
//        EXERCISE 1A
//        Develop an application that prompts the user for a letter
//        and a whole number. This letter will appear as many times
//        as the user has indicated.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        char letter = scanner.next().charAt(0);

        System.out.println("Enter a number of reps: ");
        int reps = scanner.nextInt();

        for (int i = 0; i < reps; i++) {
            System.out.println(letter);
        }

    }
}