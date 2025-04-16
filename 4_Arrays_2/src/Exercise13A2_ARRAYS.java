public class Exercise13A2_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 13A
//        Develop a program that, given an array of integers, displays true if they
//        are all even numbers or false otherwise.

        int[] arr = {2, 4, 7, 8, 10};

        boolean allEven = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                allEven = false;
                break;
            }
        }

        System.out.println("All numbers are even? " + allEven);


    }
}
