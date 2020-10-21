package enumsandannotations.useenumsinsteadofintegerconstants;

public enum CalculatorOperation {

    // Enum type with constant-specific method implementations

    PLUS {
        public double apply(double x, double y) {
            return x + y;
        }
    },

    MINUS {
        public double apply(double x, double y) {
            return x - y;
        }
    },

    TIMES {
        public double apply(double x, double y) {
            return x * y;
        }
    },

    DIVIDE {
        public double apply(double x, double y) {
            return x / y;
        }
    };


    public abstract double apply(double x, double y);

    public static void main(String[] args) {
        double result = CalculatorOperation.DIVIDE.apply(2, 2);
    }

}
