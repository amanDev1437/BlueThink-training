public class B {
    public synchronized void d2(A a){
        System.out.println("T2 starts d2 method");
        try{
            Thread.sleep(5000);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("T2 trying to call A's last() method");
        a.last();
    }
    public synchronized void last() {
    }
}
