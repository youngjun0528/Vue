package state_pattern.basic;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        light.off_button_pushed();
        light.on_button_pushed();
        light.off_button_pushed();
    }
}

/*-
 문제점
 상태값이 추가될 때마다 조건식이 추가되어야 한다. 
 상태를 변경하는 모든 Method에 대해서 상태 변환에 관한 코드 수정이 필요하다.
*/
