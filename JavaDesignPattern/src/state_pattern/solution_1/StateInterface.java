package src.state_pattern.solution_1;

public interface StateInterface {
    public void on_button_pushed(Light light);

    public void off_button_pushed(Light light);
}
