package state_pattern.solution_2;

public class SleepState implements StateInterface {

    // Interface 객체 생성시 반복적으로 생성할 필요없이 한번만 생성해도 되므로 Singleton 패턴으로 만든다.
    private static SleepState sleep = new SleepState();

    private SleepState() {

    }

    public static SleepState getInstnace() {
        return sleep;
    }

    @Override
    public void on_button_pushed(Light light) {
        System.out.println("Light On.");
        light.setState(OnState.getInstnace());
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("Light Off");
        light.setState(OffState.getInstnace());
    }

}
