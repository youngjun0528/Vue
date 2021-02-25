package abstract_fatory_pattern.solution_1;

public class SecondLamp extends Lamp {

    @Override
    protected void doOff() {
        System.out.println("Off second Lamp");
    }

    @Override
    protected void doOn() {
        System.out.println("On second Lamp");
    }
}
