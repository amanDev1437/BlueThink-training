package InputOutput;

import java.io.*;


public class SequenceInputStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fin1 = new FileInputStream("D:\\test.txt");
        FileInputStream fin2 = new FileInputStream("D:\\test1.txt");

        SequenceInputStream sin = new SequenceInputStream(fin1,fin2);
        int i = 0;
        while((i=sin.read())!=-1){
            System.out.print((char)i);
        }

    }
}
