import java.util.Scanner;

public class Exercise4P_LOOPS {

    public static void main(String[] args) {
//       EXERCISE 4P
//       Create a program that determines when two integers are friends.
//       Two friends are two positive integers a and b such that a is the sum
//       of the proper divisors of b (excluding b itself), and b is the
//       sum of the proper divisors of a (excluding a itself).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter first number: ");
        int b = scanner.nextInt();

        int sumA= 0;
        int sumB= 0;

        for (int i= 1; i<a; i++){
            if (a % i == 0) {
                sumA+=i;
            }
        }

        for (int i= 1; i<b; i++){
            if (b % i == 0) {
                sumB+=i;
            }
        }

        if(sumA == b && sumB == a){
            System.out.println("Both numbers are friends.");
        }



    }
}
