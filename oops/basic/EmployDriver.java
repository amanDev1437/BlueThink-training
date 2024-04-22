package oops.basic;

public class EmployDriver{
    public static void main(String[] args){
        Employ e1 = new Employ();
        e1.empName = "Aman Singh";
        e1.empId = 101;
        e1.salary = 100;
        e1.giveBiometric();
        e1.work();
        System.out.println(e1.empName);
        System.out.println(e1.empId);
        System.out.println(e1.salary);
    }
}