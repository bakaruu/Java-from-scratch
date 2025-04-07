import java.util.Scanner;

public class Exercise21R_SWITCH_CASE {
    public static void main(String[] args) {
//        EXERCISE 21R
//        Given the name of a month (‘January’, ‘February’, etc.),
//        indicate in which season(s) of the year we could be.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of a month: ");
        String month = scanner.nextLine().toLowerCase();

        switch (month) {
            case "december":
            case "january":
            case "february":
                System.out.println("⛄ We are in winter.");
                break;

            case "march":
            case "april":
            case "may":
                System.out.println("🌸 We are in spring.");
                break;

            case "june":
            case "july":
            case "august":
                System.out.println("☀️ We are in summer.");
                break;

            case "september":
            case "october":
            case "november":
                System.out.println("🍂 We are in autumn.");
                break;

            default:
                System.out.println("❌ Error: Unknown month.");
        }
    }
}
