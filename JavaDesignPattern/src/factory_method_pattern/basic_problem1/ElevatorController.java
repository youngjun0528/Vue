package factory_method_pattern.basic_problem1;

public class ElevatorController {
    private int id;
    private int curFloor;

    public ElevatorController(int id) {
        this.id = id; // 엘레베이터 ID
        curFloor = 1; // 현재층
    }

    public void gotoFloor(int destination) {
        System.out.println("Elevator [" + id + "] Floor: " + curFloor);
        // 현재층 갱신, 즉, 주어진 목적지 측으로 엘레베이터가 이동함.
        curFloor = destination;
        System.out.println(" ==> " + curFloor);
    }
}
