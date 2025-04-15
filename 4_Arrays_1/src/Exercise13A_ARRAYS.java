public class Exercise13A_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 13A
//        Develop a program which, given an array of integers,
//        calculates 3 results. It must calculate the average
//        of the even numbers, the average of the odd numbers
//        and finally the average of all the integers.

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9};

        int evenSum = 0;
        int evenCount = 0;

        int oddSum = 0;
        int oddCount = 0;

        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];

            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
                evenCount++;
            } else {
                oddSum += arr[i];
                oddCount++;
            }
        }

        double evenAve;
        if (evenCount > 0) {
            evenAve = (double) evenSum / evenCount;
        } else {
            evenAve = 0;
        }

        double oddAve;
        if (oddCount > 0) {
            oddAve = (double) oddSum / oddCount;
        } else {
            oddAve = 0;
        }

        double totalAve = (double) totalSum / arr.length;


        System.out.printf("Average of even numbers: %.2f\n", evenAve);
        System.out.printf("Average of odd numbers: %.2f\n", oddAve);
        System.out.printf("Average of all numbers: %.2f\n", totalAve);

    }
}
