import java.util.Scanner;

public class Exercise4R_LOOPS {
    public static void main(String[] args) {
//        EXERCISE 5R
//        Same as above, but with the sequence:
//        50 50 100 50 50 100 50 50 100 50 50 100 50 50 100


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of reps: ");
        int number = scanner.nextInt();
        int a = 50;
        int b = 100;

        if (number > 0) {
            for (int i = 0; i < number; i++) {
                System.out.print(a + " " + a + " " + b + " ");
            }
        } else {
            System.out.println("Enter a number greater than 0.");
        }

    }
}
