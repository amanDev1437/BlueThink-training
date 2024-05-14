package InputOutput;

import java.io.*;

public class BufferedWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\bufferWriter.txt");
        BufferedWriter bf = new BufferedWriter(fw);
        bf.write("Written using buffer Writer");
        bf.newLine();
        bf.write("Will be read by Buffered Reader");
        bf.flush();
        bf.close();
        System.out.println("Success");
    }
}
