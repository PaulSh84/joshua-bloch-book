package objectscommonmethods.implementcomparable;

import java.util.Comparator;

public class ComparatorExample {

    // Comparator based on Comparator construction method

    static Comparator<Object> hashCodeOrder =

            Comparator.comparingInt(Object::hashCode);
}
