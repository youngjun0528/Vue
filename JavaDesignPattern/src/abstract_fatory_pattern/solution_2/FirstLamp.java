package abstract_fatory_pattern.solution_2;

public class FirstLamp extends Lamp {

    @Override
    protected void doOff() {
        System.out.println("Off first Lamp");
    }

    @Override
    protected void doOn() {
        System.out.println("On first Lamp");
    }
}
