import java.util.Scanner;

public class Exercise10R_IF_ELSEIF_ELSE {
    public static void main(String[] args) {

//        EXERCISE 10R
//        Calculate the net payroll of some workers whose work is paid in hours.
//        The calculation is carried out as follows
//        The calculation is made as follows:
//         The first 35 hours at a flat rate of €10.
//         Hours after 35 hours are paid at 15.
//         The taxes to be deducted from the workers vary, depending on
//        whether the salary is less than 600 the salary is tax free
//        and if the opposite is the case a 20% tax will be charged.

        Scanner scanner = new Scanner(System.in);

        // Input: hours worked
        System.out.print("Enter hours worked: ");
        int hours = scanner.nextInt();

        double grossSalary;

        if (hours <= 35) {
            grossSalary = hours * 10;
        } else {
            int extraHours = hours - 35;
            grossSalary = (35 * 10) + (extraHours * 15);
        }

        double netSalary;

        if (grossSalary < 600) {
            netSalary = grossSalary;
            System.out.println("💰 Salary is tax-free.");
        } else {
            netSalary = grossSalary * 0.8;
            System.out.println("🧾 20% tax applied.");
        }

        // Output
        System.out.printf("Gross salary: %.2f€\n", grossSalary);
        System.out.printf("Net salary: %.2f€\n", netSalary);

    }
}
