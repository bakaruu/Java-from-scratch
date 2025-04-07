import java.util.Scanner;

public class Exercise9R_IF_ELSEIF_ELSE {
    public static void main(String[] args) {
//        EXERCISE 9R
//        You know the salary and the years of seniority of a worker.
//        You are asked to create a program
//        that reads the input data and shows his new updated salary according
//        to the following criteria:
//        It is necessary to control that neither the salary nor the seniority
//        are negative showing an error message in such a case.
//        error message in such a case.

//         If your salary is between 500 and 700 and your seniority is between 4 and
//        10 years, give you a 7% increase.
//         If the salary is between 500 and 700 or the seniority is between 4 and 10
//        years, give a 3% increase.
//         Otherwise give 1%.

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter current salary (€): ");
        double salary = scanner.nextDouble();

        System.out.print("Enter years of seniority: ");
        int seniority = scanner.nextInt();


        if (salary < 0 || seniority < 0) {
            System.out.println("Error: Salary and seniority cannot be negative.");
        } else {
            double newSalary;


            if (salary >= 500 && salary <= 700 && seniority >= 4 && seniority <= 10) {
                newSalary = salary * 1.07;
                System.out.println("7% increase applied.");
            } else if (salary >= 500 && salary <= 700 || (seniority >= 4 && seniority <= 10)) {
                newSalary = salary * 1.03;
                System.out.println("3% increase applied.");
            } else {
                newSalary = salary * 1.01;
                System.out.println("1% increase applied.");
            }

            System.out.printf("💰 Updated salary: %.2f€\n", newSalary);
        }


    }
}
