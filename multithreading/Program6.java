package multithreading;
//join()

class Hello extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello");
        }
    }
}

class Hi extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hi");
        }
    }
}

public class Program6 {
    public static void main(String[] args) {
        Hello he1 = new Hello();
        he1.start();
        Hi h1 = new Hi();
        h1.start();

        try {
            he1.join();
            h1.join();
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        System.out.println("Program end");
    }

}
