public class Exercise2A2_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 2A
//        Develop a program that starts with an array of integers that indicates
//        the number of goals scored by each team in the league and another String
//        array where each position is the name of the team that has scored the goals.

        int[] points = {2, 5, 8, 9, 1};
        String[] teams = {"Real Madrid", "F.C. Barcelona", "Granada", "At. Madrid", "Sevilla"};


        for (int i = 0; i < teams.length; i++) {
            System.out.println(teams[i] + " " + points[i]);
        }

    }
}
