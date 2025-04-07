import java.util.Scanner;

public class Exercise_3P_SWITCH_CASE {
    public static void main(String[] args) {
//        EXERCISE 3P
//        Ask for a number from 0 to 99 and display it in writing.
//        For example, for 56, show: fifty-six.


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number from 0 to 99: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 99) {
            System.out.println("Invalid number. Must be between 0 and 99.");
        } else if (number < 20) {

            switch (number) {
                case 0: System.out.println("zero"); break;
                case 1: System.out.println("one"); break;
                case 2: System.out.println("two"); break;
                case 3: System.out.println("three"); break;
                case 4: System.out.println("four"); break;
                case 5: System.out.println("five"); break;
                case 6: System.out.println("six"); break;
                case 7: System.out.println("seven"); break;
                case 8: System.out.println("eight"); break;
                case 9: System.out.println("nine"); break;
                case 10: System.out.println("ten"); break;
                case 11: System.out.println("eleven"); break;
                case 12: System.out.println("twelve"); break;
                case 13: System.out.println("thirteen"); break;
                case 14: System.out.println("fourteen"); break;
                case 15: System.out.println("fifteen"); break;
                case 16: System.out.println("sixteen"); break;
                case 17: System.out.println("seventeen"); break;
                case 18: System.out.println("eighteen"); break;
                case 19: System.out.println("nineteen"); break;
            }
        } else {
            int tens = number / 10;
            int units = number % 10;

            String tensText = "";
            String unitsText = "";


            switch (tens) {
                case 2: tensText = "twenty"; break;
                case 3: tensText = "thirty"; break;
                case 4: tensText = "forty"; break;
                case 5: tensText = "fifty"; break;
                case 6: tensText = "sixty"; break;
                case 7: tensText = "seventy"; break;
                case 8: tensText = "eighty"; break;
                case 9: tensText = "ninety"; break;
            }


            switch (units) {
                case 0: unitsText = ""; break;
                case 1: unitsText = "-one"; break;
                case 2: unitsText = "-two"; break;
                case 3: unitsText = "-three"; break;
                case 4: unitsText = "-four"; break;
                case 5: unitsText = "-five"; break;
                case 6: unitsText = "-six"; break;
                case 7: unitsText = "-seven"; break;
                case 8: unitsText = "-eight"; break;
                case 9: unitsText = "-nine"; break;
            }

            System.out.println(tensText + unitsText);
        }
    }
}
