public class Exercise2R {
    public static void main(String[] args) {
//        EXERCISE 2R
//        Write a program that calculates the weekly wage of an employee
//        on the basis of the hours worked per day, at a rate of 12 euros
//        per hour.

        int hourlyWage= 12;
        int dailyHours = 8;

        int weeklyWage = (hourlyWage * dailyHours) * 5;

        System.out.println("Weekly wage: " + weeklyWage);

    }
}
