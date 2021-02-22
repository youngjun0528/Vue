package src.state_pattern.solution_1;

public class OffState implements StateInterface {

    @Override
    public void on_button_pushed(Light light) {
        System.out.println("Light On");
        light.setState(new OnState());
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("No Response.");
    }

}
