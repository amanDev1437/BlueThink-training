package InputOutput;

import java.io.*;

public class OutputInThirdFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fin1 = new FileInputStream("D:\\test.txt");
        FileInputStream fin2 = new FileInputStream("D:\\test1.txt");
        FileOutputStream fout = new FileOutputStream("D:\\testout.txt");

        SequenceInputStream sin = new SequenceInputStream(fin1,fin2);
        int i=0;
        while((i=sin.read())!=-1){
            fout.write(i);
        }
        sin.close();
        fout.close();
        fin1.close();
        fin2.close();
        System.out.println("Success");
    }
}
