import java.util.*;

class Product{
    int id;
    String name;
    double price;

    Product(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        List <Product> l1 = new ArrayList<>();

        l1.add(new Product(101,"hp",2.5));
        l1.add(new Product(102,"dell",4.5));
        l1.add(new Product(103,"apple",100));

       Collections.sort(l1,(p1,p2)->p1.name.compareTo(p2.name));

        for(Product p:l1){
            System.out.println(p.id+" "+p.name+" "+p.price);

        }
    }
}
