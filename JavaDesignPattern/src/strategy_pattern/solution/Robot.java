package strategy_pattern.solution;

public abstract class Robot {
    private String name;

    private MovingInterface movingStrategy;
    private AttackInterface attackStrategy;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 추상 메소드를 제거하고, move 및 attack 하는 interface method 를 호출하고,
    // 어떤 move와 attack을 할 것인지 지정한다.

    // public abstract void attack();
    // public abstract void move();

    public void attack() {
        attackStrategy.attack();
    }

    public void move() {
        movingStrategy.move();
    }

    public void setMovingStrategy(MovingInterface movingStrategy) {
        this.movingStrategy = movingStrategy;
    }

    public void setAttackStrategy(AttackInterface attackStrategy) {
        this.attackStrategy = attackStrategy;
    }
}