package abstract_fatory_pattern.solution_2;

public class ThirdElevatorFactory extends ElevatorFactory {
    // Singleton 패턴 적용
    private static ElevatorFactory factory;

    private ThirdElevatorFactory() {

    }

    public static ElevatorFactory getInstacne() {
        if (factory == null) {
            factory = new ThirdElevatorFactory();
        }
        return factory;
    }

    @Override
    public Motor createMotor() {
        return new ThirdMotor();
    }

    @Override
    public Door createDoor() {
        return new ThirdDoor();
    }

    @Override
    public Lamp createLamp() {
        return new ThirdLamp();
    }

}
