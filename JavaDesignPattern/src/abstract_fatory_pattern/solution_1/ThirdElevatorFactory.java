package abstract_fatory_pattern.solution_1;

public class ThirdElevatorFactory extends ElevatorFactory {

    @Override
    public Motor createMotor() {
        return new ThirdMotor();
    }

    @Override
    public Door createDoor() {
        return new ThridDoor();
    }

    @Override
    public Lamp createLamp() {
        return new ThirdLamp();
    }

}
