import java.util.Scanner;

public class Exercise5A_IF_ELSEIF_ELSE {
    public static void main(String[] args) {


//        EXERCISE 5A
//        Develop an application that asks for 3 numbers and using 5 independent
//        if-else structures does the following:

//       An if-else structure that tells us whether all the numbers are greater
//          than 20 or not.
//       An if-else structure that tells us if they are all equal or not.
//       An if-else structure that tells us whether any are positive or not.
//       An if-else structure that tells us if there are at least 2 equal numbers
//          among the 3.
//       Display a final message if all the above conditions are met.

        Scanner scanner = new Scanner(System.in);
        int validation = 0;

        System.out.println("Enter number 1:");
        int x = scanner.nextInt();

        System.out.println("Enter number 2:");
        int j = scanner.nextInt();

        System.out.println("Enter number 3:");
        int k = scanner.nextInt();

        //Structure number 1:
        if (x >= 20 && j >= 20 && k >= 20) {
            System.out.println("All numbers are greater than 20.");
            validation++;
        } else {
            System.out.println("At least one number is less than 20. ");
        }

        // Structure number 2:
        if (x == j && j == k) {
            System.out.println("All numbers are equal.");
            validation++;
        } else {
            System.out.println("The numbers are not all equal.");
        }

        // Structure number 3:
        if (x > 0 || j > 0 || k > 0) {
            System.out.println("At least one number is positive.");
            validation++;
        } else {
            System.out.println("All numbers are zero or negative.");
        }

        // Structure number 4:
        if (x == j || x == k || j == k) {
            System.out.println("At least two numbers are equal.");
            validation++;
        } else {
            System.out.println("All numbers are different.");
        }

        // Structure number 5:
        if (validation == 4) {
            System.out.println("✅ All conditions have been met!");
        } else {
            System.out.println("❌ Not all conditions were met.");
        }


    }
}
