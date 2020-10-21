package creatinganddestroyingobjects.noninstantiableclasswithonlyprivateconstructor;

// Non-instantiable utility class

public class UtilityClass {

    /**
     * Suppress default constructor for non-instantiability
     */
    private UtilityClass() {
        throw new AssertionError();
    }
    // static methods....

}
