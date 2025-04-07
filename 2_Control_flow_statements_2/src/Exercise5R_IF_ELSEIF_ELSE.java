import java.util.Scanner;

public class Exercise5R_IF_ELSEIF_ELSE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();


        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {

            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("✅ Two solutions: x1 = %.2f, x2 = %.2f\n", x1, x2);
        } else if (discriminant == 0) {

            double x = -b / (2 * a);
            System.out.printf("✅ One solution: x = %.2f\n", x);
        } else {

            System.out.println("❌ No real solutions (discriminant is negative).");
        }

    }
}
