class Vehicle{
    int maxSpeed;

    Vehicle(){

    }
    Vehicle(String name){
        System.out.println("Parents class constructor");
    }
    void run(){
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle{
    int maxSpeed;

    Car(){

    }

    Car(String name, int maxSpeed){
        super(name);
        this.maxSpeed = maxSpeed;
        super.maxSpeed = maxSpeed;
    }


    void display(){
        System.out.println("Max speed:"+super.maxSpeed);
    }

    void run(){
        super.run();
        System.out.println("Car is running");
    }

}



public class SuperKeywordExample {
    public static void main(String[] args) {
//        Car c = new Car(120);
//        c.display();
//        c.run();

    }
}
