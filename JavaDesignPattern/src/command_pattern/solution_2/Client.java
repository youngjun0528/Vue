package src.command_pattern.solution_2;

public class Client {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        CommandInterface lampOnCommand = new LampOnCommand(lamp);
        CommandInterface lampOffCommand = new LampOffCommand(lamp);

        Button button1 = new Button(lampOnCommand);
        button1.pressed();

        button1.setCommand(lampOffCommand);
        button1.pressed();

        Alarm alarm = new Alarm();
        CommandInterface alarmOnCommand = new AlarmOnCommand(alarm);

        Button button2 = new Button(alarmOnCommand);
        button2.pressed();
    }
}

/*-
*/
