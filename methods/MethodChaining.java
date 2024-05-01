class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public Employee getName() {
        System.out.println("Name of Employee is:" + name);
        return this;
    }

    public Employee getId() {
        System.out.println("Id of Employee is:" + id);
        return this;
    }

    public Employee getSalary() {
        System.out.println("Salary of employee is:" + salary);
        return this;
    }

}

public class MethodChaining {
    public static void main(String[] args) {
        Employee e1 = new Employee("Aman", 101, 2.5);
        e1.getName().getId().getSalary();
    }

}
