import java.util.Scanner;

public class Exercise1P_LOOPS {
    public static void main(String[] args) {
//        EXERCISE 1P
//        A number is perfect if it is equal to the sum of all its positive
//        divisors not including the number itself. For example, the number
//    6 is perfect because it has divisors 1, 2, 3 and 6, but 6 is not counted
//        as a divisor to check if it is perfect. If we add 1 + 2 + 3 = 6.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if is perfect: ");
        int number = scanner.nextInt();
        int sum= 0;

        for (int i= 1; i<number; i++ ){
            if (number % i == 0) {
                sum+=i;
//                System.out.println(i);
            }
        }
        if(sum== number){
            System.out.printf("The number %d is perfect", number);
        }else{

            System.out.printf("The number %d is NOT perfect", number);
        }




    }
}