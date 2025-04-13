import java.util.Scanner;

public class Exercise3R_LOOPS {
    public static void main(String[] args) {
//        EXERCISE 3R
//        Ask the user for an integer greater than 0 and the sequence
//        50 100 50 100 50 100 50 100 of length the number chosen by the user.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of reps: ");
        int number = scanner.nextInt();
        int a = 50;
        int b = 100;

        if(number>0) {
            for (int i = 0; i < number; i++) {
                System.out.print(a + " " + b + " ");
            }
        }else {
            System.out.println("Enter a number greater than 0.");
        }
    }
}
