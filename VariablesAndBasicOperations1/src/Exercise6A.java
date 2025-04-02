import java.util.Scanner;

public class Exercise6A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        EXERCISE 6A
//        Develop an application that calculates a worker's gross pay,
//        net pay and tax deduction, based on base salary,
//        allowances and the state tax rate on his gross pay IRFP
//        (to be prompted by keyboard). The program will prompt the
//        user for the various data and display the results in a format
//        as close as possible to the following:
//
//        Basic salary: 1237.56 €.
//                Posting allowance: 146.95 €.
//                Academic position allowance: 97 €.
//                Payroll calculation.
//                Gross salary: 1481.51 €.
//                Personal income tax rate: 19%.
//        Personal income tax withholding: 281,48 €.
//                Net salary: 1200,03 €.



        System.out.println("Enter base salary (€): ");
        double baseSalary = scanner.nextDouble();

        System.out.println("Enter posting allowance (€): ");
        double postingAllowance = scanner.nextDouble();

        System.out.println("Enter academic position allowance (€): ");
        double academicAllowance = scanner.nextDouble();

        System.out.println("Enter income tax rate (IRPF) in %: ");
        double taxRate = scanner.nextDouble(); // example: 19 for 19%


        double grossSalary = baseSalary + postingAllowance + academicAllowance;
        double taxAmount = grossSalary * (taxRate / 100);
        double netSalary = grossSalary - taxAmount;



        System.out.printf("Basic salary: %.2f €.\n", baseSalary);
        System.out.printf("Posting allowance: %.2f €.\n", postingAllowance);
        System.out.printf("Academic position allowance: %.2f €.\n", academicAllowance);
        System.out.println("Payroll calculation.");
        System.out.printf("Gross salary: %.2f €.\n", grossSalary);
        System.out.printf("Personal income tax rate: %.0f%%.\n", taxRate);
        System.out.printf("Personal income tax withholding: %.2f €.\n", taxAmount);
        System.out.printf("Net salary: %.2f €.\n", netSalary);

    }
}
