import java.util.Scanner;

public class Exercise9A2_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 9A
//        Starting from the data of exercise 1, create a program that shows us the age
//        of a specific person that is requested by keyboard. In case of not being there,
//        it shows a message indicating this situation.

        Scanner scanner = new Scanner(System.in);

        String[] names = {"Juan", "Ana", "Marcos", "Pablo", "Laura"};
        int[] ages = {12, 21, 27, 14, 21};

        System.out.print("Enter a name: ");
        String name = scanner.next();

        boolean found = false;

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                System.out.println("Age of " + names[i] + ": " + ages[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Name not found.");
        }

    }
}
