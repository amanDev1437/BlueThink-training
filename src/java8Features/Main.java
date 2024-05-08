package java8Features;

interface Addable {
    int add(int a,int b);
}

public class Main{
    public static void main(String[] args) {
        Addable a1 = (num1,num2)->(num1+num2);
        System.out.println(a1.add(10,15));
    }
}