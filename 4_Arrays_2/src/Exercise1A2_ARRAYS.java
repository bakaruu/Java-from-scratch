public class Exercise1A2_ARRAYS {
    public static void main(String[] args) {
//        EXERCISE 1A
//        Taking as an example the following drawing representing two arrays:
//        String [] names = {Juan, Ana, Marcos, Pablo, Laura}
//        int [] ages = {12, 21, 27, 14, 21}

//        They represent that John is 12 years old, Anna is 21 years old, etc.
//         Make a program that shows us on the screen the names of the people
//        who are of legal age.
        String[] names = {"Juan", "Ana", "Marcos", "Pablo", "Laura"};
        int[] ages = {12, 21, 27, 14, 21};
        String msg = "Legal age: ";

        for (int i = 0; i < names.length; i++) {
            if (ages[i] >= 18) {
                msg += names[i] + " ";
            }
        }
        System.out.println(msg);
//         Make a program that shows the oldest name on the screen.

        String msg2 = "The oldest one: ";


        int oldest = ages[0];
        String oldestName = names[0];

        for (int i = 1; i < names.length; i++) {
            if (ages[i] > oldest) {
                oldest = ages[i];
                oldestName = names[i];

            }

        }
        msg2 += oldestName;
        System.out.println(msg2);


    }
}