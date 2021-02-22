package strategy_pattern.solution;

public class WalkingStrategy implements MovingInterface {

    @Override
    public void move() {
        System.out.println("I can only walk.");
    }
}
