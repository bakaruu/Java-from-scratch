import java.util.Scanner;

public class Exercise21A_WHILE_DOWHILE {
    public static void main(String[] args) {

//        EXERCISE 21A
//        Develop an application that asks the user for numbers until it is 0.

        Scanner scanner = new Scanner(System.in);
        int number;
        do{
            System.out.println("Enter a number: ");
            number= scanner.nextInt();
        }while(number!=0);
    }
}
