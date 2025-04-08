import java.util.Random;
import java.util.Scanner;

public class Exercise20A_FOR_LOOP {
    public static void main(String[] args) {

//        EXERCISE 20A
//        Starting from exercise 15A, the user writes down how many passwords
//        he/she wants to generate and the length of the passwords.

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("How many passwords do you want to generate? ");
        int count = scanner.nextInt();

        System.out.print("Enter the length of each password: ");
        int length = scanner.nextInt();

        System.out.println("\n🔐 Generated passwords:");

        for (int i = 1; i <= count; i++) {
            String password = "";
            for (int j = 0; j < length; j++) {
                char letter = (char) (random.nextInt(26) + 'a'); // lowercase letter
                password += letter;
            }
            System.out.println("Password " + i + ": " + password);
        }
    }
}
