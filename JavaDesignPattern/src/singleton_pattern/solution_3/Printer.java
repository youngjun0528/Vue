package singleton_pattern.solution_3;

public class Printer {
    // public Printer() {
    // }

    // 정적 클래스
    // 객체를 생성하지 않고 메서드를 동기화 하여 사용한다.
    // private static Printer printer = null;
    private static int counter = 0;

    // private Printer() {
    // }

    // public synchronized static Printer getPrinter() {
    // if (printer == null) {
    // // try {
    // // Thread.sleep(1);
    // // } catch (InterruptedException e) {

    // // }
    // printer = new Printer();
    // }
    // return printer;
    // }

    public synchronized static void print(String str) {
        counter++;
        System.out.println(str + counter);
    }
}
