import java.util.Scanner;

public class Exercise9A_FOR_LOOP {
    public static void main(String[] args) {
//        EXERCISE 9A
//        Solve the following statements using for loops (we always assume that
//                the data entered by the user are correct): - Solve the following
//        statements using for loops (we always assume that the data entered by the
//        user are correct)

//         Write a program that asks for an integer greater than zero and writes its
//        divisors.
//
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number greater than 0: ");
//        int number = scanner.nextInt();
//
//        String output = "";
//
//        if (number > 0) {
//            for (int i = 1; i <= number; i++) {
//                if (number % i == 0) {
//                    output += i + " ";
//                }
//            }
//        }
//
//        System.out.println(output);

//         Write a program that asks how many numbers to enter, prompts for those
//        numbers, and displays a message each time a number is greater than the
//        first one.

//        System.out.println("How many numbers will be entered?: ");
//        int x = scanner.nextInt();
//
//
//        System.out.println("Enter number 1: ");
//        int first = scanner.nextInt();
//
//        for (int i = 2; i <= x; i++) {
//            System.out.println("Enter number " + i + ": ");
//            int j = scanner.nextInt();
//
//            if (j > first) {
//                System.out.printf("%d is greater than %d\n", j, first);
//
//            }
//
//        }


//         Write a program that asks how many numbers are to be entered, prompts
//        for those numbers, and
//        displays a message each time a number is greater than the previous one.

        System.out.println("How many numbers will be entered?: ");
        int x = scanner.nextInt();
        System.out.println("Enter number 1: ");
        int aux = scanner.nextInt();

        for (int i = 2; i <= x; i++) {
            System.out.println("Enter number " + i + ": ");
            int j = scanner.nextInt();

            if(j>aux){
                System.out.printf("%d is greater than %d\n", j,aux);
                aux=j;
            }

        }

    }
}
