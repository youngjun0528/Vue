package src.state_pattern.solution_1;

public class OnState implements StateInterface {

    @Override
    public void on_button_pushed(Light light) {
        System.out.println("Light Sleep.");
        light.setState(new SleepState());
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("Light Off");
        light.setState(new OffState());
    }

}
