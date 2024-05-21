package InputOutput.Serialization;

import java.io.Serializable;

public class Student implements Serializable {

    String name;
    int rollNo;
    String email;

    public Student(String name, int rollNo, String email){
        this.name = name;
        this.rollNo = rollNo;
        this.email = email;
    }

    public void doWork(){
        System.out.println("Student doing Homework");
    }

    public void giveExam(){
        System.out.println("Student giving exam");
    }
}
