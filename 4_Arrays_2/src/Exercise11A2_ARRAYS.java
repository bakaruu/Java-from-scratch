import java.util.Random;
import java.util.Scanner;

public class Exercise11A2_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 11A
//        Make a program that creates an array of integers where the user chooses the size
//        (we assume correct size for the array). The data is randomised between 1
//        and 100 and there can be no repeats.
//        The following programs have to be as efficient as possible without unnecessary
//        iterations.

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the size: ");
        int size = scanner.nextInt();


        int[] arr = new int[size];
        boolean[] used = new boolean[101]; // Index from 1 to 100

        int count = 0;
        while (count < size) {
            int num = random.nextInt(100) + 1; // 1 to 100
            if (!used[num]) {
                arr[count] = num;
                used[num] = true;
                count++;
            }
        }

//        if we don't use the boolean array to set index to check if number is used:

//        int max = 1000;
//        while (count < size) {
//
//            int num = random.nextInt(max) + 1; // número entre 1 y max
//            boolean repeated = false;
//
//            // Revisar si ya está en el array
//            for (int i = 0; i < count; i++) {
//                if (arr[i] == num) {
//                    repeated = true;
//                    break;
//                }
//            }
//
//            if (!repeated) {
//                arr[count] = num;
//                count++;
//            }
//        }


        // Show the final array
        System.out.print("Generated array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }


    }
}
