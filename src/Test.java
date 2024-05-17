interface Workable{
    void work();
}

class Employee implements Workable{
    @Override
    public void work() {
        System.out.println("Employee is Working");
    }
}

public class Test {
    public static void main(String[] args) {

        Workable w1 = () -> {
            System.out.println("Working");
        };
        w1.work();

        Employee e1 = new Employee();
        e1.work();

        new Employee().work();


    }
}
