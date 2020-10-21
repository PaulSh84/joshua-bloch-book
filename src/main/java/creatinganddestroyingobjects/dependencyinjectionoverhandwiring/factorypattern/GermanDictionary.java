package creatinganddestroyingobjects.dependencyinjectionoverhandwiring.factorypattern;

public class GermanDictionary implements Dictionary {
    @Override
    public void type() {
        System.out.println("Das ist deutsches Woerterbuch");
    }
}
