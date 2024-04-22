//Armstrong number
public class Program5 {
    public static int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static int findPower(int a, int b) {
        int pow = 1;
        for (int i = 1; i <= b; i++) {
            pow = pow * a;
        }
        return pow;
    }

    public static int findSum(int n) {
        int sum = 0;
        int digit = countDigit(n);
        while (n > 0) {
            int rem = n % 10;
            sum = sum + findPower(rem, digit);
            n = n / 10;
        }
        return sum;

    }

    public static void main(String[] args) {
        int total = 0;
        int n = 100;
        while (total < 10) {
            if (findSum(n) == n) {
                System.out.println(n + " ");
                total++;
            }
            n++;
        }
    }

}
