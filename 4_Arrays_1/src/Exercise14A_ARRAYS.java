import java.util.Random;
import java.util.Scanner;

public class Exercise14A_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 14A
//        Given an array at the beginning a random position is
//        chosen and displayed together with the value contained
//        in that position. The program allows you to move left
//        and right along the array by asking the user.
//        Each time a move is made it shows the position
//        and the contents. The program terminates when we exit
//        to the right or left.

        Scanner scanner = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6,7};


        int pos = (int) (Math.random() * arr.length);
//        or
//        Random random = new Random();
//        int pos = random.nextInt(arr.length);

        System.out.println("Starting at position: " + pos + " with value: " + arr[pos]);

        while (pos >= 0 && pos < arr.length) {
            System.out.print("Move (L for left / R for right): ");
            char move = scanner.next().toUpperCase().charAt(0);

            if (move == 'L') {
                pos--;
            } else if (move == 'R') {
                pos++;
            } else {
                System.out.println("Invalid option.");
                continue;
            }

            if (pos >= 0 && pos < arr.length) {
                System.out.println("Now at position: " + pos + " with value: " + arr[pos]);
            } else {
                System.out.println("Exited the array. Program finished.");
            }
        }


    }
}
