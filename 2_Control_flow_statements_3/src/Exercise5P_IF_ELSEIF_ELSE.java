import java.util.Scanner;

public class Exercise5P_IF_ELSEIF_ELSE {
    public static void main(String[] args) {
//        EXERCISE 5P
//        The young journalist John has to report on a tennis
//        match, but he does not know the rules of the sport. In particular,
//        he has not managed to learn how to tell if a set is over, and who won it.
//        A tennis match is divided into sets. To win a set, a player must
//        win 6 games, but must also have won at least two more games than his or her
//        opponent. If the set is tied at 5 games, the winner is the first to
//        reach 7 games. If the set is tied at 6 games, the set is decided in a final
//        game, in which case the final score is 7-6. Knowing that player A has
//        won m games, and player B, n games, the journalist would like to know:
//
//       if A won the set, or.
//       if B won the set, or
//       if the set is not yet over, or
//       if the result is invalid (e.g. 8-6 or 7-3).
//        Develop a program that solves John's problem, for example,
//        by running as follows:
//        Games won by A: 4
//        Games won by B: 5 Not finished
//        Games won by A: 5
//        Games won by B: 7
//        Games won by A: 5
//        Games won by B: 6 Not finished yet
//        Games won by A: 3
//        Games won by B: 7 Invalid
//        Games won by A: 6
//        Games won by B: 4 Won by A


        Scanner scanner = new Scanner(System.in);

        System.out.print("Games won by Player A: ");
        int a = scanner.nextInt();

        System.out.print("Games won by Player B: ");
        int b = scanner.nextInt();

        if (a < 0 || b < 0) {
            System.out.println("❌ Invalid: negative score.");
        } else if (a >= 7 || b >= 7) {
            System.out.println("❌ Invalid: no player can reach more than 7 games.");
        } else if ((a == 7 && b >= 5 && b <= 6) || (a == 6 && b <= 4)) {
            System.out.println("✅ Set won by Player A");
        } else if ((b == 7 && a >= 5 && a <= 6) || (b == 6 && a <= 4)) {
            System.out.println("✅ Set won by Player B");
        } else if ((a == 7 || b == 7) || Math.abs(a - b) >= 2 && (a == 6 || b == 6)) {
            // These cases are covered already; anything else is invalid
            System.out.println("❌ Invalid score.");
        } else {
            System.out.println("⏳ Set not finished yet.");
        }

    }
}
