package abstract_fatory_pattern.solution_1;

public class SecondElevatorFactory extends ElevatorFactory {
    @Override
    public Motor createMotor() {
        return new SecondMotor();
    }

    @Override
    public Door createDoor() {
        return new SecondDoor();
    }

    @Override
    public Lamp createLamp() {
        return new SecondLamp();
    }
}
