import java.util.Scanner;

public class Exercise11A_IF_ELSEIF_ELSE {
    public static void main(String[] args) {

//        EXERCISE 11A
//        Thomas and Kate think they are in love, but they will only know if
//        they both pick a flower.
//        (foolproof method). If one of the flowers has an odd number of
//        petals and the other flower has an even number of petals Thomas
//        & Sarah will be in love otherwise not.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of petals on Thomas's flower: ");
        int petalsThomas = scanner.nextInt();

        System.out.print("Enter the number of petals on Kate's flower: ");
        int petalsKate = scanner.nextInt();

        boolean thomasOdd = petalsThomas % 2 != 0;
        boolean kateOdd = petalsKate % 2 != 0;

        if (thomasOdd != kateOdd) {
            System.out.println("They are in love 💕");
        } else {
            System.out.println("They are not in love 💔");
        }


    }
}
