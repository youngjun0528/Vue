package command_pattern.basic_problem1;

public class Button {
    private Alarm theAlarm;

    public Button(Alarm theAlarm) {
        this.theAlarm = theAlarm;
    }

    public void pressed() {
        theAlarm.start();
    }
}
