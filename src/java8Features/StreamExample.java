package java8Features;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;


class Product{
    int id;
    String name;
    float price;

    Product(int id, String name, float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class StreamExample {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product(1,"HP Laptop",25000f));
        list.add(new Product(2,"Dell Laptop",30000f));
        list.add(new Product(3,"Lenovo Laptop",28000f));
        list.add(new Product(4,"Sony Laptop",28000f));
        list.add(new Product(5,"Apple Laptop",90000f));

        List<Float> newList = list.stream()
                                    .filter(p->p.price<30000f)
                                    .map(p->p.price)
                                    .toList();

        System.out.println(newList);

        list.stream().filter(p->p.price>30000f)
                .forEach(p -> System.out.println(p.name));

        float totalPrice = list.stream().map(p->p.price)
                                        .reduce(0f,(sum,price)->sum+price);

        System.out.println("Total price:"+totalPrice);

        //max price
        Product a = list.stream().max((p1,p2)->p1.price>p2.price ? 1 : -1).get();

        System.out.println("Maximum price is:"+a.price);

        //min price

        Product b = list.stream().min((p1,p2) -> p1.price > p2.price ? 1 : -1).get();

        System.out.println("Minimum price is:"+b.price);

        int count = (int)list.stream().filter(product -> product.price<30000f).count();
        System.out.println(count);

        long collectorsCount = list.stream().collect(Collectors.counting());

        System.out.println("Total no. of product:"+collectorsCount);

        double aveargePrice = list.stream().collect(Collectors.averagingDouble(p->p.price));

        System.out.println("Average price:"+aveargePrice);

        double totalPriceUsingColl = list.stream().collect(Collectors.summingDouble(p->p.price));
        System.out.println("Total price using collectors:"+totalPriceUsingColl);


    }
}
