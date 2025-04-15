import java.util.Scanner;

public class Exercise15A_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 15A
//        Repeat the previous exercise, but allowing to move circularly.
//        That means that if I am at position 0 and it moves to the left
//        it appears at the end and if it is at the end and it moves to
//        the right it appears at 0. The program ends when the user wants
//        it to.

        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7};


        int pos = (int) (Math.random() * arr.length);
//        or
//        Random random = new Random();
//        int pos = random.nextInt(arr.length);

        System.out.println("Starting at position: " + pos + " with value: " + arr[pos]);

        while (true) {
            System.out.print("Move (L for left / R for right / E to exit): ");
            char move = scanner.next().toUpperCase().charAt(0);

            if (move == 'L') {
                pos = (pos - 1 + arr.length) % arr.length;
            } else if (move == 'R') {
                pos = (pos + 1) % arr.length;
            } else if (move == 'E') {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option.");
                continue;
            }

            System.out.println("Now at position: " + pos + " with value: " + arr[pos]);
        }

    }
}
