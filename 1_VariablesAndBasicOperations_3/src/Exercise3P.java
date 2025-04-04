import java.util.Scanner;

public class Exercise3P {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Formula a) (1 + (x^2 / y)) / (x^3 / (1 + y))
        System.out.println("Enter x and y for formula (a):");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double topA = 1 + (Math.pow(x, 2) / y);
        double bottomA = Math.pow(x, 3) / (1 + y);
        double resultA = topA / bottomA;

        System.out.printf("Result of formula (a): %.4f\n", resultA);

        // Formula b) (1 + (1/3) * sin(alpha) - (1/7) * cos(alpha)) / (2 * h)
        System.out.println("\nEnter angle (in degrees) and h for formula (b):");
        double angle = input.nextDouble();
        double h = input.nextDouble();

        double angleRad = Math.toRadians(angle);

        double topB = 1 + (1.0 / 3) * Math.sin(angleRad) - (1.0 / 7) * Math.cos(angleRad);
        double bottomB = 2 * h;
        double resultB = topB / bottomB;

        System.out.printf("Result of formula (b): %.4f\n", resultB);

        // Formula c) sqrt(1 + ( (e^x / x^2) ^ 2 ))
        System.out.println("\nEnter a value for x (formula c):");
        double value = input.nextDouble();

        double partC = Math.exp(value) / Math.pow(value, 2);
        double resultC = Math.sqrt(1 + Math.pow(partC, 2));

        System.out.printf("Result of formula (c): %.4f\n", resultC);

        input.close();
    }
}
