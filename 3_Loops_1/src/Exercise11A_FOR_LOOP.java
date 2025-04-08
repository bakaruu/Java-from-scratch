import java.util.Scanner;

public class Exercise11A_FOR_LOOP {
    public static void main(String[] args) {
//        EXERCISE 11A
//        Do the same as in the previous exercise with 4A and 5A.


//        4A:
        int bottles = 10;
        String output1 = "";

        for (int i = bottles; i > 0; i--) {
            output1 += "There are " + i + " bottles on the wall. But if one bottle falls down due to bad luck, then there are " + (i - 1) + " bottles left on the wall.\n";
        }

        output1 += "There is no longer a bottle on the wall.";

        System.out.println(output1);

//        5A:

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int count = scanner.nextInt();

        int sum = 0;
        String output = "";

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();
            sum += number;
            output += number + (i < count ? " + " : " = ");
        }

        output += sum;

        System.out.println(output);

    }
}
