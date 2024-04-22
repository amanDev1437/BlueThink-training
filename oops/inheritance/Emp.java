package oops.inheritance;

public class Emp extends Person{
    double salary;

    Emp(int id, String name, double salary){
        super(id,name);
        this.salary = salary;
    }

    public void display(){
        System.out.println(id+name+salary);
    }

    public static void main(String[] args){
        Emp e1 = new Emp(121,"Aman",5.00);
        e1.display();
    }
    
}
