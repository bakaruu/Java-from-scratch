import java.util.Scanner;

public class Exercise6P_LOOPS {
    public static void main(String[] args) {
//        EXERCISE 6P
//        Develop a program that, given a positive integer,
//        tells whether it is prime or not.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {

//           no number greater than number / 2 (except number itself)
//           can divide it evenly
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

        }

        if (isPrime) {
            System.out.println(number + " is prime.");
        } else {
            System.out.println(number + " is not prime.");
        }


    }
}
