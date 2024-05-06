public class A {
    public synchronized void d1(B b){
        System.out.println("Tread1 starts execution of d1 method");
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Thread1 trying to call B's last method");
        b.last();
    }
    public synchronized void last(){
        System.out.println("Inside A's last() method");
    }
}
