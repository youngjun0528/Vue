package abstract_fatory_pattern.basic_problem1;

public class FirstDoor extends Door {

    @Override
    protected void doClose() {
        System.out.println("Close First Door.");
    }

    @Override
    protected void doOpen() {
        System.out.println("Open First Door.");
    }

}
