import java.util.Scanner;

public class Exercise3A_IF_ELSEIF_ELSE {
    public static void main(String[] args) {

//        EXERCISE 3A
//        Develop a program that asks for two numbers and tries to do their division,
//        checking that it cannot divide by 0. Show the result if the division is
//        possible or an error message.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int x = scanner.nextInt();

        System.out.println("Enter second number: ");
        int j = scanner.nextInt();

        if(j == 0){
            System.out.printf("Divisor is %d which is not allowed in math. It causes an error", j);
        }else{
            System.out.printf("Result: %d / %d = %d\n", x, j, x / j);

        }
    }
}
