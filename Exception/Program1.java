import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 10;
        try {
            int result = a / n;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Please don't input 0");
        }
    }
}