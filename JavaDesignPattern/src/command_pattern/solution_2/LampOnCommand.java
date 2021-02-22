package command_pattern.solution_2;

public class LampOnCommand implements CommandInterface {
    private Lamp theLamp;

    public LampOnCommand(Lamp theLamp) {
        this.theLamp = theLamp;
    }

    @Override
    public void execute() {
        theLamp.turnOn();
    }
}
