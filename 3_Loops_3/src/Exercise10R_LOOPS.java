import java.util.Scanner;

public class Exercise10R_LOOPS {
    public static void main(String[] args) {
//        EXERCISE 10R
//        Write a program that reads from the keyboard a series of numbers, where
//        the number of numbers (N) is indeterminate. The data corresponds to the number
//        of children of a number of couples who have been asked.
//        The data corresponds to the number of children a number of asked
//        couples have. The program should show the percentages of couples
//        who have 1 child, more than 1 child, or no children (3 counters). A negative
//        figure warns that this is the end of the data.
//        that this is the end of the data.

        Scanner scanner = new Scanner(System.in);

        int noChildren = 0;
        int oneChild = 0;
        int moreThanOneChild = 0;
        int totalCouples = 0;

        int input;

        System.out.println("Enter the number of children for each couple (negative number to stop):");

        while (true) {
            input = scanner.nextInt();

            if (input < 0) {
                break;
            }

            totalCouples++;

            if (input == 0) {
                noChildren++;
            } else if (input == 1) {
                oneChild++;
            } else {
                moreThanOneChild++;
            }
        }

        if (totalCouples > 0) {
            double pctNoChildren = (noChildren * 100.0) / totalCouples;
            double pctOneChild = (oneChild * 100.0) / totalCouples;
            double pctMoreThanOne = (moreThanOneChild * 100.0) / totalCouples;

            System.out.printf("No children: %.2f%%\n", pctNoChildren);
            System.out.printf("1 child: %.2f%%\n", pctOneChild);
            System.out.printf("More than 1 child: %.2f%%\n", pctMoreThanOne);
        } else {
            System.out.println("No data was entered.");
        }



    }
}
