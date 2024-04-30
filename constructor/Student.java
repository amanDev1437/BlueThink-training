package constructor;

public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(Student p) {
        this.name = p.name;
        this.age = p.age;
    }

}
