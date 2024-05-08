package java8Features;

public class MethodReference {

    public static void saySomething(){
        System.out.println("Hello, this is static method");
    }

    public void saySomethingInstance(){
        System.out.println("Hello, this is non-static method");
    }

    public static void main(String[] args) {
        Sayable s1 = MethodReference::saySomething;
        Sayable s2 = new MethodReference()::saySomethingInstance;

        s1.say();
    }
}
