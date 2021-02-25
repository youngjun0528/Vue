package abstract_fatory_pattern.basic;

public class Client {
    public static void main(String[] args) {
        Door firstDoor = DoorFactory.createDoor(VendorID.First);
        Motor firstMotor = MotorFactory.createMotor(VendorID.First);
        firstMotor.setDoor(firstDoor);

        firstDoor.open();
        firstMotor.move(Direction.UP);
    }
}
