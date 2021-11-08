package abstract_fatory_pattern.solution_1;

public class FirstElevatorFactory extends ElevatorFactory {

    @Override
    public Motor createMotor() {
        return new FirstMotor();
    }

    @Override
    public Door createDoor() {
        return new FirstDoor();
    }

    @Override
    public Lamp createLamp() {
        return new FirstLamp();
    }

}
