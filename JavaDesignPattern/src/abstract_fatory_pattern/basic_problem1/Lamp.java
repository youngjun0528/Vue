package abstract_fatory_pattern.basic_problem1;

public abstract class Lamp {
    private Door door;
    private LampStatus elevatorLampStatus;

    public Lamp() {
        elevatorLampStatus = LampStatus.OFF;
    }

    public LampStatus getDoorStatus() {
        return elevatorLampStatus;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public void off() { // Template Method
        if (elevatorLampStatus == LampStatus.OFF) { // 이미 내려가고 있으면 아무일도 안함.
            return;
        }
        DoorStatus doorStatus = door.getDoorStatus();
        // 만약 문이 열여있다면 우선 문을 닫음.
        if (doorStatus == DoorStatus.OPENED) {
            door.close();
        }
        doOff(); // 실제로 움직이는 동작을 수행함, 하위 클래스에서 오버라이드
        elevatorLampStatus = LampStatus.OFF;
    }

    protected abstract void doOff();

    public void on() {
        if (elevatorLampStatus == LampStatus.ON) { // 이미 올라가고 있으면 아무일도 안함.
            return;
        }
        DoorStatus doorStatus = door.getDoorStatus();
        // 만약 문이 열여있다면 우선 문을 닫음.
        if (doorStatus == DoorStatus.OPENED) {
            door.close();
        }
        doOn(); // 실제로 내려가는 동작을 수행함, 하위 클래스에서 오버라이드
        elevatorLampStatus = LampStatus.ON;
    }

    protected abstract void doOn();
}
