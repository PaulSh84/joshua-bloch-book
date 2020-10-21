package classesandinterfaces.minimizemutability;

// Immutable class with static factories instead of constructors

public class ComplexWithStaticFactories {

    private final double re;

    private final double im;



    private ComplexWithStaticFactories(double re, double im) {

        this.re = re;

        this.im = im;

    }



    public static ComplexWithStaticFactories valueOf(double re, double im) {

        return new ComplexWithStaticFactories(re, im);

    }


}
