package methods.designmethodsignaturescarefully;

public class Thermometer {

    private final TemperatureScale scale;

    public Thermometer(TemperatureScale scale) {
        this.scale = scale;
    }

    public static Thermometer newInstance(TemperatureScale scale) {
        return new Thermometer(scale);
    }
}
