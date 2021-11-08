package decorator_pattern.solution_2;

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

        Display roadWithCrossingAndLaneAndTraffic = new LaneDecorator(
                new TrafficDecorator(new CrossingDecorator(new RoadDisplay())));
        roadWithCrossingAndLaneAndTraffic.draw();

        String[] arg = { "Lane", "Traffic", "Crossing" };

        Display dynamicRoad = new RoadDisplay();

        for (String decoratorName : arg) {
            if (decoratorName.equals("Lane")) {
                dynamicRoad = new LaneDecorator(dynamicRoad);
            }
            if (decoratorName.equals("Traffic")) {
                dynamicRoad = new TrafficDecorator(dynamicRoad);

            }
            if (decoratorName.equals("Crossing")) {
                dynamicRoad = new CrossingDecorator(dynamicRoad);
            }
        }

        dynamicRoad.draw();

    }
}
