public class Exercise7A {
    public static void main(String[] args) {
//        EXERCISE 7A
//        A school wants to know what percentage of boys and what percentage of
//        girls are in the current school year. Design a programme for this purpose.

        double girls = 54;
        double boys = 110;

        double total = girls + boys;

        double girlsPercentage = girls / total * 100;
        double boysPercentage = boys / total * 100;


        System.out.println("Total students: " + total);
        System.out.printf("Percentage of girls: %.2f%%\n", girlsPercentage);
        System.out.printf("Percentage of boys: %.2f%%\n", boysPercentage);
    }


}
