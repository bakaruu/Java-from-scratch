public class Exercise6R_LOOPS {
    public static void main(String[] args) {
//        EXERCISE 6R
//        Develop an application that calculates the factorial of a positive
//        integer. For example, the factorial of 5 is defined as 5*4*3*2*1
//        which would equal 120. The factorial of 0 is 1.

        int number = 5;
        int fac = 1;

        for (int i = 1; i <= number; i++) {
            fac *= i;
        }

        System.out.println(fac);

    }
}
