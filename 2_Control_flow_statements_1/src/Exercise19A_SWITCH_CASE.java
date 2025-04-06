import java.util.Scanner;

public class Exercise19A_SWITCH_CASE {
    public static void main(String[] args) {

//        EXERCISE 19A
//        Make a program that reads a String variable with a month and checks
//        if the value corresponds to a month of 30 days, or to a month of 31
//        or to a month of 28 or 29. If it does not match any month of the
//        year, display an error message.

        Scanner scanner = new Scanner(System.in);
        String option = scanner.next(); //( .toLowerCase() but we don't know that yet')

        switch (option) {
            case "april":
            case "june":
            case "september":
            case "november":
                System.out.println("This month has 30 days.");
                break;

            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                System.out.println("This month has 31 days.");
                break;

            case "february":
                System.out.println("February has 28 or 29 days depending on leap year.");
                break;

            default:
                System.out.println("That's not a valid month.");
                break;
        }
    }
}
