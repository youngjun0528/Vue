package abstract_fatory_pattern.solution_2;

public class SecondElevatorFactory extends ElevatorFactory {
    // Singleton 패턴 적용
    private static ElevatorFactory factory;

    private SecondElevatorFactory() {

    }

    public static ElevatorFactory getInstacne() {
        if (factory == null) {
            factory = new SecondElevatorFactory();
        }
        return factory;
    }

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
