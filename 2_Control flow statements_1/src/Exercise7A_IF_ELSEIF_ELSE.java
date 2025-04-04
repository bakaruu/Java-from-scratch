import java.util.Scanner;

public class Exercise7A_IF_ELSEIF_ELSE {
    public static void main(String[] args) {
//        EXERCISE 7A
//        Develop an application that asks for an integer and tells the user
//        whether the number is positive, negative or zero.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int x = scanner.nextInt();

        if(x>0){
            System.out.println("The number is greater than 0.");
        }else if(x<0){
            System.out.println("The number is less than 0.");
        }else{
            System.out.println("The number is 0.");
        }

    }
}
