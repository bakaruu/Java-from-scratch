import java.util.Scanner;

public class Exercise7P_LOOPS {
    public static void main(String[] args) {
//        EXERCISE 7P
//        Develop a program that, given an integer, tells us how many digits it has.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int digits= 0;

        while (number > 0) {
            number /= 10;
            digits++;
        }
        System.out.println("Total digits: "+ digits);
    }
}
