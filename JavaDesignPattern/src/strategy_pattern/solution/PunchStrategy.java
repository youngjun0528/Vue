package strategy_pattern.solution;

public class PunchStrategy implements AttackInterface {

    @Override
    public void attack() {
        System.out.println("I have strong punch and can attack with it.");
    }
}
