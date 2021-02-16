package strategy_pattern.solution;

public class Client {
    public static void main(String[] args) {
        Robot taekwonV = new TaekwonV("TaekwonV");
        Robot atom = new Atom("Atom");

        // 각 객체에서 사용할 인터페이스 할당
        taekwonV.setMovingStrategy(new WalkingStrategy());
        taekwonV.setAttackStrategy(new MissileStrategy());

        atom.setMovingStrategy(new FlyingStrategy());
        atom.setAttackStrategy(new PunchStrategy());

        System.out.println("My name is " + taekwonV.getName());
        taekwonV.move();
        taekwonV.attack();

        System.out.println();

        System.out.println("My name is " + atom.getName());
        atom.move();
        atom.attack();
    }
}

/*-
 OCP = 개방 폐쇄 원칙
 소프트웨어 엔티티(클래스, 모듈, 함수 등)는 확장에 대해서는 열려 있어야 하지만 변경에 대해서는 닫혀 있어야 한다. 
 즉, 자신의 확장에는 열려있고, 주변의 변화에 대해서는 닫혀 있어야 한다는 것이다. 이것은 interface 를 통해 구현하여 해결한다.
 */

/*-
 문제점
 1. 기존 Robot의 move 또는 attack 메소드를 변경할 때, 기존 코드를 변경해야 한다. 
 2. 새로운 Robot의 move 또는 attack 메소드를 추가하고자 할 때, 기존 Robot의 move 메소드와 attack 메소드를 중복하여 작성하여야 한다.
 */

/*-
 해결책
 move 와 attack 을 위한 interface 를 별도로 만들고, 처리한다.
 이렇게 하면, 각 객체의 move 와 attack을 변경하더라도 각 객체를 직접적으로 수정하는 것인 아닌, 인터페이스만 변경하면 된다.
 Robot 종류가 추가되더라도, 동일한 Method 를 추가하는 것이 아닌 인터페이스 객체를 호출하면 된다.
*/

/*-
 Strategy Pattern
 인터페이스나 추상클래스로 외부에서 동일한 방식으로 알고리즘을 호출하는 방식
*/