import java.util.Scanner;

public class Exercise8R_LOOPS {
    public static void main(String[] args) {

//        EXERCISE 8R
//        Request N integer values by keyboard. You want to know:
//           The number of positive values.
//           The number of multiples of 15.
//           The sum of even numbers.

        Scanner scanner = new Scanner(System.in);
        int positives = 0;
        int multiples = 0;
        int sumEven = 0;

        int nValues = 1;

        while (nValues <= 5) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();


            if (number > 0) {
                positives++;
            }
            if (number % 15 == 0) {
                multiples++;
            }

            if (number % 2 == 0) {

                sumEven+= number;
            }

            nValues++;
        }


        System.out.println("Positive numbers: "+ positives);
        System.out.println("Multiple of 15 numbers: "+ multiples);
        System.out.println("Even sum: "+ sumEven);


    }
}
