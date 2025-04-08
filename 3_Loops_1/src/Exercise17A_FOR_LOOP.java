import java.util.Random;
import java.util.Scanner;

public class Exercise17A_FOR_LOOP {
    public static void main(String[] args) {
//        EXERCISE 17A
//        Generate a String representing a password with lower case random letters
//        where the user enters the length of the password.

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter a password length to generate: ");
        int length = scanner.nextInt();
        String password = "";


        for (int i = 0; i < length; i++) {
            char randomLetter = (char) (random.nextInt(26) + 'a');
            password += randomLetter;
        }

        System.out.println("Your generated password: " + password);


    }
}
