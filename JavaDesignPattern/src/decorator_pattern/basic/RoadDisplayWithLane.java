package decorator_pattern.basic;

public class RoadDisplayWithLane extends RoadDisplay {

    public void draw() {
        super.draw();
        drawLane();
    }

    private void drawLane() {
        System.out.println("Lane display.");
    }
}
