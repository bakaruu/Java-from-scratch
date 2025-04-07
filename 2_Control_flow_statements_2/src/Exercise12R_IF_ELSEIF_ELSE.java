import java.util.Scanner;

public class Exercise12R_IF_ELSEIF_ELSE {
    public static void main(String[] args) {
//        EXERCISE 12R Carry out the same programme as exercise 4R, but if it is not
//        accepted, show what the problem was.

//        If it is not accepted, show what the problem was, i.e. if the grade,
//        age or sex failed. You have to show all the possible causes of error.
//        Subsequently, make a version where the question is asked in an orderly
//        way and if the grade fails, for example, it does not continue asking for
//        more data and shows a message with the cause of the error.


        Scanner scanner = new Scanner(System.in);

        //VERSION 1:
        System.out.println("VERSION 1: Check everything and report all errors");

        System.out.print("Enter grade: ");
        int grade1 = scanner.nextInt();

        System.out.print("Enter age: ");
        int age1 = scanner.nextInt();

        System.out.print("Enter gender (M or V): ");
        char gender1 = scanner.next().charAt(0);

        boolean accepted = true;

        if (grade1 < 5) {
            System.out.println("Grade must be 5 or higher.");
            accepted = false;
        }

        if (age1 < 18) {
            System.out.println("Age must be 18 or older.");
            accepted = false;
        }

        if (gender1 != 'M' && gender1 != 'V') {
            System.out.println("Gender must be 'M' or 'V'.");
            accepted = false;
        }

        if (accepted) {
            System.out.println("ACCEPTED");
        } else {
            System.out.println("NOT ACCEPTED");
        }

        System.out.println("\n----------------------------------------\n");

        //VERSION 2:
//        System.out.println("VERSION 2: Stop immediately on error");
//
//        System.out.print("Enter grade: ");
//        int grade2 = scanner.nextInt();
//
//        if (grade2 < 5) {
//            System.out.println("Grade must be 5 or higher.");
//            System.out.println("NOT ACCEPTED");
//            return;
//        }
//
//        System.out.print("Enter age: ");
//        int age2 = scanner.nextInt();
//
//        if (age2 < 18) {
//            System.out.println("Age must be 18 or older.");
//            System.out.println("NOT ACCEPTED");
//            return;
//        }
//
//        System.out.print("Enter gender (M or V): ");
//        char gender2 = scanner.next().charAt(0);
//
//        if (gender2 != 'M' && gender2 != 'V') {
//            System.out.println("Gender must be 'M' or 'V'.");
//            System.out.println("NOT ACCEPTED");
//            return;
//        }
//
//        System.out.println("✅ ACCEPTED");
    }
}
