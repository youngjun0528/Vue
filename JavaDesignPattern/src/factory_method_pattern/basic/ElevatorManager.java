package factory_method_pattern.basic;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
    private List<ElevatorController> controllers;
    private ThroughputScheduler scheduler;

    public ElevatorManager(int controllerCount) {
        controllers = new ArrayList<ElevatorController>(controllerCount);
        for (int i = 0; i < controllerCount; i++) {
            ElevatorController controller = new ElevatorController(i);
            controllers.add(controller);
        }
        scheduler = new ThroughputScheduler();
    }

    void requestElevator(int destination, Direction direction) {
        // 엘레베이터 선택
        int selectedElevator = scheduler.selectElevator(this, destination, direction);

        // 선택된 엘레베이터를 디오
        controllers.get(selectedElevator).gotoFloor(destination);
    }
}
