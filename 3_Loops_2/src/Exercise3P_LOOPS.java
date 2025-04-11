public class Exercise3P_LOOPS {
    public static void main(String[] args) {
//        EXERCISE 3P
//        Given a positive integer calculate its value in the Fibonacci
//        series, an example to calculate the Fibonacci series in 6 would be:
//        Where the general formula is:
//
//        Fibonacci base cases
//        f₀ = 0
//        f₁ = 1
//        f₂ = 1
//        f₃ = 2
//        f₄ = 3
//        f₅ = 5
//
//        Recursive relation
//        f(n) = f(n - 1) + f(n - 2);  // for n > 1
        int number = 6;
        int a = 0;
        int b = 1;

        System.out.println("Fibonacci series up to " + number + " terms:");

        for (int i = 0; i <number; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }

    }
}
