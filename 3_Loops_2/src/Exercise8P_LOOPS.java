import java.util.Scanner;

public class Exercise8P_LOOPS {
    public static void main(String[] args) {
//        EXERCISE 8P
//        Given a positive number N add its digits. For example, given 56181
//        the result would be 5+6+1+1+8+1=21

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int number = scanner.nextInt();
        int sum = 0;

        if(number > 0){
            while (number > 0) {
                int digit = number % 10;      // Get last digit
                sum+=digit;                   // Print it (or store it)
                number = number / 10;         // Remove last digit
            }

            System.out.println("Total sum: "+ sum);

        }else{
            System.out.println("The number must be positive. Try again.");
        }
    }
}
