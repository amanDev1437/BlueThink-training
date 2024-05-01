package inheritance;

public class Driver {
    public static void main(String[] args) {
        Vehicle v1 = new ElectricCar();// upcasting
        Vehicle v2 = new Vehicle();
        ElectricCar e1 = new ElectricCar();

        Vehicle v3 = e1;
        v1.run();
        v3.run();

    }

}
