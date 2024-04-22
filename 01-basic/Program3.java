import java.util.Scanner;

public class Program3 {
    public static boolean isPalindrome(int n){
        int rev = 0;
        int a = n;
        while(a>0){
            int digit = a%10;
            rev = (rev*10)+digit;
            a=a/10;
        }
        if(rev == n){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if(isPalindrome(num)){
            System.out.println("It is a palindrome number");
        }else{
            System.out.println("It is not a palindrome");
        }
    }
}
