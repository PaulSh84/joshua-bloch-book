package enumsandannotations.useenumsinsteadofintegerconstants;

// Enum type with constant-specific class bodies and data

public enum Operation {

    PLUS("+") {

        public double apply(double x, double y) { return x + y; }

    },

    MINUS("-") {

        public double apply(double x, double y) { return x - y; }

    },

    TIMES("*") {

        public double apply(double x, double y) { return x * y; }

    },

    DIVIDE("/") {

        public double apply(double x, double y) { return x / y; }

    };



    private final String symbol;



    Operation(String symbol) { this.symbol = symbol; }



    @Override public String toString() { return symbol; }



    public abstract double apply(double x, double y);

    public static void main(String[] args) {

        double x = Double.parseDouble(args[0]);

        double y = Double.parseDouble(args[1]);

        for (Operation op : Operation.values())

            System.out.printf("%f %s %f = %f%n",

                    x, op, y, op.apply(x, y));

    }

}