public class Exercise7A_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 7A
//        Repeat exercises 5 and 6 so that if they are not the same size,
//        the program runs partially on the smaller length instead of
//        displaying an error message.


        int[] originalArray = {1, 42, -2, 5, -7, -3};
        int[] modifiedArray = {1, 4, 9, 10, -7};
        String message = "Matching positions: ";
        int count = 0;


        int minLength = Math.min(originalArray.length, modifiedArray.length);

        //otherwise we must use if-else for it.
//        if (originalArray.length < modifiedArray.length) {
//            minLength = originalArray.length;
//        } else {
//            minLength = modifiedArray.length;
//        }

//        Matching values and positions (Exercise 5)
        for (int i = 0; i < minLength; i++) {
            if (originalArray[i] == modifiedArray[i]) {
                message += i + " ";
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Matching positions: None");
        } else {
            System.out.println(message);
        }

//        Scalar product (Exercise 6)
        int scalarProduct = 0;
        for (int i = 0; i < minLength; i++) {
            scalarProduct += originalArray[i] * modifiedArray[i];
        }
        System.out.println("Scalar product (up to smaller array length): " + scalarProduct);

    }
}
