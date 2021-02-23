package decorator_pattern.solution_2;

public class CrossingDecorator extends DisplayDecorator {
    public CrossingDecorator(Display decoratorDisplay) {
        super(decoratorDisplay);
    }

    public void draw() {
        super.draw();
        drawCrossing();
    }

    private void drawCrossing() {
        System.out.println("\tCrossing Display");
    }
}
