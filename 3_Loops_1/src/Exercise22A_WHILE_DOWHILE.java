import java.util.Scanner;

public class Exercise22A_WHILE_DOWHILE {
    public static void main(String[] args) {
//        EXERCISE 22A
//        Make a program that asks for numbers until a positive integer
//        is entered.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        do{
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
        }while(number<0);
        //DONE

    }
}
