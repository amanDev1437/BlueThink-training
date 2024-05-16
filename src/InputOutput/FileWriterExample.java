package InputOutput;

import java.io.*;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\test.txt",true);

        fw.write("Welcome to File handling");
        fw.flush();
        fw.close();
    }
}
