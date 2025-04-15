import java.util.Scanner;

public class Exercise10A_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 10A
//        Write a program that, given an array, will ask if the user wants
//        to highlight the multiples of 5 or the multiples of 7. The array will
//        then be displayed by typing the numbers to be highlighted in square
//        brackets. Example:

//        Which numbers do you want to highlight (Option 1 - multiples of 5.
//        Option 2 - multiples of 7): 1
//        159 204 [20] [250] 178 [90] 353 32 229 357 224 54 [260]
//        [310] [140] 249 [335] 326 223 13

        int[] arr = {159, 204, 20, 250, 178, 90, 353, 32, 229, 357, 224, 54, 260,
                310, 140, 249, 335, 326, 223, 13};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Which numbers do you want to highlight?");
        System.out.println("Option 1 - multiples of 5");
        System.out.println("Option 2 - multiples of 7");
        System.out.print("Enter your option (1 or 2): ");
        int option = scanner.nextInt();

        System.out.println("\nHighlighted array:");
        switch (option) {
            case 1: // Multiples of 5
                for (int num : arr) {
                    if (num % 5 == 0) {
                        System.out.print("[" + num + "] ");
                    } else {
                        System.out.print(num + " ");
                    }
                }
                break;

            case 2: // Multiples of 7
                for (int num : arr) {
                    if (num % 7 == 0) {
                        System.out.print("[" + num + "] ");
                    } else {
                        System.out.print(num + " ");
                    }
                }
                break;

            default:
                System.out.println("Invalid option.");
        }
    }
}
