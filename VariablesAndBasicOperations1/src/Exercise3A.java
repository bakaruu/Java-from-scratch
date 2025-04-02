public class Exercise3A {
    public static void main(String[] args) {
//        EXERCISE 3A
//        Develop an application that reads 4 integers,
//        calculates their product, sum and arithmetic mean.

        int a = 2, b = 3, c = 5, d = 6;

        int product = a * b * c * d;
        int sum = a + b + c + d;
        int arithMean = sum/4;

        System.out.println(product);
        System.out.println(sum);
        System.out.println(arithMean);

    }
}
