package generalprogramming.knowanduselibraries;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

public class RandomExample {

    static Random rnd = new Random();

    public static void main(String[] args) {
        int n = 2 * (Integer.MAX_VALUE / 3);

        int low = 0;

        for (int i = 0; i < 1000000; i++)

            if (random(n) < n/2)

                low++;

        System.out.println(low);
    }





    static int random(int n) {

        return Math.abs(rnd.nextInt()) % n;

    }



    /* As of Java 7, you should no longer use Random.
        For most uses, the random number generator of choice is now ThreadLocalRandom.
        For fork join pools and parallel streams, use SplittableRandom.
     */

    /* If you can’t find what you need in Java platform libraries,
        your next choice should be to look in high-quality third-party libraries,
        such as Google’s excellent, open source Guava library.
     */
}
