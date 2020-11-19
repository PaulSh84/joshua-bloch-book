package generalprogramming.preferprimitivestoboxedprimitives;

import java.util.Comparator;

public class Example {
    public static void main(String[] args) {

        int res1 = brokenComparator(new Integer(22), new Integer(22));
        int res2 = fixedComparator(new Integer(22), new Integer(22));

        System.out.println(res1);
        System.out.println(res2);
    }

    static int brokenComparator(Integer i1, Integer i2) {
        // Broken comparator
        Comparator<Integer> naturalOrder = (i, j) -> (i < j) ? -1 : (i == j ? 0 :1);

        return naturalOrder.compare(42, 42);
    }

    static int fixedComparator(int i1, int i2) {
        // Broken comparator
        Comparator<Integer> naturalOrder = (iBoxed, jBoxed) ->
        {
            int i = iBoxed, j = jBoxed;
            return i < j ? -1 : (i == j ? 0 :1);
        };

        return naturalOrder.compare(42, 42);
    }

}
