package exceptions.useonlyforexceptionalconditions;

public class Exceptions {

    public static void main(String[] args) {
        // Horrible abuse of exceptions. Don't ever do this!
        int[] range = new int[]{1,2,3,4,5,6,7,8,9,10};
        try {

            int i = 0;

            while (true)

                System.out.println(range[i++]);

        } catch (ArrayIndexOutOfBoundsException e) {

        }
    }


    /* Exceptions are, as their name implies, to be used only for exceptional conditions;
        they should never be used for ordinary control flow. */


}
