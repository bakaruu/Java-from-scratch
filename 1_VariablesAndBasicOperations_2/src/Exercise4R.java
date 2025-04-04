import java.util.Scanner;

public class Exercise4R {
    public static void main(String[] args) {
//        EXERCISE 4R
//        Develop a program that allows you to enter the number of matches
//        won, lost and drawn by a team in the league tournament, showing its
//        total score, taking into account that for each match won you will
//        get 3 points, drawn 1 point and lost 0 points.

        Scanner scanner = new Scanner(System.in);
        int won = 3;
        int draw = 1;
        int lost = 0;


        System.out.println("Enter matches won: ");
        int matchesWon = scanner.nextInt();
        System.out.println("Enter matches lost: ");
        int matchesLost = scanner.nextInt();
        System.out.println("Enter matches drawn: ");
        int matchesDrawn = scanner.nextInt();

        //If we want to count all the matches played we need to do it properly.
        //but this is enough
        int totalPoints = matchesWon * won + matchesDrawn;

        System.out.println("Total points: " + totalPoints);

    }
}
