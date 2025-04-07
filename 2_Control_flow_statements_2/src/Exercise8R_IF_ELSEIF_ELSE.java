import java.util.Scanner;

public class Exercise8R_IF_ELSEIF_ELSE {
    public static void main(String[] args) {
//        EXERCISE 8R
//        Given two football teams that play each other in a knockout
//        format with home and away matches,calculate the number of
//        goals scored in each match, bearing in mind that in the
//        event of a draw, away goals are worth twice as much.
//        away goals are worth twice as much in the event of a draw.

        Scanner scanner = new Scanner(System.in);

        System.out.println("FIRST LEG (Team A at home)");
        System.out.print("Goals by Team A: ");
        int goalsA_home = scanner.nextInt();
        System.out.print("Goals by Team B (away): ");
        int goalsB_away = scanner.nextInt();

        System.out.println("SECOND LEG (Team B at home)");
        System.out.print("Goals by Team B: ");
        int goalsB_home = scanner.nextInt();
        System.out.print("Goals by Team A (away): ");
        int goalsA_away = scanner.nextInt();

        // Total goals
        int totalA = goalsA_home + goalsA_away;
        int totalB = goalsB_home + goalsB_away;

        if (totalA > totalB) {
            System.out.println("✅ Team A wins the knockout round.");
        } else if (totalB > totalA) {
            System.out.println("✅ Team B wins the knockout round.");
        } else {
            // Apply away goals rule
            int awayGoalsA = goalsA_away * 2;
            int awayGoalsB = goalsB_away * 2;

            if (awayGoalsA > awayGoalsB) {
                System.out.println("⚽ Team A wins by away goals rule.");
            } else if (awayGoalsB > awayGoalsA) {
                System.out.println("⚽ Team B wins by away goals rule.");
            } else {
                System.out.println("🤝 The match is still tied. Extra time may be needed.");
            }
        }



    }
}
