package constructor;

public class Car {
    static String company = "Maruti";
    String name;
    int price;
    String color;
    int hp;

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, int price) {
        this(name);
        this.price = price;
    }

    public Car(String name, int price, String color) {
        this(name, price);
        this.color = color;
    }

    public Car(String name, int price, String color, int hp) {
        this(name, price, color);
        this.hp = hp;
    }

    public void displayCar() {
        System.out.println(company + " " + name + " " + price + " " + color + " " + hp);
    }

}
