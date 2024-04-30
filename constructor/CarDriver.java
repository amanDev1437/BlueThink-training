package constructor;

public class CarDriver {
    public static void main(String[] args) {
        Car c1 = new Car("Alto");
        c1.displayCar();
        Car c2 = new Car("Wagnor", 231, "red", 4);
        c2.displayCar();
    }

}
