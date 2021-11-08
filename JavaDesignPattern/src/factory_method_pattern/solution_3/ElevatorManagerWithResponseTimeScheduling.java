package factory_method_pattern.solution_3;

public class ElevatorManagerWithResponseTimeScheduling extends ElevatorManager {
    public ElevatorManagerWithResponseTimeScheduling(int controllerCount) {
        super(controllerCount);
    }

    protected ElevatorScheduler getScheduler() {
        ElevatorScheduler scheduler = ThroughputScheduler.getInstance();
        return scheduler;
    }
}