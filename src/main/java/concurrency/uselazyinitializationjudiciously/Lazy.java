package concurrency.uselazyinitializationjudiciously;

public class Lazy {

    // Lazy initialization holder class idiom for static fields



    private static class FieldHolder {

        static final FieldType field = computeFieldValue();

    }

    private static FieldType computeFieldValue() {
        return new FieldType();
    }



    private static FieldType getField() { return FieldHolder.field; }
}
