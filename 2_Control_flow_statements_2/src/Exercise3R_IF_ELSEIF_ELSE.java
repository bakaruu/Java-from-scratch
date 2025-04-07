import java.util.Scanner;

public class Exercise3R_IF_ELSEIF_ELSE {
    public static void main(String[] args) {

//        EXERCISE 3R
//        A number is called automorphic when it is squared and the
//        resulting number ends in the same digit as itself. For example,
//        5 is automorphic because 5 squared is 25.


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int square = num * num;

        // Get the number of digits of the original number
        int numDigits = (int) Math.log10(num) + 1;

        // Create a modulus to extract the last digits
        int mod = (int) Math.pow(10, numDigits);

        if (square % mod == num) {
            System.out.println("✅ " + num + " is an automorphic number.");
        } else {
            System.out.println("❌ " + num + " is not an automorphic number.");
        }


    }
}
