public class Exercise4A2_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 4A
//        One form of basic cryptogram is to assign numbers to each of the letters and
//        then write a message with numbers only. Create a program that can discover the
//        hidden message behind a cryptogram like this example:


        char[] letters = {
                'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ',
                'O','P','Q','R','S','T','U','V','W','X','Y','Z'
        };

        int[] codes = {
                10, 25, 23, 4, 3, 15, 1, 22, 13, 6, 21, 7, 20, 18,
                16, 11, 5, 26, 12, 24, 2, 27, 14, 17, 9, 8, 19
        };


        int[][] messageLines = {
                {4, 13, 24, 15, 12, 27, 2, 10, 4, 3, 7, 10, 24},
                {14, 10, 23, 10, 23, 11, 18, 3, 24},
                {2, 27, 24, 5, 16, 11, 1, 1, 20, 10, 2, 3, 26, 27, 13, 9, 12, 3},
                {20, 13, 7, 7, 11, 18, 3, 24}
        };


        for (int[] line : messageLines) {
            String decoded = "";

            for (int code : line) {
                for (int i = 0; i < codes.length; i++) {
                    if (codes[i] == code) {
                        decoded = decoded + letters[i]; // Append letter
                        break;
                    }
                }
            }

            System.out.println(decoded);
        }


    }
}
