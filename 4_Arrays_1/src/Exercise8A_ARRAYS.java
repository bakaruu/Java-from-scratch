public class Exercise8A_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 8A
//        Develop a program that, given an array, shows the largest value
//        of all the elements in the array.

        int [] arr = {1,2,3,4,5,16,7,8,23,2,22,122};
        int max = 0;

        for (int i = 0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }

        System.out.println("Max number is: "+ max);
    }
}
