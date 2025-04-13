import java.util.Random;
import java.util.Scanner;

public class Exercise13P_LOOPS {
    public static void main(String[] args) {
//        EXERCISE 13P
//        Create a program that generates a completely random arithmetic operation of
//                +, -, * or / with two random operands between 1 and 1000. The aim is
//        that the user performs the operation and the program checks whether or not it
//        is correct. Perform the following versions of the game.
//                The starting player is chosen randomly each time the game is played.
//        1) The user is offered operations until he/she fails, showing him/her his/her
//
//        record at the end.
//        2) VS game where player 1 responds first until he/she fails. Then player 2
//        goes until he/she fails. Whoever has the longest winning streak is the winner.
//        3) The above in sudden death mode, i.e. the first player to fail the proposed
//        operation loses.
//        4) The previous one, but with rebound, which means that when a player fails,
//        the opposite player is offered the same operation and if he succeeds, he has
//        already won.



        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Arithmetic Game – Choose a version:");
        System.out.println("1) Single player until fail (record)");
        System.out.println("2) Two-player, each tries until fail (who has bigger streak)");
        System.out.println("3) Two-player, sudden death (first fail loses)");
        System.out.println("4) Two-player, rebound mode");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // ------------------------------------------------
                // 1) SINGLE-PLAYER UNTIL FAIL
                // ------------------------------------------------
                System.out.println("\n--- Single-player Mode ---");
                int streak = 0;
                while (true) {
                    // Generate random operands and operator
                    int x = random.nextInt(1000) + 1;
                    int y = random.nextInt(1000) + 1;
                    int op = random.nextInt(4);
                    int correct = 0;
                    String opSymbol = "";

                    switch (op) {
                        case 0:
                            opSymbol = "+";
                            correct = x + y;
                            break;
                        case 1:
                            opSymbol = "-";
                            correct = x - y;
                            break;
                        case 2:
                            opSymbol = "*";
                            correct = x * y;
                            break;
                        case 3:
                            opSymbol = "/";
                            // integer division
                            correct = x / y;
                            break;
                    }

                    System.out.println("Solve: " + x + " " + opSymbol + " " + y);
                    int userAnswer = scanner.nextInt();

                    if (userAnswer == correct) {
                        streak++;
                        System.out.println("Correct! Current streak: " + streak);
                    } else {
                        System.out.println("Wrong answer! The correct result was: " + correct);
                        break;
                    }
                }
                System.out.println("Game over! Your final record is above.");
                break;

            case 2:
                // ------------------------------------------------
                // 2) TWO-PLAYER NORMAL MODE
                // ------------------------------------------------
                System.out.println("\n--- Two-Player Normal Mode ---");
                // Random who starts
                int currentPlayer = random.nextBoolean() ? 1 : 2;
                System.out.println("Randomly chosen: Player " + currentPlayer + " starts.");

                int streakP1 = 0;
                int streakP2 = 0;
                boolean player1Done = false;
                boolean player2Done = false;

                // Player 1 tries until fail
                while (!player1Done) {
                    int x = random.nextInt(1000) + 1;
                    int y = random.nextInt(1000) + 1;
                    int op = random.nextInt(4);
                    int correct = 0;
                    String opSymbol = "";

                    switch (op) {
                        case 0:
                            opSymbol = "+";
                            correct = x + y;
                            break;
                        case 1:
                            opSymbol = "-";
                            correct = x - y;
                            break;
                        case 2:
                            opSymbol = "*";
                            correct = x * y;
                            break;
                        case 3:
                            opSymbol = "/";
                            correct = x / y;
                            break;
                    }

                    System.out.println("Player 1, solve: " + x + " " + opSymbol + " " + y);
                    int answer = scanner.nextInt();
                    if (answer == correct) {
                        streakP1++;
                        System.out.println("Correct! Streak P1: " + streakP1);
                    } else {
                        System.out.println("Player 1 failed! Correct result: " + correct);
                        player1Done = true;
                    }
                }

                // Player 2 tries until fail
                while (!player2Done) {
                    int x = random.nextInt(1000) + 1;
                    int y = random.nextInt(1000) + 1;
                    int op = random.nextInt(4);
                    int correct = 0;
                    String opSymbol = "";

                    switch (op) {
                        case 0:
                            opSymbol = "+";
                            correct = x + y;
                            break;
                        case 1:
                            opSymbol = "-";
                            correct = x - y;
                            break;
                        case 2:
                            opSymbol = "*";
                            correct = x * y;
                            break;
                        case 3:
                            opSymbol = "/";
                            correct = x / y;
                            break;
                    }

                    System.out.println("Player 2, solve: " + x + " " + opSymbol + " " + y);
                    int answer = scanner.nextInt();
                    if (answer == correct) {
                        streakP2++;
                        System.out.println("Correct! Streak P2: " + streakP2);
                    } else {
                        System.out.println("Player 2 failed! Correct result: " + correct);
                        player2Done = true;
                    }
                }

                System.out.println("\n--- Final Scores ---");
                System.out.println("Player 1: " + streakP1);
                System.out.println("Player 2: " + streakP2);

                if (streakP1 > streakP2) {
                    System.out.println("Player 1 wins!");
                } else if (streakP2 > streakP1) {
                    System.out.println("Player 2 wins!");
                } else {
                    System.out.println("It's a tie!");
                }
                break;

            case 3:
                // ------------------------------------------------
                // 3) TWO-PLAYER SUDDEN DEATH
                // ------------------------------------------------
                System.out.println("\n--- Two-Player Sudden Death Mode ---");
                int currentSudden = random.nextBoolean() ? 1 : 2;
                System.out.println("Randomly chosen: Player " + currentSudden + " starts.");

                while (true) {
                    int x = random.nextInt(1000) + 1;
                    int y = random.nextInt(1000) + 1;
                    int op = random.nextInt(4);
                    int correct = 0;
                    String opSymbol = "";

                    switch (op) {
                        case 0:
                            opSymbol = "+";
                            correct = x + y;
                            break;
                        case 1:
                            opSymbol = "-";
                            correct = x - y;
                            break;
                        case 2:
                            opSymbol = "*";
                            correct = x * y;
                            break;
                        case 3:
                            opSymbol = "/";
                            correct = x / y;
                            break;
                    }

                    System.out.println("Player " + currentSudden + ", solve: " + x + " " + opSymbol + " " + y);
                    int answer = scanner.nextInt();
                    if (answer == correct) {
                        System.out.println("Correct!");
                        // Switch player
                        currentSudden = (currentSudden == 1) ? 2 : 1;
                    } else {
                        System.out.println("Wrong! Correct answer was: " + correct);
                        System.out.println("Player " + currentSudden + " loses => other player wins!");
                        break;
                    }
                }
                break;

            case 4:
                // ------------------------------------------------
                // 4) TWO-PLAYER REBOUND
                // ------------------------------------------------
                System.out.println("\n--- Two-Player Rebound Mode ---");
                int currentRebound = random.nextBoolean() ? 1 : 2;
                System.out.println("Randomly chosen: Player " + currentRebound + " starts.");

                while (true) {
                    int x = random.nextInt(1000) + 1;
                    int y = random.nextInt(1000) + 1;
                    int op = random.nextInt(4);
                    int correct = 0;
                    String opSymbol = "";

                    switch (op) {
                        case 0:
                            opSymbol = "+";
                            correct = x + y;
                            break;
                        case 1:
                            opSymbol = "-";
                            correct = x - y;
                            break;
                        case 2:
                            opSymbol = "*";
                            correct = x * y;
                            break;
                        case 3:
                            opSymbol = "/";
                            correct = x / y;
                            break;
                    }

                    System.out.println("Player " + currentRebound + ", solve: " + x + " " + opSymbol + " " + y);
                    int answer = scanner.nextInt();

                    if (answer == correct) {
                        System.out.println("Correct!");
                        // next question for the other player
                        currentRebound = (currentRebound == 1) ? 2 : 1;
                    } else {
                        System.out.println("Player " + currentRebound + " fails!");
                        // Rebound attempt
                        int otherPlayer = (currentRebound == 1) ? 2 : 1;
                        System.out.println("Player " + otherPlayer + ", you can rebound. Same question: " + x + " " + opSymbol + " " + y);
                        int reboundAnswer = scanner.nextInt();

                        if (reboundAnswer == correct) {
                            System.out.println("Player " + otherPlayer + " WINS immediately on rebound!");
                            break;
                        } else {
                            System.out.println("Rebound also failed! Correct was: " + correct);
                            // continue with new question, same turn order
                        }
                    }
                }
                break;

            default:
                System.out.println("Invalid choice. Exiting.");
        }

        System.out.println("\nProgram ended.");
    }
}
