public class Exercise16A2_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 16A
//        Develop a program that given an array of integers and an integer X
//        displays true if it is an array that has its first X positions at 0 and
//        rest are all different from 0 (this is called a hash of difficulty X
//        in bitcoin) or false otherwise.
        int[] arr = {0, 0, 5, 6, 3, 2};
        int X = 3; // Dificultad

        boolean isValidHash = true;

        // Check first X positions are 0
        for (int i = 0; i < X; i++) {
            if (arr[i] != 0) {
                isValidHash = false;
                break;
            }
        }

        // Check the rest are NOT 0
        if (isValidHash) {
            for (int i = X; i < arr.length; i++) {
                if (arr[i] == 0) {
                    isValidHash = false;
                    break;
                }
            }
        }

        System.out.println("Is valid hash with difficulty " + X + "? " + isValidHash);

    }
}
