import java.util.Scanner;

public class Exercise23A_WHILE_DOWHILE {
    public static void main(String[] args) {

//        EXERCISE 23A
//        Make a program that asks for numbers until a double number
//        between 0 and 10 is entered.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number;

        do {
            System.out.print("Enter a number between 0 and 10: ");
            number = scanner.nextDouble();
        } while (number < 0 || number > 10);

        //DONE

    }
}
