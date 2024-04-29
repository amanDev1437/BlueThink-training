package multithreading;

class Hi extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hello extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Program3 {
    public static void main(String[] args) {
        Hi h1 = new Hi();
        Hello he1 = new Hello();

        h1.setPriority(Thread.MAX_PRIORITY);
        he1.setPriority(Thread.MIN_PRIORITY);
        h1.start();
        he1.start();
    }

}
