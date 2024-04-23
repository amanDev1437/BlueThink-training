package oops.basic;

import java.util.*;

class Car {
    int noOfGear;
    String color;

    // Write your constructor and printCarInfo method here.
    Car(int noOfGear, String color) {
        this.noOfGear = noOfGear;
        this.color = color;
    }

    public void printCarInfo() {
        System.out.println(this.noOfGear);
        System.out.println(this.color);
    }

}

class RaceCar extends Car {
    int maxSpeed;

    // Write your constructor and printRaceCarInfo method here.
    RaceCar(int noOfGear, String color, int maxSpeed) {
        super(noOfGear, color);
        this.maxSpeed = maxSpeed;
    }

    public void printInfo() {
        System.out.println("noOfGear: " + this.noOfGear);
        System.out.println("color: " + this.color);
        System.out.println("maxSpeed: " + this.maxSpeed);
    }

}

class Solution {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int noOfGear = sc.nextInt();

        // [IGNORE]: Extra "end line" in previous line.
        sc.nextLine();

        String color = sc.nextLine();
        int maxSpeed = sc.nextInt();
        RaceCar raceCar = new RaceCar(noOfGear, color, maxSpeed);
        raceCar.printInfo();
    }
}
