package abstract_fatory_pattern.basic_problem1;

public class SecondMotor extends Motor {

    @Override
    protected void moveMotor(Direction direction) {
        // Run Motor
        System.out.println("Move second Motor");
    }
}
