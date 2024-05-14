package InputOutput;

import java.io.*;
public class BufferedOutputStreamExample {

    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("D:\\test.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);

        String userName = "Saksham Bhattarai";
        byte[] b = userName.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }

}
