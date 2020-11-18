package generalprogramming.minimizescopeoflocalvariables;

import javax.lang.model.element.Element;
import java.util.Iterator;

public class PreferredIdioms {

    public static void main(String[] args) {
        // Preferred idiom for iterating over a collection or array

        for (Element e : collection) {

            // Do Something with e

        }

        // Idiom for iterating when you need the iterator

        for (Iterator<Element> i = collection.iterator(); i.hasNext(); ) {

            Element e = i.next();

            // Do something with e and i

        }
        // Two loop variables
        for (int i = 0, n = expensiveComputation(); i < n; i++) {

            // Do something with i;

        }

    }
}
