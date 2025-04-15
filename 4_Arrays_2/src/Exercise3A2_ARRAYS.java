import java.util.Scanner;

public class Exercise3A2_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 3A
//        Starting from the following arrays that we can use as an example:
//        String[] questions = {
    //    "What is two plus two?",
    //    "Capital of Portugal?",
    //    "Java is a language of what type?",
    //    "Columbus discovered America in the year?"
//                                              };
//
        //String[] answers = {
        //    "four",
        //    "Lisbon",
        //    "semi interpreted",
        //    "1492"
//};
//
        //int[] points = {4, 2, 7, 9};

//        Develop a program that given these 3 arrays and allows us to play the game
//        to answer the questions. When we finish answering all the questions it will
//        show us the total score obtained and which questions we have got right and
//        which we have failed.

        String[] questions = {
                "What is two plus two?",
                "Capital of Portugal?",
                "Java is a language of what type?",
                "Columbus discovered America in the year?"
        };

        String[] answers = {
                "four",
                "Lisbon",
                "semi interpreted",
                "1492"
        };

        int[] points = {4, 2, 7, 9};


        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;

        System.out.println("QUIZ GAME\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct! +" + points[i] + " points\n");
                totalScore += points[i];
            } else {
                System.out.println("Incorrect. The correct answer was: " + answers[i] + "\n");
            }
        }

        System.out.println("GAME OVER");
        System.out.println("Your total score: " + totalScore + "\n");

        // Summary of each question
        System.out.println("Summary:");
        for (int i = 0; i < questions.length; i++) {
            System.out.println((i + 1) + ". " + questions[i]);
            System.out.println("   Correct answer: " + answers[i]);
        }
    }
}
