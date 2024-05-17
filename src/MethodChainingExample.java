class TeacherOne{
    int id;
    String name;
    String subject;

    TeacherOne(int id, String name, String subject){
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public TeacherOne getId(){
        System.out.println(id);
        return this;
    }

    public TeacherOne getName(){
        System.out.println(name);
        return this;
    }

    public void getSubject(){
        System.out.println(subject);

    }

}

public class MethodChainingExample {
    public static void main(String[] args) {
        TeacherOne t = new TeacherOne(101,"Ajay","Maths");
        t.getId().getName().getSubject();
    }
}
