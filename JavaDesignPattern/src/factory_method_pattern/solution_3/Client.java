package factory_method_pattern.solution_3;

public class Client {
    public static void main(String[] args) {
        ElevatorManager emWithResponseTimeScheduler = new ElevatorManagerWithDynamicScheduling(2);
        emWithResponseTimeScheduler.requestElevator(10, Direction.UP);

        ElevatorManager emWithThrouputScheduler = new ElevatorManagerWithResponseTimeScheduling(2);
        emWithThrouputScheduler.requestElevator(10, Direction.UP);

        ElevatorManager emWithDynamicScheduler = new ElevatorManagerWithThroughputScheduling(2);
        emWithDynamicScheduler.requestElevator(10, Direction.UP);
    }
}
