public class Exercise14A2_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 14A
//        Develop a program that, given an array of integers, displays true if it
//        is an array with an even number or false otherwise.


        int[] arr = {1, 3, 2, 7, 9};

        boolean hasEven = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                hasEven = true;
                break;
            }
        }

        System.out.println("Does the array have any even numbers? " + hasEven);


    }
}
