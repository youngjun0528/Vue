package state_pattern.solution_1;

public class Light {
    // private static int ON = 0;
    // private static int OFF = 1;
    // private static int SLEEP = 2;
    // private int state;
    private StateInterface state;

    public Light() {
        // state = OFF;
        state = new OffState();
    }

    public void setState(StateInterface state) {
        this.state = state;
    }

    public void on_button_pushed() {
        state.on_button_pushed(this);
    }

    public void off_button_pushed() {
        state.off_button_pushed(this);
    }

    // public void on_button_pushed() {
    // if (state == ON) {
    // System.out.println("No Response.");
    // state = SLEEP;
    // } else if (state == SLEEP) {
    // System.out.println("Light On.");
    // state = ON;
    // } else {
    // System.out.println("Light On.");
    // state = ON;
    // }
    // }

    // public void off_button_pushed() {
    // if (state == OFF) {
    // System.out.println("No Response.");
    // } else if (state == SLEEP) {
    // System.out.println("Light Off.");
    // state = OFF;
    // } else {
    // System.out.println("Light Off.");
    // state = OFF;
    // }
    // }
}

/*-
 문제점
 상태값이 추가될 때마다 조건식이 추가되어야 한다. 
 상태를 변경하는 모든 Method에 대해서 상태 변환에 관한 코드 수정이 필요하다.
*/

/*-
 Light 인스턴스 변경없다. Light 인스턴스는 상태와 관계없이 On/Off 두가지 기능만 남긴다.
 상태는 Interface 객체로 선언하고, 추가되는 상태에 대해서는 인터페이스 Method 를 추가하거나 기능을 변경한다.
*/

/*-
 스테이트패턴
 상태에 따라 동일한 작업이 다른 방식으로 실행될때 해당 상태가 작업을 수행하도록 위임하는 디자인 패턴
*/