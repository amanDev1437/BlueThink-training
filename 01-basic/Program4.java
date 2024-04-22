import java.util.Scanner;

public class Program4 {
    public static int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int result = factorial(num);
        System.out.println("Factorial of "+num+" is:"+result);

        
    }
}
