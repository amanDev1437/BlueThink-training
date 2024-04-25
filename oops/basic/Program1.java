package oops.basic;

public class Program1 {
    static int a = 10;
    static String college = "IIMT";
    String name;
    int b;

    public Program1(String name, int b) {
        this.name = name;
        this.b = b;
    }

    public static void main(String[] args) {
        int a = 12;
        String college = "CCSU";
        System.out.println(a);
        System.out.println(college);
        System.out.println(Program1.a);
        System.out.println(Program1.college);

        int b = 15;
        String name = "Ashish";
        System.out.println(b);
        System.out.println(name);
        Program1 p1 = new Program1("Saksham", 10);
        System.out.println(p1.b);
        System.out.println(p1.name);

    }

}
