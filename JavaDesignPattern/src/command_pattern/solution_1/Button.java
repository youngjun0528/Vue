package src.command_pattern.solution_1;

public class Button {
    private CommandInterface theCommand;

    public Button(CommandInterface theCommand) {
        setCommand(theCommand);
    }

    public void setCommand(CommandInterface newCommand) {
        this.theCommand = newCommand;
    }

    public void pressed() {
        theCommand.execute();
    }
}
