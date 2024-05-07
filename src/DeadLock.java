public class DeadLock extends Thread {

    Student s = new Student();
    Teacher t = new Teacher();

    public void m1(){
        this.start();
        s.first(t);
    }
    public void run(){
        t.firstOfT(s);
    }
    public static void main(String[] args) {
        DeadLock t1 = new DeadLock();
        t1.m1();
    }
}
