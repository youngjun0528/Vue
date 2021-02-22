package src.command_pattern.solution_1;

public class Client {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        CommandInterface lampOnCommand = new LampOnCommand(lamp);

        Button button1 = new Button(lampOnCommand);
        button1.pressed();

        Alarm alarm = new Alarm();
        CommandInterface alarmOnCommand = new AlarmOnCommand(alarm);

        Button button2 = new Button(alarmOnCommand);
        button2.pressed();
    }
}

/*-
*/
