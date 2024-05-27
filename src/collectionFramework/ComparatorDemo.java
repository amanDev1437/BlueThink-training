package collectionFramework;

import java.util.*;

class StudentNew{
    String name;
    int rollNo;

    StudentNew(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
}

class ShortByRoll implements Comparator<StudentNew>{

    @Override
    public int compare(StudentNew s1, StudentNew s2) {
        return s1.rollNo - s2.rollNo;
    }
}

class ShortBYName implements Comparator<StudentNew>{

    public int compare(StudentNew s1, StudentNew s2){

        return s1.name.compareTo(s2.name);
    }
}

public class ComparatorDemo{
    public static void main(String[] args) {

        ArrayList <StudentNew> a1 = new ArrayList<StudentNew>();
        a1.add(new StudentNew("amansingh",1));
        a1.add(new StudentNew("saksham",10));

        //Collections.sort(a1, new ShortByRoll());
        Collections.sort(a1, new ShortBYName());

        for(StudentNew s:a1){
            System.out.println(s.name+" "+s.rollNo);
        }



    }
}