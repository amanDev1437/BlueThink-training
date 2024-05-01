import java.util.Scanner;

class NestedException {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j = 10;
        sc.close();
        try {
            int result = j / n;
            System.out.println(result);
            try {
                System.out.println("enter the value of index");
                int i = sc.nextInt();
                System.out.println(a[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Stay in your limit");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

    }
}
