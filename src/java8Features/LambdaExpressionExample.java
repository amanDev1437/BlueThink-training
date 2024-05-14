package java8Features;

import java.util.*;

class Products{
    int id;
    String name;
    double price;

    Products(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        List <Products> l1 = new ArrayList<>();

        l1.add(new Products(101,"hp",2.5));
        l1.add(new Products(102,"dell",4.5));
        l1.add(new Products(103,"apple",100));

       Collections.sort(l1,(p1,p2)->p1.name.compareTo(p2.name));

        for(Products p:l1){
            System.out.println(p.id+" "+p.name+" "+p.price);

        }
    }
}
