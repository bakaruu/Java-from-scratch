import java.util.Scanner;

public class Exercise21A_SWITCH_CASE {
    public static void main(String[] args) {
//        EJERCICIO 21A
//        Partiendo del programa de los helados vamos a hacer una
//        versión diferente en la cual se muestran las posibles opciones
//        de helados y el usuario elegirá cual quiere.
//
//        1. Helado de agua 60 céntimos.
//        2. Helado de crema 1 euro.
//        3. Helado con toppings 1,6 euros.
//        4. Helado con nutella 1,8 euros.
//        5. Dos bolas de helado en barquillo 2 euros.
//        6. Mini tarta helada 2,5 euros.
//        Si el usuario ha elegido una opción correcta, el programa
//        pide que introduzca la cantidad de dinero que tiene el usuario.
//         El programa sirve el helado mostrando un mensaje:
//
//         If, for example, the user enters 2 euros for an ice cream,
//           the program responds with ‘Your change is: 1€’.
//         If the money is exact, it will reply with ‘Have a nice day’.
//         If you don't have enough money ‘Sorry, we don't trust anyone’.
//           Try to find the clearest and most efficient solution to this
//           problem by separating input, process and output.

        Scanner scanner = new Scanner(System.in);

        // 🧊 INPUT: menu and user selection
        System.out.println("🍦 Welcome to the Ice Cream Shop! Please choose an option:");
        System.out.println("1. Water ice cream (0.60€)");
        System.out.println("2. Cream ice cream (1.00€)");
        System.out.println("3. Ice cream with toppings (1.60€)");
        System.out.println("4. Ice cream with nutella (1.80€)");
        System.out.println("5. Two scoops on wafer (2.00€)");
        System.out.println("6. Mini ice cream cake (2.50€)");

        System.out.print("Enter your choice (1–6): ");
        int choice = scanner.nextInt();

        double price = 0.0;
        boolean validOption = true;

        // 🔁 PROCESSING: determine price based on choice
        switch (choice) {
            case 1:
                price = 0.60;
                break;
            case 2:
                price = 1.00;
                break;
            case 3:
                price = 1.60;
                break;
            case 4:
                price = 1.80;
                break;
            case 5:
                price = 2.00;
                break;
            case 6:
                price = 2.50;
                break;
            default:
                validOption = false;
                System.out.println("❌ Invalid option. Please restart the program.");
                break;
        }

        // 💬 OUTPUT
        if (validOption) {
            System.out.print("Insert your money (€): ");
            double money = scanner.nextDouble();

            if (money > price) {
                double change = money - price;
                System.out.printf("✅ Your change is: %.2f€\n", change);
            } else if (money == price) {
                System.out.println("✅ Have a nice day!");
            } else {
                System.out.println("❌ Sorry, we don't trust anyone. Not enough money.");
            }
        }

    }
}
