package InputOutput;

import java.io.*;

public class BufferReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\bufferWriter.txt");
        BufferedReader br = new BufferedReader(fr);

        String line="";
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();


    }
}
