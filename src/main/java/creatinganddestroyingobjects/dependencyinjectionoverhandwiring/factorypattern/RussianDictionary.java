package creatinganddestroyingobjects.dependencyinjectionoverhandwiring.factorypattern;

public class RussianDictionary implements Dictionary {

    @Override
    public void type() {
        System.out.println("Это русский словарь");
    }
}
