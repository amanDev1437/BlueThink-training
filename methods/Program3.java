//method overloading

public class Program3 {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        add(2, 4);
        add(2, 4, 3);
        add(2.4, 5.4, 3.2);

    }

}