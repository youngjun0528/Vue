package src.state_pattern.basic;

public class Light {
    private static int ON = 0;
    private static int OFF = 1;
    private static int SLEEP = 2;
    private int state;

    public Light() {
        state = OFF;
    }

    public void on_button_pushed() {
        if (state == ON) {
            System.out.println("No Response.");
            state = SLEEP;
        } else if (state == SLEEP) {
            System.out.println("Light On.");
            state = ON;
        } else {
            System.out.println("Light On.");
            state = ON;
        }
    }

    public void off_button_pushed() {
        if (state == OFF) {
            System.out.println("No Response.");
        } else if (state == SLEEP) {
            System.out.println("Light Off.");
            state = OFF;
        } else {
            System.out.println("Light Off.");
            state = OFF;
        }
    }
}
