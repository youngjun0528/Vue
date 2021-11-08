package abstract_fatory_pattern.solution_2;

public class SecondDoor extends Door {

    @Override
    protected void doClose() {
        System.out.println("Close Second Door.");
    }

    @Override
    protected void doOpen() {
        System.out.println("Open Second Door.");
    }

}
