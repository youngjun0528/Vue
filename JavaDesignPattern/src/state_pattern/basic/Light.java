package state_pattern.basic;

public class Light {
    private static int ON = 0;
    private static int OFF = 1;
    private static int SLEEP = 2;
    private int state;

    public Light() {
        state = OFF;
    }

    public void on_button_pushed() {
        if (state == ON) {
            System.out.println("No Response.");
            state = SLEEP;
        } else if (state == SLEEP) {
            System.out.println("Light On.");
            state = ON;
        } else {
            System.out.println("Light On.");
            state = ON;
        }
    }

    public void off_button_pushed() {
        if (state == OFF) {
            System.out.println("No Response.");
        } else if (state == SLEEP) {
            System.out.println("Light Off.");
            state = OFF;
        } else {
            System.out.println("Light Off.");
            state = OFF;
        }
    }
}

/*-
 문제점
 상태값이 추가될 때마다 조건식이 추가되어야 한다. 
 상태를 변경하는 모든 Method에 대해서 상태 변환에 관한 코드 수정이 필요하다.
*/