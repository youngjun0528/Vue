package singleton_pattern.basic;

public class BasicPrinter {
    // public Printer() {
    // }

    private static BasicPrinter printer = null;

    private BasicPrinter() {

    }

    public static BasicPrinter getPrinter() {
        if (printer == null) {
            printer = new BasicPrinter();
        }
        return printer;
    }

    public void print(String str) {
        System.out.println(str);
    }
}
