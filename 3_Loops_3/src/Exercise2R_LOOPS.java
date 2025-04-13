public class Exercise2R_LOOPS {
    public static void main(String[] args) {
//        EXERCISE 2R
//        Display the multiples of 8 up to the value 504 in reverse order.
//        Should display 504,496,488, 480.... Up to 24,16,8,0.

        for (int i = 504; i>=0; i-- ){
            if (i % 8 == 0) {
                System.out.print(i+ " ");
            }

        }
    }
}
