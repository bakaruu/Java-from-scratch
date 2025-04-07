import java.util.Scanner;

public class Exercise4R_IF_ELSEIF_ELSE {
    public static void main(String[] args) {

//        EXERCISE 4R
//        Create a program that asks for two integers: grade,
//        age and a gender character and displays the
//          message ‘ACCEPTED’ if the grade is greater than or equal
//        to five, the age is greater than or equal to eighteen
//        and the gender is ‘M’ or ‘V’ (upper case only).
//        For all other cases write ‘NOT ACCEPTED’.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter grade: ");
        int grade = scanner.nextInt();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter gender (M or V): ");
        char gender = scanner.next().charAt(0);

        if (grade >= 5 && age >= 18 && (gender == 'M' || gender == 'V')) {
            System.out.println("✅ ACCEPTED");
        } else {
            System.out.println("❌ NOT ACCEPTED");
        }

    }
}
