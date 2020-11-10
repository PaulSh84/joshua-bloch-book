package methods.useoverloadingjudiciously;

// Fixed

import java.math.BigInteger;
import java.util.*;

public class FixedCollectionClassifier {

    public static String classify(Collection<?> c) {
        return c instanceof Set ? "Set" : c instanceof List ? "List": "Unknown Collection";
    }

    public static void main(String[] args) {

        Collection<?>[] collections = {

                new HashSet<String>(),

                new ArrayList<BigInteger>(),

                new HashMap<String, String>().values()

        };



        for (Collection<?> c : collections)

            System.out.println(classify(c));

    }

}
