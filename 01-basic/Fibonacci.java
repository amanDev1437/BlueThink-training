import java.util.Scanner;

//fibonacci sries 
class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of series");
        int n = sc.nextInt();
        sc.close();

        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + " " + n2 + " ");
        int n3 = 0;
        for (int i = 3; i <= n; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
}