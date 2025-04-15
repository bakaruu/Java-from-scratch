import java.util.Scanner;

public class Exercise5A2_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 5A
//        Create a program that displays on screen a text of random letters
//        (only capital letters) where the user chooses the size of the text.


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of letters to generate: ");
        int size = scanner.nextInt();

        char[] text = new char[size];

        for (int i = 0; i < text.length; i++) {
            // Generate random capital letter between 'A' and 'Z'
            text[i] = (char) ('A' + (int)(Math.random() * 26));
        }

        System.out.print("Generated text: ");
        for (char c : text) {
            System.out.print(c);
        }

    }
}
