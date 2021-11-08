package factory_method_pattern.solution_3;

import java.util.ArrayList;
import java.util.List;

public abstract class ElevatorManager {
    private List<ElevatorController> controllers;

    public ElevatorManager(int controllerCount) {
        controllers = new ArrayList<ElevatorController>(controllerCount);
        for (int i = 0; i < controllerCount; i++) {
            ElevatorController controller = new ElevatorController(i);
            controllers.add(controller);
        }
    }

    protected abstract ElevatorScheduler getScheduler();

    // Template Method
    void requestElevator(int destination, Direction direction) {
        // 하위 클래스에서 오버라이드된 getScheduler를 호출
        // 주어진전략 ID에 해당되는 Elecator Scheduler 사용
        ElevatorScheduler scheduler = getScheduler();
        System.out.println(scheduler);
        int selectedElevator = scheduler.selectElevator(this, destination, direction);
        controllers.get(selectedElevator).gotoFloor(destination);
    }
}
