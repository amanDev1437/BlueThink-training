package collectionFramework;
import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int age;
    int marks;

    Student(String name, int age, int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public int compareTo(Student s){

        return this.age - s.age;
    }

}

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList <Student> s1 = new ArrayList<>();
        s1.add(new Student("Aman",22,98));
        s1.add(new Student("Ashish",18,76));
        s1.add(new Student("Saksham",16,33));

        ArrayList <Student> s2 = new ArrayList<>();

        s1.add(new Student("Aman",22,98));
        s1.add(new Student("Ashish",18,76));
        s1.add(new Student("Saksham",16,33));

        Collections.sort(s1);

        for(Student s:s1){
            System.out.println(s.name+" "+s.age);
        }
    }
}
