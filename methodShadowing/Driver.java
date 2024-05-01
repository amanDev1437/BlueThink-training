package methodShadowing;

public class Driver {
    public static void main(String[] args) {
        A a1 = new B();
        a1.test();
    }

}
