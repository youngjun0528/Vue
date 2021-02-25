package abstract_fatory_pattern.basic_problem1;

public class Client {
    public static void main(String[] args) {
        Door firstDoor = DoorFactory.createDoor(VendorID.First);
        Motor firstMotor = MotorFactory.createMotor(VendorID.First);

        Lamp firstLamp = LampFactory.createLamp(VendorID.First);

        firstMotor.setDoor(firstDoor);
        firstLamp.setDoor(firstDoor);

        firstDoor.open();
        firstMotor.move(Direction.UP);
        firstLamp.on();

        Door secondDoor = DoorFactory.createDoor(VendorID.Second);
        Motor secondMotor = MotorFactory.createMotor(VendorID.Second);
        secondMotor.setDoor(secondDoor);

        secondDoor.open();
        secondMotor.move(Direction.UP);
    }
}
