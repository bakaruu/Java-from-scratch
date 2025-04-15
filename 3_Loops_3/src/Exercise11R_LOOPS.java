import java.util.Scanner;

public class Exercise11R_LOOPS {
    public static void main(String[] args) {
//        EXERCISE 11R Write programs that read a quantity N of numbers determined
//        at the beginning by the user so that:
//           A program that shows us if all the numbers were even.
//           A program that shows us if any numbers were odd.
//           A program that adds numbers until it exceeds 100, exiting in that case
//              and showing the final result. If it does not exceed 100, it will add them
//              all up and display the result as well.

//         The programs have to be as efficient as possible so that it
//         stops asking for numbers if it is no longer necessary for
//         the program.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1) Check if all numbers are even");
        System.out.println("2) Check if any number is odd");
        System.out.println("3) Sum numbers until the sum exceeds 100");
        System.out.print("Enter your option: ");
        int choice = scanner.nextInt();

        System.out.print("Enter how many numbers you want to input: ");
        int N = scanner.nextInt();

        switch (choice) {
            case 1:
                boolean allEven = true;
                for (int i = 0; i < N; i++) {
                    System.out.print("Enter number " + (i + 1) + ": ");
                    int number = scanner.nextInt();
                    if (number % 2 != 0) {
                        allEven = false;
                        break;
                    }
                }
                if (allEven) {
                    System.out.println("All numbers are even.");
                } else {
                    System.out.println("Not all numbers are even.");
                }
                break;

            case 2:
                boolean anyOdd = false;
                for (int i = 0; i < N; i++) {
                    System.out.print("Enter number " + (i + 1) + ": ");
                    int number = scanner.nextInt();
                    if (number % 2 != 0) {
                        anyOdd = true;
                        break;
                    }
                }
                if (anyOdd) {
                    System.out.println("There is at least one odd number.");
                } else {
                    System.out.println("No odd numbers found.");
                }
                break;

            case 3:
                int sum = 0;
                for (int i = 0; i < N; i++) {
                    System.out.print("Enter number " + (i + 1) + ": ");
                    int number = scanner.nextInt();
                    sum += number;
                    if (sum > 100) {
                        System.out.println("Sum exceeded 100: " + sum);
                        break;
                    }
                }
                if (sum <= 100) {
                    System.out.println("Total sum: " + sum);
                }
                break;

            default:
                System.out.println("Invalid option.");
        }
    }
}
