package template_method_pattern.solution;

public class Client {
    public static void main(String[] args) {
        Door door = new Door();
        FirstMotor firstMotor = new FirstMotor(door);

        System.out.println(firstMotor.getMotorStatus());
        System.out.println(door.getDoorStatus());
        System.out.println();

        door.open();

        System.out.println(firstMotor.getMotorStatus());
        System.out.println(door.getDoorStatus());
        System.out.println();

        firstMotor.move(Direction.UP);

        System.out.println(firstMotor.getMotorStatus());
        System.out.println(door.getDoorStatus());
        System.out.println();
    }
}
