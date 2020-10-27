package lambdasandstreams.favoruseofstandardfunctionalinterfaces;

import java.util.Map;
import java.util.function.BiPredicate;

public class LinkedHashMapOldestEntry {

    // Unnecessary functional interface; use a standard one instead.

    @FunctionalInterface interface EldestEntryRemovalFunction<K,V>{

        boolean remove(Map<K,V> map, Map.Entry<K,V> eldest);

    }

    // standard functional interface

    boolean remove(BiPredicate<? extends Map<Object, Object>, ?extends Map.Entry<Object,Object>> predicate){
        return true;
    }
}
