package InputOutput;

import java.io.*;


public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("D:\\test.txt");
        String name = "Aman Singh";
        byte[] b = name.getBytes();
        fout.write(b);
        fout.close();
        System.out.println("success");
    }
}
