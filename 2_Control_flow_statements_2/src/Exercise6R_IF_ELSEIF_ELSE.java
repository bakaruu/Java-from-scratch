import java.util.Scanner;

public class Exercise6R_IF_ELSEIF_ELSE {
    public static void main(String[] args) {
//        EXERCISE 6R
//        Develop an application that asks for two numbers and tells us if one
//        is a multiple of the other. The first thing the program has to do is
//        to check if they are different numbers, because if they are the same,
//        the answer is obvious. Once that has been checked, a number A is a
//        multiple of another B when the remainder of dividing A by B is 0.

        Scanner  scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = scanner.nextInt();
        System.out.println("Enter second number: ");
        int j = scanner.nextInt();

        if(x != j){
            if(x%j == 0){
                System.out.printf("%d is multiple of %d", x, j);
            }else {
                System.out.printf("%d is not multiple of %d", x, j);

            }

        }else {
            System.out.println("Must be different numbers. Try again.");
        }
    }
}
