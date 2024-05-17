class MultipleInheritance implements InterfaceExample, InterfaceExample1{
    public void run(){
        System.out.println("Child class run method");

    }
}

public class Driver{
    public static void main(String[] args) {
        MultipleInheritance m1 = new MultipleInheritance();
        m1.run();
    }
}
