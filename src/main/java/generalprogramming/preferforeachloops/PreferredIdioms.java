package generalprogramming.preferforeachloops;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PreferredIdioms {

    public static void main(String[] args) {

        // The preferred idiom for iterating over collections and arrays

        List<Element> elements = new ArrayList<>();

        for (Element e : elements) {

            // Do something with e

        }
        // Preferred idiom for nested iteration on collections and arrays
        List<Suit> suits = new ArrayList<>();
        List<Card> deck = new ArrayList<>();
        List<Rank> ranks = new ArrayList<>();

        for (Suit suit : suits)

            for (Rank rank : ranks)

                deck.add(new Card(suit, rank));


        String[] strings = new String[]{"test1", "test2"};
        for (Iterator<String> i = Arrays.stream(strings).iterator(); i.hasNext(); ) {
            i.next();
        }

    /* there are three common situations where you can’t use for-each:

    - Destructive Filtering: When you need to use an explicit iterator
        so that you can call its remove method.

    - Transforming: If you need to traverse a list or array and replace some or
        all of the values of its elements, then you need the list iterator or
        array index in order to replace the value of an element.

     - Parallel iteration: If you need to traverse multiple collections in parallel,
        then you need explicit control over the iterator or index variable
     */
    }
}
