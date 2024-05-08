package java8Features;

public class Draw{
    public static void main(String[] args) {

        Drawable d1 = () -> {
            System.out.println("Method using lambda expression");
        };
        d1.draw();


    }

}
