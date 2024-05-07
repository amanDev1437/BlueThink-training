public class Teacher {

    public synchronized void firstOfT(Student s){

        System.out.println("T1 starts execution of firstOfT()");

        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            System.out.println(e);
        }

        System.out.println("T1 trying to call Student last()");

        s.last();
    }

    public synchronized void last(){
        System.out.println("Inside last() of teacher");
    }
}
