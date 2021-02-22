package strategy_pattern.solution;

public class MissileStrategy implements AttackInterface {

    @Override
    public void attack() {
        System.out.println("I have Missile and can attack with it.");
    }
}
