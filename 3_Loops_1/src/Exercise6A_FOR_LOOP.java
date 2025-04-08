import java.util.Scanner;

public class Exercise6A_FOR_LOOP {
    public static void main(String[] args) {
//        EXERCISE 6A
//        Develop an application that asks the user for 2 numbers and multiplies
//        them using successive sums. For example, to multiply 4 by 5 you would do
//        4+4+4+4+4=20.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter another number: ");
        int number2 = scanner.nextInt();

        int sum = 0;

        for(int i=0; i < number2; i++){
            sum+=number1;
        }

        System.out.println(sum);

    }
}
