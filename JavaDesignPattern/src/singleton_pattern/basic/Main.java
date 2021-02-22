package src.singleton_pattern.basic;

public class Main {
    private static final int User_NUM = 5;

    public static void main(String[] args) {
        User[] user = new User[User_NUM];
        for (int i = 0; i < User_NUM; i++) {
            user[i] = new User((i + 1) + "-user");
            user[i].print();
        }
    }
}

/*-
문제점
Multi Thread 에서 인스턴스가 하나 이상으로 생성됨.
각 Printer 객체의 상태가 공유되지 않고 별도로 이루어짐.
*/
