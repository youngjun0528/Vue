package factory_method_pattern.solution_1;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
    private List<ElevatorController> controllers;
    private SchedulingStrategyID strategyID;

    public ElevatorManager(int controllerCount, SchedulingStrategyID strategyID) {
        controllers = new ArrayList<ElevatorController>(controllerCount);
        for (int i = 0; i < controllerCount; i++) {
            ElevatorController controller = new ElevatorController(i);
            controllers.add(controller);
        }
        this.strategyID = strategyID; // 스케줄링 전략 설정
    }

    public void setStrategyID(SchedulingStrategyID strategyID) {
        this.strategyID = strategyID;
    }

    void requestElevator(int destination, Direction direction) {
        // 주어진전략 ID에 해당되는 Elecator Scheduler 사용
        ElevatorScheduler scheduler = SchedulerFactory.getScheduler(strategyID);
        System.out.println(scheduler);
        int selectedElevator = scheduler.selectElevator(this, destination, direction);
        controllers.get(selectedElevator).gotoFloor(destination);
        // ElevatorScheduler scheduler;

        // int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        // if (hour < 12) {
        // scheduler = new ResponseTimeScheduler();
        // } else {
        // scheduler = new ThroughputScheduler();
        // }

        // int selectedElevator = scheduler.selectElevator(this, destination,
        // direction);
        // controllers.get(selectedElevator).gotoFloor(destination);
    }
}
