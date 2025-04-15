public class Exercise6A2_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 6A
//        Develop a program that, given an array of 30 integers representing
//        the temperature of each day of any month of the year, does the following.
//        Taking into account that each day of the month a sport was practised
//        according to the criteria of the following table:
//        Sport
//        Temperature   (ºC)
//        Swimming      >30
//        Golf          15<T<=30
//        Tennis        5<T<=15
//        Skiing        -10<T<=5
//        Ladies        T<=-10
//        Show the name of the most popular sport in the month according
//        to this table and the temperatures.


        int[] temperatures = {
                32, 28, 10, 14, 3, -12, 22, 33, 9, 6,
                15, 20, 5, 0, -15, -5, 31, 29, 8, 12,
                35, 16, 11, -2, 2, 25, 19, -11, 7, 30
        };


        int swimming = 0;
        int golf = 0;
        int tennis = 0;
        int skiing = 0;
        int ladies = 0;

        for (int temp : temperatures) {
            if (temp > 30) {
                swimming++;
            } else if (temp > 15 && temp <= 30) {
                golf++;
            } else if (temp > 5 && temp <= 15) {
                tennis++;
            } else if (temp > -10 && temp <= 5) {
                skiing++;
            } else { // temp <= -10
                ladies++;
            }
        }


        String mostPopularSport = "Swimming";
        int max = swimming;

        if (golf > max) {
            mostPopularSport = "Golf";
            max = golf;
        }
        if (tennis > max) {
            mostPopularSport = "Tennis";
            max = tennis;
        }
        if (skiing > max) {
            mostPopularSport = "Skiing";
            max = skiing;
        }
        if (ladies > max) {
            mostPopularSport = "Ladies";
        }

        System.out.println("Most popular sport of the month: " + mostPopularSport);

    }
}
