package collectionFramework;

import java.util.*;

class Employee {
    int id;
    String name;
    int age;
    double salary;

    Employee(int id, String name, int age, double salary){
        this.id =id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList <Employee> a1 = new ArrayList<>();

        a1.add(new Employee(101,"aman",22,5));
        a1.add(new Employee(102,"Saksham",16,4));

        for(Employee e: a1){
            System.out.println(e.id+" "+e.name);
        }












    }
}
