package oops.basic;

class Helper {

    public void add() {
        System.out.println("Add method of helper class");
    }

}

public class Main {
    public static void main(String[] args) {
        Helper h1 = new Helper();
        h1.add();
    }

}
