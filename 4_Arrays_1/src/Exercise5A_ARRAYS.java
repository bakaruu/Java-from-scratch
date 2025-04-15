public class Exercise5A_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 5A
//        Develop a program that, given two arrays, shows us which positions
//        of the two arrays coincide in value and position. For example,
//        if we have the following two arrays:

//        int[] originalArray = {1, 4, -2, 5, -7};
//        int[] modifiedArray = {1, 4, 9, 10, -7};

//        It should say that the matching positions are 0, 1 and 4.
//        If none of them match, display a message indicating the situation.
//        If they are not the same size, do nothing and just display
//        a message indicating the situation.

        int[] originalArray = {1, 42, -2, 5, -7};
        int[] modifiedArray = {1, 4, 9, 10, -7};
        String message = "Matching positions: ";
        int count = 0;


        if (originalArray.length != modifiedArray.length) {
            System.out.println("Different array sizes.");

        } else {
            for (int i = 0; i < originalArray.length; i++) {
                if (originalArray[i] == modifiedArray[i]) {
                    message += i + " ";
                    count++;
                }
            }

            if (count == 0) {
                System.out.println(message + "None");
            } else {
                System.out.println(message);

            }
        }

    }
}
