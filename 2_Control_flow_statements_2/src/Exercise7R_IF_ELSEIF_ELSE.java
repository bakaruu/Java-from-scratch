import java.util.Scanner;

public class Exercise7R_IF_ELSEIF_ELSE {
    public static void main(String[] args) {

//        EXERCISE 7R
//        Write a program for a company that has an all-ages arcade and
//        wants to automatically calculate the price it should charge its
//        customers to enter. The program should ask the user for the age of
//        the customer and display the price of entry, showing on the screen
//        a message with the final price.
//        a message with the final price. If the customer is under 4 years
//        old, he/she can enter free of charge, if he/she is between 4
//        to 18 years old must pay 5€ and if over 18 years old, 10€. It is
//        necessary to check beforehand if the
//        user enters a negative age and an error message is displayed if
//        this is the case.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Error: Age cannot be negative.");
        } else if (age < 4) {
            System.out.println("Entry is free!");
        } else if (age <= 18) {
            System.out.println("Entry price: 5€");
        } else {
            System.out.println("Entry price: 10€");
        }
    }
}
