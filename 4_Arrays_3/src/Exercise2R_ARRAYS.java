import java.util.Scanner;

public class Exercise2R_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 2R
//        Given an array and an integer number that is requested from the keyboard
//        only display on the screen the numbers in the array that are divisible by
//        the number read from the keyboard.
//        For example if we have the array [1, 2, 3, 4, 5, 6] and the user
//        types the number 2, it should display 2, 4, 6. If none of them is divisible,
//        display a message informing about it.

        Scanner scanner = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.print("Enter a number to divide by: ");
        int divisor = scanner.nextInt();

        boolean found = false;
        System.out.print("Divisible numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                System.out.print(arr[i] + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No numbers in the array are divisible by " + divisor);
        }

    }
}
