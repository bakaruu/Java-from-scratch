import java.util.Scanner;

public class Exercise2P {
    public static void main(String[] args) {
//        EXERCISE 2P
//        Write a program that reads the value of 3 electrical resistors and
//        tells us the equivalent resistance if we put them in series and if
//        we put them in parallel:

//        Series = R1 + R2 + R3
//
//        Parallel = compute 1 / (1/R1 + 1/R2 + 1/R3)

        Scanner scanner = new Scanner(System.in);

        // Read resistance values
        System.out.print("Enter resistance R1 (ohms): ");
        double R1 = scanner.nextDouble();

        System.out.print("Enter resistance R2 (ohms): ");
        double R2 = scanner.nextDouble();

        System.out.print("Enter resistance R3 (ohms): ");
        double R3 = scanner.nextDouble();

        // Calculate series equivalent
        double series = R1 + R2 + R3;

        // Calculate parallel equivalent
        double parallel = 1 / (1 / R1 + 1 / R2 + 1 / R3);

        // Print results
        System.out.printf("Equivalent resistance in series: %.2f ohms\n", series);
        System.out.printf("Equivalent resistance in parallel: %.2f ohms\n", parallel);

    }
}
