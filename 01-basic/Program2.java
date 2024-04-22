import java.util.Scanner;

public class Program2 {
    public static boolean isPrime(int n){
        int count = 0;
        for(int i=2;i<=n/2;i++){
            if(n%i == 0){
                count++;
            }
        }
        if(count>0){
            return false;
        }else{
            return true;
        }
    } 

    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(isPrime(n)){
            System.out.println("It is prime number");
        }else{
            System.out.println("It is not prime number");
        }
    }
}
