package oops.basic;
public class Employ {
    static String companyName = "ABC";
    int empId;
    String empName;
    double salary;

    public Employ(){

    }
    public Employ(int empId, String empName, double salary){
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void giveBiometric(){
        System.out.println("Employ should give biometric");
    }

    public void work(){
        System.out.println("Employ should work");
    } 
    
    
}
