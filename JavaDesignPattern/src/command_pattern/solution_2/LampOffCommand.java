package src.command_pattern.solution_2;

public class LampOffCommand implements CommandInterface {
    private Lamp theLamp;

    public LampOffCommand(Lamp theLamp) {
        this.theLamp = theLamp;
    }

    @Override
    public void execute() {
        theLamp.turnOff();
    }
}
