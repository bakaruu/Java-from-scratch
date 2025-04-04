import java.util.Scanner;

public class Exercise6R {
    public static void main(String[] args) {
//        EXERCISE 6R
//        Imagine that you have just opened a new savings account
//        that offers you 4% interest per year. These savings earn
//        interest, which is not collected until the end of the year, and is
//        added to your final savings account balance. Write a program
//        that starts by reading the amount of money deposited in the savings
//        account, entered by the user. The program should then calculate
//        and display the amount of savings after the first, second and third year.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter initials savings: ");
        double savings = scanner.nextDouble();

        double firstYear = savings * 0.04 + savings;
        System.out.printf("First year savings: %.2f\n", firstYear);


        double secondYear = firstYear * 0.04 + firstYear;
        System.out.printf("Second year saving: %.2f\n",  secondYear);


        double thirdYear = secondYear * 0.04 + secondYear;
        System.out.printf("Third year savings: %.2f\n", thirdYear);



    }
}
