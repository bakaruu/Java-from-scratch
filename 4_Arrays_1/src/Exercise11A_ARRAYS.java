public class Exercise11A_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 11A
//        Develop a program which, given an array of integers, displays it
//        on the screen separating the numbers with commas. For example,
//        display the array [5 6 9 12 4] as 5,6,9,12,4.

        int [] arr = {1,2,3,4,5,6,7,9};

        for (int i= 0; i< arr.length;i++){

            if(i== arr.length-1){
                System.out.print(arr[i]+".");
            }else{
                System.out.print(arr[i]+",");
            }
        }
    }
}
