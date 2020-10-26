package lambdasandstreams.prefermethodreferencestolambdas;

public class ReferenceTypes {

    // Static method reference type

    /**
     * Integer::parseInt *equals* str -> Integer.parseInt(str)
     */

    // Bound method reference

    /**
     * Instant.isNow::isAfter  *equals* Instant then = Instant.now(); t -> then.isAfter(t)
     */

    // Unbound method reference

    /**
     * String::toLowerCase *equals* str -> str.toLowerCase();
     */

    // Class constructor method reference

    /**
     * TreeMap<K,V>::new  *equals* () -> new TreeMap<K,V>
     */

    // Array constructor

    /**
     * int[]::new  *equals*  len -> new int[len]
     */

}
