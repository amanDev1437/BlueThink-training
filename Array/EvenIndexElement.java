import java.util.Scanner;

//print even index element
class EvenIndexElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the element of array");

        for (int i = 0; i <= arr.length - 1; i++) {
            int n = sc.nextInt();
            arr[i] = n;
        }
        System.out.println("Elements at even index");
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }

        }
        sc.close();
    }
}
