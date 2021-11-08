package composite_pattern.basic_problem1;

public class Monitor {
    private int price;
    private int power;

    public Monitor(int power, int price) {
        this.power = power;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getPower() {
        return power;
    }
}
