import java.util.Random;

public class Exercise30A_WHILE_DOWHILE {
    public static void main(String[] args) {
//        EXERCISE 30A
//        Same as the previous exercise, but until we reach exactly 1000,
//        where if we go over 1000 when adding, we must subtract the
//        number generated instead of adding it.

        Random random = new Random();
        int sum = 0;

        while (sum != 1000) {
            int num = random.nextInt(100) + 1;
            System.out.println("Generated: " + num);

            if (num % 3 == 0 || num % 5 == 0) {
                sum += num;

                if (sum > 1000) {
                    System.out.println("Over 1000! Reversing...");
                    sum -= num;
                } else {
                    System.out.println("Added. Sum: " + sum);
                }
            } else {
                System.out.println("Not a multiple of 3 or 5. Ignored.");
            }
        }

        System.out.println("Final sum: " + sum);
    }
}
