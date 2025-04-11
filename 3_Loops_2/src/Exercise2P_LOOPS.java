import java.util.Scanner;

public class Exercise2P_LOOPS {
    public static void main(String[] args) {
//        EXERCISE 2P
//        We want to stack a certain number of tin cans in the shape of a pyramid so
//        that at the top there is only one can, in the row above there will be two cans,
//        in the row below there will be 3 cans and so on. Make a program that reads
//        the number of cans we have and says whether it is possible to stack them in
//        this way or not.
//        For example, 6 cans would be stackable (1+2+3), 10 cans would be
//        stackable (1+2+3+4), 9 cans would not be possible.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of cans you have: ");
        int cans = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= cans; i++) {
            sum += i;
            if (sum == cans) {
                System.out.printf("%d cans would be stackable", cans);
                return;
            }
        }

        System.out.println("Not possible.");

//        Better version, avoids unnecessary iterations by stopping the loop
//        as soon as the sum surpasses the number of cans

//        int sum = 0;
//        int i = 1;
//
//        while (sum < cans) {
//            sum += i;
//            if (sum == cans) {
//                System.out.printf("%d cans would be stackable%n", cans);
//                return;
//            }
//            i++;
//        }
//
//        System.out.println("Not possible.");

    }
}
