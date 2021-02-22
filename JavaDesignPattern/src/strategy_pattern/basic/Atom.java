package strategy_pattern.basic;

public class Atom extends Robot {

    public Atom(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("I have strong punch and can attack with it.");
    }

    @Override
    public void move() {
        // TaekwonV 와 동일한 역할을 할 때에는?
        // System.out.println("I can Fly.");
        System.out.println("I can only walk.");
    }
}
