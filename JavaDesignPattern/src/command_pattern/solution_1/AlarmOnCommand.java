package command_pattern.solution_1;

public class AlarmOnCommand implements CommandInterface {
    private Alarm theAlarm;

    public AlarmOnCommand(Alarm theAlarm) {
        this.theAlarm = theAlarm;
    }

    @Override
    public void execute() {
        theAlarm.start();
    }

}
