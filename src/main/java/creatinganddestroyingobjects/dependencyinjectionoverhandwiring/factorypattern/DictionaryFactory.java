package creatinganddestroyingobjects.dependencyinjectionoverhandwiring.factorypattern;

public class DictionaryFactory {

    public Dictionary getDictionary(String dictionaryName) {
        if(dictionaryName == null) {
            return null;
        }
        if (dictionaryName.equalsIgnoreCase("russian"))
            return new RussianDictionary();
        if (dictionaryName.equalsIgnoreCase("german"))
            return new GermanDictionary();

        return null;
    }


}
