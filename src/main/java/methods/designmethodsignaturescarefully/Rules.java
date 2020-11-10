package methods.designmethodsignaturescarefully;


public class Rules {
    
    //** Choose method names carefully. *//

    //** Don’t go overboard in providing convenience methods. *//
    
    //** Avoid long parameter lists. *//

    /* There are three techniques for shortening overly long parameter lists:

    - One is to break the method up into multiple methods, each of which requires only a subset of the parameters.

    - A second technique for shortening long parameter lists is to create helper classes to hold groups of parameters.

    - A third technique that combines aspects of the first two is to adapt the Builder pattern.
    To allow the client to make multiple “setter” calls on this object, each of which sets a single parameter or a small, related group.
     Once the desired parameters have been set, the client invokes the object’s “execute” method,
     */

    //** For parameter types, favor interfaces over classes *//

    //** Prefer two-element enum types to boolean parameters *//


    public static void main(String[] args) {
        Thermometer thermometer = Thermometer.newInstance(TemperatureScale.CELSIUS);
    }


}
