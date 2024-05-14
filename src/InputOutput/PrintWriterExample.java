package InputOutput;

import java.io.*;

public class PrintWriterExample {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("D:\\test1.txt");
        pw.print(100);
        pw.write(100);
        pw.println("This is written by PrintWriter");
        System.out.println("Success");
    }
}
