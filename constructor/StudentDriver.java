package constructor;

public class StudentDriver {
    public static void main(String[] args) {
        Student s1 = new Student("Aman", 22);
        System.out.println(s1.name + " " + s1.age);
        Student s2 = new Student(s1);
        System.out.println(s2.name + " " + s2.age);

    }

}
