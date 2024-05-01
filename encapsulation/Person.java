package encapsulation;

import java.util.Scanner;

public class Person {
    private int pin = 563978;
    private String name;
    private int age;

    Scanner sc = new Scanner(System.in);

    public String getName() {
        System.out.println("Enter the pin:");
        int n = sc.nextInt();
        if (pin == n) {
            System.out.println("Validation successful");
            return name;
        } else {
            System.out.println("Invalid pin");
            return null;
        }
    }

    public int getAge() {
        System.out.println("Enter the pin:");
        int n = sc.nextInt();
        if (pin == n) {
            System.out.println("Validation successful");
            return age;
        } else {
            System.out.println("Invalid pin");
            return 0;
        }
    }

    public void setName(String name) {
        System.out.println("Enter the pin:");
        int n = sc.nextInt();
        if (pin == n) {
            this.name = name;
            System.out.println("Validation is successfull, Name is set");
        } else {
            System.out.println("Invalid pin, Name is not set");
        }
    }

    public void setAge(int age) {
        System.out.println("Enter the pin");
        int n = sc.nextInt();
        if (pin == n) {
            this.age = age;
            System.out.println("Validation is successful, age is set");
        }
    }

}
