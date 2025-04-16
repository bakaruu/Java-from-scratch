public class Exercise17A2_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 17A
//        Develop a program that, given an array containing integers, displays
//        a Boolean that indicates whether the array has an even number of elements
//        (length) greater than zero and all numbers end in 5.

        int[] arr = {15, 25, 35, 45, 25};

        boolean isValid = true;

        if (arr.length == 0 || arr.length % 2 != 0) {
            isValid = false;
        } else {
            for (int number : arr) {
                if (Math.abs(number) % 10 != 5) {
                    isValid = false;
                    break;
                }
            }
        }

        System.out.println("Valid array? " + isValid);
    }
}
