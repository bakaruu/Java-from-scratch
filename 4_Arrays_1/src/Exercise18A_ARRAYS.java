public class Exercise18A_ARRAYS {
    public static void main(String[] args) {

//        EXERCISE 18A
//        Develop a program that, given two arrays, creates another array,
//        the result of adding each correlative position of each initial array.
//        If they do not have the same size, perform the action partially.
//        For example:
//        V₁ = (1, 4, 2)
//        V₂ = (0, 2, 1)
//        V₁ + V₂ = (1, 4, 2) + (0, 2, 1) = (1, 6, 3)


        int[] v1 = {1, 4, 2};
        int[] v2 = {0, 2, 1};

        int minLength = v1.length < v2.length ? v1.length : v2.length;

//        or
//        int minLength;
//        if (v1.length < v2.length) {
//            minLength = v1.length;
//        } else {
//            minLength = v2.length;
//        }

        int[] result = new int[minLength];

        for (int i = 0; i < minLength; i++) {
            result[i] = v1[i] + v2[i];
        }


        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }

    }
}
