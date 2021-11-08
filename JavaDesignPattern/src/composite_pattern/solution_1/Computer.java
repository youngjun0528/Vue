package composite_pattern.solution_1;

import java.util.ArrayList;
import java.util.List;

public class Computer extends ComputerDevice {
    // 복수개의 ComputerDevice 객체를 가리킴
    private List<ComputerDevice> components = new ArrayList<ComputerDevice>();

    // ComputerDevice 객체를 Computer Class에 추가함.
    public void addComponent(ComputerDevice component) {
        components.add(component);
    }

    // ComputerDevice 객체를 Computer Class에 제거함.
    public void removeComponent(ComputerDevice component) {
        components.remove(component);
    }

    public int getPrice() {
        int price = 0;
        for (ComputerDevice component : components) {
            price += component.getPrice();
        }
        return price;
    }

    public int getPower() {
        int power = 0;
        for (ComputerDevice component : components) {
            power += component.getPower();
        }
        return power;
    }
}
