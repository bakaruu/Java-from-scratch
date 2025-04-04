public class Exercise9A {
    public static void main(String[] args) {
//        EXERCISE 9A

//        You have three variables A, B, C of type int
//        (although it could be any data type).
//        Write an application that makes the following exchanges
//        using only one auxiliary variable:
//        B takes the value of A.
//        C takes the value of B.
//        A takes the value of C.

        int A = 2, B = 4, C = 10;
        int aux = B;
        B = A;
        A = C;
        C = aux;

        System.out.println("Value of a: " + A);
        System.out.println("Value of b: " + B);
        System.out.println("Value of c: " + C);
    }
}
