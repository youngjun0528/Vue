package abstract_fatory_pattern.solution_1;

public abstract class Lamp {
    private Door door;
    private LampStatus lampStatus;

    public Lamp() {
        lampStatus = LampStatus.OFF;
    }

    public LampStatus getDoorStatus() {
        return lampStatus;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public void off() { // Template Method
        if (lampStatus == LampStatus.OFF) { // 이미 내려가고 있으면 아무일도 안함.
            return;
        }
        DoorStatus doorStatus = door.getDoorStatus();
        // 만약 문이 열여있다면 우선 문을 닫음.
        if (doorStatus == DoorStatus.OPENED) {
            door.close();
        }
        doOff(); // 실제로 움직이는 동작을 수행함, 하위 클래스에서 오버라이드
        lampStatus = LampStatus.OFF;
    }

    protected abstract void doOff();

    public void on() {
        if (lampStatus == LampStatus.ON) { // 이미 올라가고 있으면 아무일도 안함.
            return;
        }
        DoorStatus doorStatus = door.getDoorStatus();
        // 만약 문이 열여있다면 우선 문을 닫음.
        if (doorStatus == DoorStatus.OPENED) {
            door.close();
        }
        doOn(); // 실제로 내려가는 동작을 수행함, 하위 클래스에서 오버라이드
        lampStatus = LampStatus.ON;
    }

    protected abstract void doOn();
}
