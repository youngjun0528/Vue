package decorator_pattern.solution_1;

public class Client {
    public static void main(String[] args) {
        Display road = new RoadDisplay();
        road.draw();

        Display roadWithLane = new LaneDecorator(new RoadDisplay());
        roadWithLane.draw();

        Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
        roadWithTraffic.draw();

        Display roadWithLaneAddTraffic = new TrafficDecorator(new LaneDecorator(new RoadDisplay()));
        roadWithLaneAddTraffic.draw();
    }
}
