import java.util.Scanner;

public class Exercise24A_WHILE_DOWHILE {
    public static void main(String[] args) {
//        EXERCISE 24A
//        Make a program where the user enters characters separated
//        by blanks and counts on the one hand how many are upper case
//        letters, on the other hand lower case letters, on the
//        other hand numbers. All other characters are ignored. A ‘.’
//        will indicate the end of the data.

        Scanner scanner = new Scanner(System.in);

        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;
        String text = "Enter characters separated by spaces (end with '.'):";

        System.out.println(text);

        char ch = scanner.next().charAt(0);

        while (ch != '.') {
            if (ch >= 'A' && ch <= 'Z') {
                upperCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                lowerCount++;
            } else if (ch >= '0' && ch <= '9') {
                digitCount++;
            }

            System.out.println(text);
            ch = scanner.next().charAt(0);
        }

        System.out.println("Uppercase letters: " + upperCount);
        System.out.println("Lowercase letters: " + lowerCount);
        System.out.println("Digits: " + digitCount);

    }
}
