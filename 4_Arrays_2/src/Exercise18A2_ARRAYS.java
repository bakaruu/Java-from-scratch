public class Exercise18A2_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 18A
//        Develop a program that given an array containing numbers with a comma.
//        Display a Boolean that indicates true or false depending on whether
//        it satisfies all of the following:
//         The first element of the array is a 0
//         The last element of the array is a 10.
//         The rest of the data are numbers between 0 and 1 without counting
//        0 and 1.

        double[] arr = {0.0, 0.3, 0.6, 0.9, 10.0};

        boolean isValid = true;


        if (arr.length < 2) {
            isValid = false;
        } else {
            // First element must be 0.0
            if (arr[0] != 0.0) {
                isValid = false;
            }

            // Last element must be 10.0
            if (arr[arr.length - 1] != 10.0) {
                isValid = false;
            }

            // Middle elements must be between 0 and 1 (not including)
            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i] <= 0.0 || arr[i] >= 1.0) {
                    isValid = false;
                    break;
                }
            }
        }

        System.out.println("Valid array? " + isValid);

    }
}
