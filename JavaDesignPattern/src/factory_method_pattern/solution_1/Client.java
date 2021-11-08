package factory_method_pattern.solution_1;

public class Client {
    public static void main(String[] args) {
        ElevatorManager emWithResponseTimeScheduler = new ElevatorManager(2, SchedulingStrategyID.RESPONSE_TIME);
        emWithResponseTimeScheduler.requestElevator(10, Direction.UP);

        ElevatorManager emWithThrouputScheduler = new ElevatorManager(2, SchedulingStrategyID.THROUGHT);
        emWithThrouputScheduler.requestElevator(10, Direction.UP);

        ElevatorManager emWithDynamicScheduler = new ElevatorManager(2, SchedulingStrategyID.DYNAMIC);
        emWithDynamicScheduler.requestElevator(10, Direction.UP);
    }
}
