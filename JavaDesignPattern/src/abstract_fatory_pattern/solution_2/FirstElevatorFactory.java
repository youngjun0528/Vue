package abstract_fatory_pattern.solution_2;

public class FirstElevatorFactory extends ElevatorFactory {

    // Singleton 패턴 적용
    private static ElevatorFactory factory;

    private FirstElevatorFactory() {

    }

    public static ElevatorFactory getInstacne() {
        if (factory == null) {
            factory = new FirstElevatorFactory();
        }
        return factory;
    }

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
