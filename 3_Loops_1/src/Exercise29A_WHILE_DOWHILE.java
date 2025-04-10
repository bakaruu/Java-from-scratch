import java.util.Random;

public class Exercise29A_WHILE_DOWHILE {
    public static void main(String[] args) {
//        EXERCISE 29A
//        Write a program that generates random numbers between 1 and 100.
//        Only multiples of 3 and 5 will be added together until 1000 is
//        exceeded. Show how the sum evolves each time a number is generated.

        Random random = new Random();
        int sum = 0;

        while (sum < 1000) {
            int num = random.nextInt(100) + 1;
            System.out.println(num);
            if (num % 3 == 0 || num % 5 == 0) {
                sum += num;
            }
            System.out.println("Sum: " + sum);
        }

        System.out.println("Final sum: " + sum);
    }
}
