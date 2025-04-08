public class Exercise4A_FOR_LOOP {
    public static void main(String[] args) {
//        EXERCISE 4A
//        Reproduce the same content as in the attached picture for
//        any number N of bottles.
//        There are 10 bottles on the wall. But if one bottle falls down due to
//        bad luck, then there are 9 bottles left on the wall.
//        There are 9 bottles on the wall. But if one bottle falls down due to
//        bad luck, then there are 8 bottles left on the wall.
//        There are 8 bottles on the wall. But if one bottle falls down due to
//        bad luck, then there are 7 bottles left on the wall.
//        There are 7 bottles on the wall. But if one bottle falls down due to
//        bad luck, then there are 6 bottles left on the wall.
//        There are 6 bottles on the wall. But if one bottle falls down due to
//        bad luck, then there are 5 bottles left on the wall... etc


        for (int i = 10; i > 0; i--) {

            System.out.println("There are " + i + " bottles on the wall. But if one bottle" +
                    " falls down due to bad luck, " +
                    "then there are " + (i - 1) + " bottles left on the wall.");

        }
        System.out.println("There is no longer a bottle on the wall");
    }
}
