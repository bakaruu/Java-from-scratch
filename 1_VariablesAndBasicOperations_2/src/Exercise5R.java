import java.util.Scanner;

public class Exercise5R {
    public static void main(String[] args) {
//        EXERCISE 5R
//        The final mark for each student is calculated according to the
//        following criteria: the practical part is worth 10%; the problem
//        part is worth 50% and the theoretical part 40%. Make a program will
//        read the name of a student and his three marks and will show
//        Final mark for [NAME] is [FINAL MARK].


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name: ");
        String name = scanner.next();

        System.out.println("Enter the practical marks: ");
        int practicalPart = scanner.nextInt();

        System.out.println("Enter the theoretical marks: ");
        int theoreticalPart = scanner.nextInt();

        System.out.println("Enter the problem marks: ");
        int problemPart = scanner.nextInt();

        double totalMarks = practicalPart * 0.10 +
                problemPart * 0.50 +
                theoreticalPart * 0.40;

        System.out.println("Final mark for " + name + " is " + totalMarks);

    }
}
