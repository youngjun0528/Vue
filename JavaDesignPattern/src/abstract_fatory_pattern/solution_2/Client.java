package abstract_fatory_pattern.solution_2;

public class Client {
    public static void main(String[] args) {
        String vendorName = "First";
        VendorID vendorID = null;

        if (vendorName.equalsIgnoreCase("First")) {
            vendorID = VendorID.First;
        } else if (vendorName.equalsIgnoreCase("Second")) {
            vendorID = VendorID.Second;
        } else if (vendorName.equalsIgnoreCase("Third")) {
            vendorID = VendorID.Third;
        }

        if (vendorID != null) {
            ElevatorFactory factory = ElevatorFactoryFactory.getFactory(vendorID);

            Door door = factory.createDoor();
            Motor motor = factory.createMotor();
            Lamp lamp = factory.createLamp();

            motor.setDoor(door);
            lamp.setDoor(door);

            door.open();
            motor.move(Direction.UP);
        }
    }
}
