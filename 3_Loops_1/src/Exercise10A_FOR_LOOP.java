import java.util.Scanner;

public class Exercise10A_FOR_LOOP {
    public static void main(String[] args) {
//        EXERCISE 10A
//        Perform exercise 1 but using a single System.out.println outside the
//        loop to display the requested result, so that it is constructed
//        in a String.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        char letter = scanner.next().charAt(0);

        System.out.println("Enter a number of reps: ");
        int reps = scanner.nextInt();

        String result = "";

        for (int i = 0; i < reps; i++) {
            result += letter;
        }

        System.out.println(result); //Only one println
    }
}
