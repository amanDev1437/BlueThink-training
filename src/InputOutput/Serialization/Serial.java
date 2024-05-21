package InputOutput.Serialization;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) throws IOException {

        Student s1 = new Student("Aman Singh",101,"aman@123");

        FileOutputStream fos = new FileOutputStream("Student.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s1);

        oos.close();
        fos.close();

        System.out.println("Student state are written in a file");

    }
}
