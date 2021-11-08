package abstract_fatory_pattern.solution_1;

public class ThirdLamp extends Lamp {
    @Override
    protected void doOff() {
        System.out.println("Off third Lamp");
    }

    @Override
    protected void doOn() {
        System.out.println("On third Lamp");
    }
}
