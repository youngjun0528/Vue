package src.strategy_pattern.solution;

public class FlyingStrategy implements MovingInterface {

    @Override
    public void move() {
        System.out.println("I can fly.");
    }
}
