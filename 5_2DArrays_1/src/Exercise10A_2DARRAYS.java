import java.util.Scanner;

public class Exercise10A_2DARRAYS {
    public static void main(String[] args) {
//        EXERCISE 10A
//        A farm has N cows. The farmer draws up a table of dimension 7xN
//        where he writes down the litres of milk per day that each cow gives
//        in a week. Assuming that this table is translated into a Java matrix.
//        Each cow has a name. Programs must be developed for the following:
//
//        a) The total milk production of the whole farm in that week.
//        b) Cow and day of the week that produced the most milk.
//        c) Cow that produced the least milk on Wednesday.
//        d) Total production of a particular cow for the whole week.
//        e) Cow that produced the most milk on Friday.
//        f) Litres produced by each cow.
//        g) Litres produced each day of the week.
//        h) Day of the week that produced the most milk.

        Scanner scanner = new Scanner(System.in);

        int[][] board = {
                {41, 22, 51, 8, 9},
                {23, 7, 39, 43, 2},
                {9, 21, 30, 41, 6},
                {10, 7, 50, 21, 32},
                {12, 32, 42, 32, 7},
                {11, 14, 31, 35, 12},
                {5, 9, 32, 55, 43}
        };

        String[] cows = {"Filomena", "Ruperta", "Colorada", "Chispa", "Campanera"};
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // SECTION A) TOTAL PRODUCTION OF THE FARM
        int total_farm = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                total_farm += board[i][j];
            }
        }
        System.out.println("Total liters produced during the week: " + total_farm);

        // SECTION B) DAY AND COW WITH THE HIGHEST PRODUCTION
        int max = board[0][0];
        int max_day_index = 0;
        int max_cow_index = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] > max) {
                    max = board[i][j];
                    max_day_index = i;
                    max_cow_index = j;
                }
            }
        }
        System.out.println("Most productive day and cow:");
        System.out.println("Cow --> " + cows[max_cow_index]);
        System.out.println("Day --> " + days[max_day_index]);

        // SECTION C) COW THAT PRODUCED THE LEAST ON WEDNESDAY
        int least_productive_cow = 0;
        int lowest_value = board[2][0]; // Wednesday is index 2
        for (int j = 0; j < board[2].length; j++) {
            if (board[2][j] < lowest_value) {
                least_productive_cow = j;
                lowest_value = board[2][j];
            }
        }
        System.out.println("Least productive cow on Wednesday: " + cows[least_productive_cow]);

        // SECTION D) TOTAL PRODUCTION OF A COW SEARCHED BY NAME
        int k, cow_position;
        String cow_name;
        System.out.print("Enter the name of the cow you are looking for: ");
        cow_name = scanner.next();
        k = 0;
        cow_position = -1;
        while (k < cows.length && cow_position == -1) {
            if (cow_name.equalsIgnoreCase(cows[k])) {
                cow_position = k;
            }
            k++;
        }

        if (cow_position == -1) {
            System.out.println("That cow does not exist.");
        } else {
            int cow_total = 0;
            for (int i = 0; i < board.length; i++) {
                cow_total += board[i][cow_position];
            }
            System.out.println("Cow " + cow_name + " produced " + cow_total + " liters in total.");
        }

        // SECTION G) TOTAL PRODUCTION PER DAY
        int[] daily_totals = new int[days.length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                daily_totals[i] += board[i][j];
            }
        }

        for (int i = 0; i < daily_totals.length; i++) {
            System.out.println("On " + days[i] + ", total production was " + daily_totals[i] + " liters.");
        }

        // SECTION H) DAY WITH THE HIGHEST TOTAL PRODUCTION
        int most_productive_day = 0;
        int highest_total = daily_totals[0];
        for (int i = 0; i < daily_totals.length; i++) {
            if (daily_totals[i] > highest_total) {
                most_productive_day = i;
                highest_total = daily_totals[i];
            }
        }
        System.out.println("The most productive day of the week was: " + days[most_productive_day]);

        // SECTION F) TOTAL PRODUCTION PER COW
        int[] cow_totals = new int[cows.length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                cow_totals[j] += board[i][j];
            }
        }

        for (int i = 0; i < cow_totals.length; i++) {
            System.out.println(cows[i] + " produced a total of " + cow_totals[i] + " liters this week.");
        }


    }
}
