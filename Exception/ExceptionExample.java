import java.util.Scanner;

class ExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int a = 10;
        try {
            int result = a / n;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Please don't input 0");
        }
    }
}