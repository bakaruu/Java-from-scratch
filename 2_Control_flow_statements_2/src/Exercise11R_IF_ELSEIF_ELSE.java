import java.util.Scanner;

public class Exercise11R_IF_ELSEIF_ELSE {
    public static void main(String[] args) {
//        EXERCISE 11R
//        Develop a program that calculates the body mass index (BMI) of
//        a person a (BMI = weight [kg] / height2 [m]) and indicates the
//        state of that person according to the value of the BMI.
//        (BMI = weight [kg] / height2 [m]) and indicates the state in which
//        that person is in according to the value of
//        BMI VALUE. Diagnoses according to BMI:
//         Diagnosis < 16. Criteria for hospital admission.
//         16 to 17. Underweight.
//         17 to 18. Underweight.
//         18 to 25. Normal (healthy) weight.
//         25 to 30. Overweight (grade I obesity).
//         From 30 to 35. Chronically overweight (grade II obesity).
//         35 to 40. Pre-morbid obesity (grade III obesity).
//         >40. Morbid obesity (grade IV obesity).
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height (m): ");
        double height = scanner.nextDouble();


        double bmi = weight / (height * height);

        System.out.printf("Your BMI is: %.2f\n", bmi);


        if (bmi < 16) {
            System.out.println("Criteria for hospital admission.");
        } else if (bmi < 17) {
            System.out.println("Underweight.");
        } else if (bmi < 18) {
            System.out.println("Underweight.");
        } else if (bmi < 25) {
            System.out.println("Normal (healthy) weight.");
        } else if (bmi < 30) {
            System.out.println("Overweight (grade I obesity).");
        } else if (bmi < 35) {
            System.out.println("Chronically overweight (grade II obesity).");
        } else if (bmi < 40) {
            System.out.println("Pre-morbid obesity (grade III obesity).");
        } else {
            System.out.println("Morbid obesity (grade IV obesity).");
        }


    }
}
