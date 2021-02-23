package decorator_pattern.basic_problem;

public class RoadDisplayWithTraffic extends RoadDisplay {
    public void draw() {
        super.draw();
        drawTraffic();
    }

    private void drawTraffic() {
        System.out.println("Traffic Display.");
    }
}
