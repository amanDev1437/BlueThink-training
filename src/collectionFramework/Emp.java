package collectionFramework;

public class Emp implements Comparable<Emp> {

    String empName1;
    String empMob1;
    int empID1;

    public Emp(String empName1, String empMob1, int empID1){
        this.empName1 = empName1;
        this.empMob1 = empMob1;
        this.empID1 = empID1;
    }

    @Override
    public int compareTo(Emp e) {
        return this.empID1 - e.empID1;
    }

}
