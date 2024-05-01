import java.util.Scanner;

//factorial
public class Factorial {
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        long result = factorial(num);
        System.out.println("Factorial of " + num + " is:" + result);

    }
}
