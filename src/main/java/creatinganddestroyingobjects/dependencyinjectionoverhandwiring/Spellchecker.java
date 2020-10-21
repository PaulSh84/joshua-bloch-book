package creatinganddestroyingobjects.dependencyinjectionoverhandwiring;

import java.util.ArrayList;
import java.util.List;

// Inappropriate use of static utility - inflexible & untestable!
public class Spellchecker {

    private static final Object dictionary = new Object();

    private Spellchecker() {} // Noninstantiable

    public static Spellchecker INSTANCE = new Spellchecker();

    public static boolean isValid(String word) { return true; }

    public static List<String> suggestions(String typo) { return new ArrayList<>();  }


}
