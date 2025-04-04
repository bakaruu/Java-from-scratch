import java.util.Scanner;

public class Exercise4A_IF_ELSEIF_ELSE {
    public static void main(String[] args) {

//        EXERCISE 4A
//        Develop an application that prompts the user for a number and indicates
//        whether it is odd or even.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = scanner.nextInt();

        if(x%2 == 0){
            System.out.printf("%d is odd.", x);
        }else{
            System.out.printf("%d is even.", x);
        }
    }
}
