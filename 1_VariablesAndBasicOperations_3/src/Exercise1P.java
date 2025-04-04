import java.util.Scanner;

public class Exercise1P {
    public static void main(String[] args) {
//        EXERCISE 1P
//        Two trains depart from different cities (we know the distance between the
//        2 cities) in the same direction, but in opposite directions. Make a program that
//        calculates the point of collision of both locomotives knowing the speed
//        (we assume constant) of each of them. You must calculate and display
//        d1 and d2. Then make use of the following formulas:


        //If we ask to enter info.
        Scanner scanner = new Scanner(System.in);

        // In Km km/h
        double distance2Cities = 45;
        double train1Speed = 60;
        double train2Speed = 83;

//        Time of encounter (or collision time) formula t = D/v1+v2
        double time = distance2Cities / (train1Speed + train2Speed);
//        System.out.println(time);

//        Equation of Uniform Rectilinear Motion(URM) e = v * t
        double displacement1 = train1Speed * time;
        double displacement2 = train2Speed * time;
        System.out.printf("Train 1 displacement: %.2f km\n", displacement1);
        System.out.printf("Train 2 displacement: %.2f km\n", displacement2);


    }
}