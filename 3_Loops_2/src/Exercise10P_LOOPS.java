import java.util.Scanner;

public class Exercise10P_LOOPS {
    public static void main(String[] args) {
//        EXERCISE 10P
//        Calculate the persistence of a number N of at least 2 digits where what
//        we have to do is to multiply the digits of that number and the result
//    if it still has 2 digits or more multiply the digits of the resulting number
//        again until we get a one digit number. The persistence of the number is
//        the number of times we have had to repeat the process.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int number = scanner.nextInt();

        int persistence = 0;

        if (number >= 10) {
            while (number >= 10) {
                int product = 1;
                while (number > 0) {
                    product *= number % 10;
                    number /= 10;

                }
                number = product;
                persistence++;
                System.out.println("Intermediate result: " + number);


            }

            System.out.println("Final result: " + number);
            System.out.println("Persistence: " + persistence);
        } else {
            System.out.println("The number must be positive. Try again.");
        }
    }
}
