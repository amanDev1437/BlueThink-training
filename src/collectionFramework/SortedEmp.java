package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class SortedEmp {
    public static void main(String[] args) {
        ArrayList<Emp> empList = new ArrayList<>();

        empList.add(new Emp("Aman","8840830169",101));
        empList.add(new Emp("Saksham","9315672560",110));
        empList.add(new Emp("Ashish","9450255258",121));
        empList.add(new Emp("Ayush","7388838480",105));

        System.out.println("Before Sorting");

        empList.forEach(emp -> System.out.println(emp.empID1+" "+emp.empName1+" "+emp.empMob1));

        Collections.sort(empList);

        System.out.println("After Sorting");

        empList.forEach(emp -> System.out.println(emp.empID1+" "+emp.empName1+" "+emp.empMob1));





    }
}
