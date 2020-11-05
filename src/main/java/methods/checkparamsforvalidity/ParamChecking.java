package methods.checkparamsforvalidity;

import java.util.Objects;

public class ParamChecking {

    private final Object strategy;

    public ParamChecking(Object strategy) {

        //For public and protected methods

        // Inline use of Java's null-checking facility

        this.strategy = Objects.requireNonNull(strategy,()-> new IllegalArgumentException("in case of NPE error").toString());
    }

    //For private methods use assert

    // Private helper function for a recursive sort

    private static void sort(long[] a, int offset, int length) {

        assert a != null;

        assert offset >= 0 && offset <= a.length;

        assert length >= 0 && length <= a.length - offset;

        //... Do the computation

    }

}
