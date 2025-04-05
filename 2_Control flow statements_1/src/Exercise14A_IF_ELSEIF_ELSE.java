import java.util.Scanner;

public class Exercise14A_IF_ELSEIF_ELSE {
    public static void main(String[] args) {

//        EXERCISE 14A
//        Develop a program that allows you to enter by keyboard the
//        total sales achieved by a salesman during the corresponding
//        month and calculate his bonus, knowing
//        salesman during the corresponding month and calculate his bonus knowing:

//        Sales Bonus (%)
//        0 - 100 = 0
//        100 - 500 = 3
//        500 - 1500 = 5
//        1500 plus = 8

//        If the user enters negative sales, this should be checked and an
//        error message should be displayed.

        Scanner scanner = new Scanner(System.in);

        System.out.println("How much did you sell?: ");
        int sellings = scanner.nextInt();

        if (sellings < 0) {
            System.out.println("❌ Error: Sales cannot be negative.");
        } else if (sellings >= 0 && sellings < 100) {
            System.out.println("Bonus: 0%");
        } else if (sellings >= 100 && sellings < 500) {
            System.out.println("Bonus: 3%");
        } else if (sellings >= 500 && sellings < 1500) {
            System.out.println("Bonus: 5%");
        } else {
            System.out.println("Bonus: 8%");
        }


    }
}
