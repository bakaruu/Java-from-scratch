import java.util.Scanner;

public class Exercise1R {
    public static void main(String[] args) {
//        EXERCISE 1R
//        Develop an application to convert an amount from euros to dollars
//        and pounds (1 euro=1.15 dollars and 1 euro= 0.89 pounds approximately).

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount in euros: ");
        double euros = scanner.nextDouble();

        double dollars = euros * 1.15;
        double pounds = euros * 0.89;

        System.out.printf("%.2f euros is %.2f dollars\n",  euros, dollars);
        System.out.printf("%.2f euros is %.2f pounds\n",  euros, pounds);






    }
}
