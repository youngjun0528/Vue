package state_pattern.solution_2;

public class Light {
    // private static int ON = 0;
    // private static int OFF = 1;
    // private static int SLEEP = 2;
    // private int state;
    private StateInterface state;

    public Light() {
        // state = OFF;
        state = OffState.getInstnace();
    }

    public void setState(StateInterface state) {
        this.state = state;
    }

    public void on_button_pushed() {
        state.on_button_pushed(this);
    }

    public void off_button_pushed() {
        state.off_button_pushed(this);
    }

    // public void on_button_pushed() {
    // if (state == ON) {
    // System.out.println("No Response.");
    // state = SLEEP;
    // } else if (state == SLEEP) {
    // System.out.println("Light On.");
    // state = ON;
    // } else {
    // System.out.println("Light On.");
    // state = ON;
    // }
    // }

    // public void off_button_pushed() {
    // if (state == OFF) {
    // System.out.println("No Response.");
    // } else if (state == SLEEP) {
    // System.out.println("Light Off.");
    // state = OFF;
    // } else {
    // System.out.println("Light Off.");
    // state = OFF;
    // }
    // }
}
