package InputOutput;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\new.txt");
        System.out.println(f.createNewFile());

        File dir = new File("D:\\newFolder");
        System.out.println(dir.mkdir());
        System.out.println(f.exists());
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());

        String[] s = dir.list();
        System.out.println(f.delete());
    }
}
