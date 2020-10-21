package creatinganddestroyingobjects.dependencyinjectionoverhandwiring;

import creatinganddestroyingobjects.dependencyinjectionoverhandwiring.factorypattern.DictionaryFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Dependency injection provides flexibility and testability
public class ProperSpellChecker {

    private final DictionaryFactory factory;

    public ProperSpellChecker(DictionaryFactory factory) {
        this.factory = Objects.requireNonNull(factory);
    }

    public void typeInRussian() {
        factory.getDictionary("russian").type();
    }

    public void typeInGerman() {
        factory.getDictionary("german").type();
    }


    public boolean isValid(String word) {return true; }

    public List<String> suggestions(String typo) {return new ArrayList<>();
    }

    public static void main(String[] args) {
        DictionaryFactory factory = new DictionaryFactory();
        ProperSpellChecker checker = new ProperSpellChecker(factory);
        checker.typeInRussian();
        checker.typeInGerman();
    }
}
