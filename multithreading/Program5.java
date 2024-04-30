package multithreading;
//getName() and setName()

public class Program5 {
    public static void main(String[] args) {
        System.out.println("Program started");
        int sum = 18 + 35;
        System.out.println("sum is:" + sum);
        Thread t1 = Thread.currentThread();
        String tname = t1.getName();
        System.out.println("Current thread is:" + tname);

        t1.setName("sum thread");
        String newName = t1.getName();
        System.out.println("new name of current thread is:" + newName);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        long tId = t1.threadId();
        System.out.println(tId);

        System.out.println("program ended");
    }

}
