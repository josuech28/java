package exercises.innerclass.nestedstaticclass;

/**
 * Created by joschinc on 11/8/16.
 */
public abstract class Car {
    private String manufacturer;
    public abstract void start();

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public abstract int getBatteryPower();

    public static class Hybrid {

    }
}
