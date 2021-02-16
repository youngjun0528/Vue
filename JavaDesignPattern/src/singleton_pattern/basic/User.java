package singleton_pattern.basic;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void print() {
        BasicPrinter printer = BasicPrinter.getPrinter();
        printer.print(this.name + " print usring " + printer.toString() + ".");
    }
}
