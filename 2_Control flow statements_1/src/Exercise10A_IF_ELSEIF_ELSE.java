import java.util.Scanner;

public class Exercise10A_IF_ELSEIF_ELSE {
    public static void main(String[] args) {

//        EXERCISE 10A
//        Develop an application that asks the user for 3 numbers and
//        displays the smallest of them.

        Scanner scanner = new Scanner(System.in);
        int aux;

        System.out.println("Enter first number: ");
        int x = scanner.nextInt();

        System.out.println("Enter second number: ");
        int j = scanner.nextInt();

        System.out.println("Enter third number: ");
        int k = scanner.nextInt();

        if (x < j && x < k) {
            aux = x;
        }else if(j<x && j<k){
            aux = j;
        }else {
            aux = k;
        }

        System.out.printf("%d is the smallest one: ", aux);

    }
}
