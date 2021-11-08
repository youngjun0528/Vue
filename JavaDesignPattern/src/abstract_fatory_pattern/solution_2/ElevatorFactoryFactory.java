package abstract_fatory_pattern.solution_2;

public class ElevatorFactoryFactory {
    // Factory Class에 Factory Method 패턴 적용
    public static ElevatorFactory getFactory(VendorID vendorID) {
        ElevatorFactory factory = null;
        switch (vendorID) {
            case First:
                factory = FirstElevatorFactory.getInstacne();
                break;
            case Second:
                factory = SecondElevatorFactory.getInstacne();
                break;
            case Third:
                factory = ThirdElevatorFactory.getInstacne();
                break;

        }
        return factory;
    }
}
