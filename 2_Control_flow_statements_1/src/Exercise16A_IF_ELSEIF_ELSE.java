import java.util.Scanner;

public class Exercise16A_IF_ELSEIF_ELSE {
    public static void main(String[] args) {
//        EXERCISE 16A
//        We have an ice-cream parlour management system that we have to program,
//        where the user enters the money he has and the system informs
//        him of the ice cream he can afford. We have of the following ice creams:
//      􀁸 Water ice cream 60 cents.
//      􀁸 Cream ice cream 1 euro.
//      􀁸 Ice cream with toppings 1,6 euros.
//      􀁸 Ice cream with nutella 1,8 euros.
//      􀁸 Two scoops of ice cream on a wafer 2 euros.
//      􀁸 Mini ice cream cake 2,5 euros.
//
//        Make different versions of the programme:
//      􀀹 Show the most expensive ice cream you can afford (maybe none of them).
//      􀀹 Show the cheapest ice cream you can afford (maybe none of them).
//      􀀹 Show which of the available ice creams you can afford (maybe none of them)

        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();

        if (money >= 0.6) {
            System.out.println("You can afford:");
            System.out.println("- Water ice cream (0.60€)");


            if (money >= 1.0) {
                System.out.println("- Cream ice cream (1.00€)");
            }
            if (money >= 1.6) {
                System.out.println("- Ice cream with toppings (1.60€)");
            }
            if (money >= 1.8) {
                System.out.println("- Ice cream with Nutella (1.80€)");
            }
            if (money >= 2.0) {
                System.out.println("- Two scoops of ice cream on a wafer (2.00€)");
            }
            if (money >= 2.5) {
                System.out.println("- Mini ice cream cake (2.50€)");
            }

        } else {
            System.out.println("Sorry, you can't afford any ice cream.");
        }

    }
}
