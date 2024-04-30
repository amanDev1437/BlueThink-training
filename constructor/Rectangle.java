package constructor;

public class Rectangle {
    int length;
    int breadth;

    public Rectangle() {
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void perimeter() {
        System.out.println(2 * (this.length + this.breadth));
    }

    public void area() {
        System.out.println(length * breadth);
    }

}
