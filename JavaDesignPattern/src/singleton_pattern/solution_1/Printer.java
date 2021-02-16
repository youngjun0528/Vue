package singleton_pattern.solution_1;

public class Printer {
    // public Printer() {
    // }

    // 바로 정적변수에 인스턴스를 만들어 초기화 하여 어디서든지 동일한 객체를 참조하도록 한다.
    private static Printer printer = new Printer();
    private int counter = 0;

    // private Printer() {

    // }

    public static Printer getPrinter() {
        // if (printer == null) {
        // try {
        // Thread.sleep(1);
        // } catch (InterruptedException e) {

        // }
        // printer = new Printer();
        // }
        return printer;
    }

    public void print(String str) {
        counter++;
        System.out.println(str + counter);
    }
}
