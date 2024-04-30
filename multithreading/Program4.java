package multithreading;

//sleep() method
public class Program4 extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Program4 p4 = new Program4();
        p4.start();
    }

}
