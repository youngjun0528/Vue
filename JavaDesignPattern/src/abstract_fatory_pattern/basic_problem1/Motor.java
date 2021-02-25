package abstract_fatory_pattern.basic_problem1;

// 상속을 사용하여 중복코드를 최소화 한다.
public abstract class Motor {
    private Door door;
    private MotorStatus motorStatus;

    public Motor() {
        motorStatus = MotorStatus.STOPED; // 초기값은 멈춤상태
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    protected void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    // First Motor와 Second Motor의 공통적인 부분만 가져온다.
    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        // 이미 이동중이면 아무일도 하지 않음.
        if (motorStatus == MotorStatus.MOVING) {
            return;
        }

        DoorStatus doorStatus = door.getDoorStatus();
        // 만약 문이 열여있다면 우선 문을 닫음.
        if (doorStatus == DoorStatus.OPENED) {
            door.close();
        }

        // 모터를 주어진 방향으로 이동함.
        moveMotor(direction);
        // 모터 상태를 이동 중으로 변경함.
        setMotorStatus(MotorStatus.MOVING);
    }

    // 각 상속 Class에서 오버라이드 하도록 추상화
    protected abstract void moveMotor(Direction direction);
}
