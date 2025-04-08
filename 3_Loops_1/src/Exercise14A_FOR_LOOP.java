import java.util.Scanner;

public class Exercise14A_FOR_LOOP {
    public static void main(String[] args) {
//        EXERCISE 14A
//        On the basis of the previous exercise, make a programme that shows the
//        average of the students classified as failing on the one hand and the
//        average of the students classified as outstanding on the other.


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        double failSum = 0;
        int failCount = 0;

        double outstandingSum = 0;
        int outstandingCount = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter grade for student " + i + ": ");
            double grade = scanner.nextDouble();

            if (grade < 0 || grade > 10) {
                System.out.println("Invalid grade. Skipped.");
                continue;
            }

            if (grade < 5) {
                failSum += grade;
                failCount++;
            } else if (grade >= 8.5) {
                outstandingSum += grade;
                outstandingCount++;
            }
        }

        System.out.println();

        if (failCount > 0) {
            System.out.printf("📉 Average of failing students: %.2f\n", failSum / failCount);
        } else {
            System.out.println("📉 No failing students to calculate an average.");
        }

        if (outstandingCount > 0) {
            System.out.printf("🌟 Average of outstanding students: %.2f\n", outstandingSum / outstandingCount);
        } else {
            System.out.println("🌟 No outstanding students to calculate an average.");
        }
    }
}
