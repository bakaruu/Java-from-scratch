import java.util.Scanner;

public class Exercise8A_FOR_LOOP {
    public static void main(String[] args) {
//        EXERCISE 8A
//        Given a series of N data entered by keyboard,
//        display on the screen the highest value entered.
//        entered.

        Scanner scanner = new Scanner(System.in);
        int number;
        int aux = 0;
        //In case we want to enter negative numbers LOL.
        //int aux = Integer.MIN_VALUE;

        for (int i = 0 ; i<10;i++){
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
            if (number>aux){
                aux=number;
            }

        }
        System.out.println("The greater number is: "+ aux);
    }
}
