package generalprogramming.refertoobjectsbytheirinterfaces;

import java.util.LinkedHashSet;
import java.util.Set;

public class Example {

    /* If appropriate interface types exist,
        then parameters, return values, variables, and fields
         should all be declared using interface types.
     */

    // Good - uses interface as type

    Set<Son> sonSet = new LinkedHashSet<>();

    // Bad - uses class as type!

    LinkedHashSet<Son> sonSet2 = new LinkedHashSet<>();

    // fixed version
    Set<Son> sonSet3 = new LinkedHashSet<>();

}
