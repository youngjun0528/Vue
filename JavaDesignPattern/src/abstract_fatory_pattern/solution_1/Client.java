package abstract_fatory_pattern.solution_1;

public class Client {
    public static void main(String[] args) {
        ElevatorFactory factory = null;
        String vendorName = "First";

        if (vendorName.equalsIgnoreCase("First")) {
            factory = new FirstElevatorFactory();
        } else if (vendorName.equalsIgnoreCase("Second")) {
            factory = new SecondElevatorFactory();
        } else if (vendorName.equalsIgnoreCase("Third")) {
            factory = new ThirdElevatorFactory();
        }

        Door door = factory.createDoor();
        Motor motor = factory.createMotor();
        Lamp lamp = factory.createLamp();

        motor.setDoor(door);
        lamp.setDoor(door);

        door.open();
        motor.move(Direction.UP);
    }
}
