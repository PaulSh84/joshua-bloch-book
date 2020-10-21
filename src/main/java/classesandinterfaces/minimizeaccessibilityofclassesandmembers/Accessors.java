package classesandinterfaces.minimizeaccessibilityofclassesandmembers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Accessors {

    private static final Object[] PRIVATE_VALUES = {1,2,4};

    public static final List<Object> VALUES =
            Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));

    public static final Object[] values() {
        return PRIVATE_VALUES.clone();
    }
}
