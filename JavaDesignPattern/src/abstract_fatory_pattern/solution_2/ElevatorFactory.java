package abstract_fatory_pattern.solution_2;

public abstract class ElevatorFactory {
    public abstract Motor createMotor();

    public abstract Door createDoor();

    public abstract Lamp createLamp();
}
