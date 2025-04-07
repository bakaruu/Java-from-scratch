import java.util.Scanner;

public class Exercise18R_IF_ELSEIF_ELSE {
    public static void main(String[] args) {
//        EXERCISE 18R
//        Construct a programme that allows the selection of persons who
//        satisfy, simultaneously, the following conditions:
// Aged less than 20 or more than 50.
// Unmarried.
// That they do not have a gross salary higher than 30,000 euros.
// That they are neither director nor deputy director of their company.
// They must be vaccinated against COVID-19.
//        The user enters all the necessary information by keyboard and the
//        program answers Yes or No. Choose carefully the type of variable
//        for each data and use only one if-else structure. Subsequently:
// Create another version where the program where shows the conditions that
//        have not been met.
// Create another version where the program stops asking for data as soon
//        as a condition fails.

        Scanner scanner = new Scanner(System.in);

        // Collect input
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Are you unmarried? (true/false): ");
        boolean unmarried = scanner.nextBoolean();

        System.out.print("Enter gross salary (€): ");
        double salary = scanner.nextDouble();

        System.out.print("Are you a director or deputy director? (true/false): ");
        boolean isDirectorOrDeputy = scanner.nextBoolean();

        System.out.print("Are you vaccinated against COVID-19? (true/false): ");
        boolean vaccinated = scanner.nextBoolean();

        if ((age < 20 || age > 50) &&
                unmarried &&
                salary <= 30000 &&
                !isDirectorOrDeputy &&
                vaccinated) {

            System.out.println("Selected: YES");
        } else {
            System.out.println("Selected: NO");
        }
    }
}
