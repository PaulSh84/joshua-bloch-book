package creatinganddestroyingobjects.singletonpropertywithprivateconstructororenum;

// Singleton with static method factory
public class ElvisTwo {

    private static final ElvisTwo INSTANCE = new ElvisTwo();

    private ElvisTwo(){}

    public static ElvisTwo getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {}


    public static void main(String[] args) {
        ElvisTwo inst = ElvisTwo.getInstance();
    }
}
