import java.util.Scanner;

public class Exercise2R_IF_ELSEIF_ELSE {
    public static void main(String[] args) {
//        EXERCISE 2R
//        Starting from a variable of type char that is requested
//        by keyboard, if the letter is lower case, transform it to
//      upper case and vice versa. If the character is not alphabetic,
//        display an error message.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        char letter = scanner.next().charAt(0);

        if (letter >= 'a' && letter <= 'z') {

            char upper = (char) (letter - 32);
            System.out.println("Uppercase version: " + upper);
        } else if (letter >= 'A' && letter <= 'Z') {

            char lower = (char) (letter + 32);
            System.out.println("Lowercase version: " + lower);
        } else {
            System.out.println("❌ Error: The character is not a letter.");
        }


    }
}
