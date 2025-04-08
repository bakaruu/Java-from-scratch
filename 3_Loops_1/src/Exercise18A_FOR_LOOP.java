import java.util.Scanner;

public class Exercise18A_FOR_LOOP {
    public static void main(String[] args) {
//        EXERCISE 18A
//        Develop an application that asks for a number and draws a
//        rectangle of asterisks of width 6, but where the user chooses
//        the height. The result should look like the one below:
//
//        What is the height of your rectangle:4.
//        * * * * * *
//        * * * * * *
//        * * * * * *
//        * * * * * *

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the height of your rectangle: ");
        int number = scanner.nextInt();

        String line = "* * * * * *";

        for (int i =0; i<number;i++){
            System.out.println(line);
        }


    }
}
