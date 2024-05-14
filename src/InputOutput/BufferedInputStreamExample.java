package InputOutput;

import java.io.*;

public class BufferedInputStreamExample {

    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("D:\\test.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);
        int i =0;
        while((i=bin.read())!=-1){
            System.out.print((char)i);
        }
        bin.close();
        fin.close();

    }
}
