import java.util.Scanner;

public class Exercise13A_IF_ELSEiF_ELSE {
    public static void main(String[] args) {

//        EXERCISE 13A
//        Given a temperature, tell us which sport is appropriate according
//        to the following criteria:

//        Sport Temperature (ºC)
//        Swimming >30
//        Golf 15<T<=30
//        Tennis 5<T<=15
//        Skiing -10<T<=5
//        Ladies T<=-10

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature (°C): ");
        int temp = scanner.nextInt();

        if (temp > 30) {
            System.out.println("Recommended sport: Swimming 🏊");
        } else if (temp > 15 && temp <= 30) {
            System.out.println("Recommended sport: Golf 🏌️");
        } else if (temp > 5 && temp <= 15) {
            System.out.println("Recommended sport: Tennis 🎾");
        } else if (temp > -10 && temp <= 5) {
            System.out.println("Recommended sport: Skiing 🎿");
        } else {
            System.out.println("Chess in house LOL");
        }


    }
}
