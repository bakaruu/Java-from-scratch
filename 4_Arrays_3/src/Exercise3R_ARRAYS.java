import java.util.Scanner;

public class Exercise3R_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 3R
//        Same as exercise 10A, but with the following options:
//        1) Highlight only those with 3 digits.
//        2) Highlight only the maximum and minimum.
//        3) Highlight only those that are below the mean.


        int[] arr = {159, 204, 20, 250, 178, 90, 353, 32, 229, 357, 224, 54, 260,
                310, 140, 249, 335, 326, 223, 13};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Which numbers do you want to highlight?");
        System.out.println("Option 1 - only those with 3 digits");
        System.out.println("Option 2 - only maximum and minimum");
        System.out.println("Option 3 - only those below the average");
        System.out.print("Enter your option (1, 2 or 3): ");
        int option = scanner.nextInt();

        System.out.println("\nHighlighted array:");
        switch (option) {
            case 1: // 3-digit numbers
                for (int num : arr) {
                    if (num >= 100 && num <= 999) {
                        System.out.print("[" + num + "] ");
                    } else {
                        System.out.print(num + " ");
                    }
                }
                break;

            case 2: // Min and Max
                int min = arr[0];
                int max = arr[0];
                for (int num : arr) {
                    if (num < min) min = num;
                    if (num > max) max = num;
                }
                for (int num : arr) {
                    if (num == min || num == max) {
                        System.out.print("[" + num + "] ");
                    } else {
                        System.out.print(num + " ");
                    }
                }
                break;

            case 3: // Below average
                int sum = 0;
                for (int num : arr) sum += num;
                double average = (double) sum / arr.length;

                for (int num : arr) {
                    if (num < average) {
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
