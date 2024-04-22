package oops.methodOverloading;

public class Program1 {
    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(add(2,4));
        System.out.println(add(3,4,5));
    }
}
