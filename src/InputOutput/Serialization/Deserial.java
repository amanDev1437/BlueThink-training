package InputOutput.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("Student.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s2 = (Student) ois.readObject();
        System.out.println(s2.name);
        System.out.println(s2.email);
        System.out.println(s2.rollNo);
    }
}
