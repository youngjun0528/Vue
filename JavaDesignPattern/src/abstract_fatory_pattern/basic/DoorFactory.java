package abstract_fatory_pattern.basic;

public class DoorFactory {
    public static Door createDoor(VendorID vendorID) {
        Door door = null;
        switch (vendorID) {
            case First:
                door = new FirstDoor();
                break;
            case Second:
                door = new SecondDoor();
        }
        return door;
    }
}
