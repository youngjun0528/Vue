package decorator_pattern.solution_2;

public class TrafficDecorator extends DisplayDecorator {
    public TrafficDecorator(Display decoratorDisplay) {
        super(decoratorDisplay);
    }

    public void draw() {
        super.draw();
        drawTraffic();
    }

    private void drawTraffic() {
        System.out.println("\tTraffic Display");
    }
}
