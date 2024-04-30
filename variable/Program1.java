package variable;

public class Program1 {

    int x = 10;

    public static void main(String[] args) {
        int x = 20;
        System.out.println(x);
        Program1 p1 = new Program1();
        System.out.println(p1.x);
    }

}
