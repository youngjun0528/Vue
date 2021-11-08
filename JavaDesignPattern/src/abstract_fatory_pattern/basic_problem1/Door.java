package abstract_fatory_pattern.basic_problem1;

public abstract class Door {
    private DoorStatus doorStatus;

    public Door() {
        doorStatus = DoorStatus.CLOSED;
    }

    public DoorStatus getDoorStatus() {
        return doorStatus;
    }

    public void close() { // Template Method
        if (doorStatus == DoorStatus.CLOSED) { // 이미 문이 닫혀 있으면 아무일도 안함.
            return;
        }
        doClose(); // 실제로 문을 닫는 동작을 수행함, 하위 클래스에서 오버라이드
        doorStatus = DoorStatus.CLOSED;
    }

    protected abstract void doClose();

    public void open() {
        if (doorStatus == DoorStatus.OPENED) { // 이미 문이 열려 있으면 아무일도 안함.
            return;
        }
        doOpen(); // 실제로 문을 여는 동작을 수행함, 하위 클래스에서 오버라이드
        doorStatus = DoorStatus.OPENED;
    }

    protected abstract void doOpen();
}
