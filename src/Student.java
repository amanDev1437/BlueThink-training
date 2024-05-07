public class Student {

    public synchronized void first(Teacher t){

        System.out.println("Main thread starts execution of first()");

        try {
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println(e);
        }

        System.out.println("Main thread trying to call Teacher last()");

        t.last();
    }

    public synchronized void last(){
        System.out.println("Inside last() of student");
    }
}
