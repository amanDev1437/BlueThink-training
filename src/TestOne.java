class StudentOne {
    String name;
    int age;
    int rollNo;
    String course;

    StudentOne(){
    }

    StudentOne(String name){
        this();
        this.name = name;
    }

    StudentOne(String name, int age){
        this(name);
        this.age = age;
    }

    StudentOne(String name, int age, int rollNo){
        this(name,age);
        this.rollNo = rollNo;
    }

    StudentOne(String name, int age, int rollNo, String course){
        this(name, age, rollNo);
        this.course = course;
    }

    public void getDetails(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("rollNo:"+rollNo);
        System.out.println("course:"+course);
    }
}



public class TestOne{
    public static void main(String[] args) {
       StudentOne s1 = new StudentOne();
       StudentOne s2 = new StudentOne("Aman");
       StudentOne s3 = new StudentOne("Saksham",18);
       StudentOne s4 = new StudentOne("Ashish",16,201);
       StudentOne s5 = new StudentOne("Ayush",22,202,"Bsc");

       s1.getDetails();
       s2.getDetails();
       s3.getDetails();
       s4.getDetails();
       s5.getDetails();

    }
}