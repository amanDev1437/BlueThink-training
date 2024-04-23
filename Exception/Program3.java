import java.io.IOException;

class Program3 {
    public void getValues(int n) throws IOException {
        if (n == 0) {
            throw new IOException("Zero is entered as input");
        } else {
            System.out.println("Right input is entered");
        }
    }

    public static void main(String[] args) {
        try {
            Program3 p3 = new Program3();
            p3.getValues(0);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}