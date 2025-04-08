import java.util.Scanner;

public class Exercise13A_FOR_LOOP {
    public static void main(String[] args) {
//        EXERCISE 13A
//        Write a program that reads the marks of N students and shows us the number
//        of failures, sufficient, good, good, good and outstanding according
//        to the following classification.
//
//        Numerical     grade Grade
//        0<=X<5        FAIL
//        5<=X<6        PASS
//        6<=X<7        GOOD
//        7<=X<8.5      GOOD
//        8.5<=X<=10    OUTSTANDING
//        X<0           ERROR


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        int fail = 0;
        int pass = 0;
        int good = 0;
        int veryGood = 0;
        int outstanding = 0;
        int errors = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter grade for student " + i + ": ");
            double grade = scanner.nextDouble();

            if (grade < 0 || grade > 10) {
                System.out.println("Invalid grade.");
                errors++;
            } else if (grade < 5) {
                fail++;
            } else if (grade < 6) {
                pass++;
            } else if (grade < 7) {
                good++;
            } else if (grade < 8.5) {
                veryGood++;
            } else {
                outstanding++;
            }
        }

        System.out.println("\nGrade summary:");
        System.out.println("Fail: " + fail);
        System.out.println("Pass: " + pass);
        System.out.println("Good: " + good);
        System.out.println("Very Good: " + veryGood);
        System.out.println("Outstanding: " + outstanding);
        System.out.println("Invalid entries: " + errors);

    }
}
