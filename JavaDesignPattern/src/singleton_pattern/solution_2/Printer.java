package src.singleton_pattern.solution_2;

public class Printer {
    // public Printer() {
    // }

    // Singleton
    // 하나의 Instance만을 생성하는 책임이 있으며, getInstance 메서드를 통해 모든 Client에게 동일한 Instance를
    // 반환하는 작업을 한다.
    // Instance를 만드는 Method에 동기화
    private static Printer printer = null;
    private int counter = 0;

    private Printer() {
    }

    public synchronized static Printer getPrinter() {
        if (printer == null) {
            // try {
            // Thread.sleep(1);
            // } catch (InterruptedException e) {

            // }
            printer = new Printer();
        }
        return printer;
    }

    public void print(String str) {
        synchronized (this) { // 오직 하나의 Thread 만 접근을 허용함.
            counter++;
            System.out.println(str + counter);
        }
    }
}
