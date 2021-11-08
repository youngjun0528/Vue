package decorator_pattern.solution_2;

public class DisplayDecorator extends Display {
    private Display decoratorDisplay;

    public DisplayDecorator(Display decoratorDisplay) {
        this.decoratorDisplay = decoratorDisplay;
    }

    public void draw() {
        decoratorDisplay.draw();
    }
}
