package creatinganddestroyingobjects.singletonpropertywithprivateconstructororenum;
// Singleton with public final field

public class ElvisOne {

    public static final ElvisOne INSTANCE = new ElvisOne();

    private ElvisOne() {}

    public void leveTheBuilding() {

    }

}
