import java.util.Scanner;

public class Exercise1A_IF_ELSEIF_ELSE {
    public static void main(String[] args) {

//        EXERCISE 1A
//        Develop a program that asks for two numbers and shows
//        whether they are equal or not.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int x = scanner.nextInt();

        System.out.println("Enter number 2: ");
        int j = scanner.nextInt();

        if(x == j){
            System.out.println("The numbers are equals");
        }else{
            System.out.println("The numbers are different");

        }

    }
}