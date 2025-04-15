import java.util.Scanner;

public class Exercise12A_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 12A
//        Develop a program as above where the separator character
//        is keyboard entered. For example, the array [5 6 9 12 4]
//        enter the character ‘=’ by keyboard and display it
//        as 5=6=9=12=4.

        Scanner scanner = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6,7,9};
        char caracter = scanner.next().charAt(0);

        for (int i= 0; i< arr.length;i++){

            if(i== arr.length-1){
                System.out.print(arr[i]+".");
            }else{
                System.out.print(arr[i]+""+caracter);
            }
        }
    }
}
