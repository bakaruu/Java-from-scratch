import java.util.Scanner;

public class Exercise10A2_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 10A
//        Make a program that, given an array, prompts for a number from the keyboard
//        until it types one that is in the array.

        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 22, 34, 67};
        boolean found = false;

        do {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();

            for (int i = 0; i < arr.length; i++) {
                if (number == arr[i]){
                    System.out.println("Number is in.");
                    found=true;
                    break;
                }

            }

            if (!found) {
                System.out.println("Not found. Try again.");
            }


        } while (!found);

        System.out.println("Exiting...");

    }
}
