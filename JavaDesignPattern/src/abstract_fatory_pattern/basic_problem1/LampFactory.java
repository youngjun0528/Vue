package abstract_fatory_pattern.basic_problem1;

public class LampFactory {
    public static Lamp createLamp(VendorID vendorID) {
        Lamp lamp = null;
        switch (vendorID) {
            case First:
                lamp = new FirstLamp();
                break;
            case Second:
                lamp = new SecondLamp();
        }
        return lamp;
    }
}
