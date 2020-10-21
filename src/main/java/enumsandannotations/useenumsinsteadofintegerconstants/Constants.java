package enumsandannotations.useenumsinsteadofintegerconstants;

import java.io.Serializable;

public class Constants {

    // The int enum pattern - severely deficient!

    public static final int APPLE_FUJI = 0;

    public static final int APPLE_PIPPIN = 1;

    public static final int APPLE_GRANNY_SMITH = 2;

    public static final int ORANGE_NAVEL = 0;

    public static final int ORANGE_TEMPLE = 1;

    public static final int ORANGE_BLOOD = 2;

    int i = (APPLE_FUJI - ORANGE_TEMPLE) / APPLE_PIPPIN;
}

