//sort array in ascending order
public class Program5 {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1, 10, 9, 18 };
        int temp = 0;
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }

        sum = sum + arr[0] + arr[arr.length - 1];
        System.out.println("Sum of lowest and largest element:" + sum);

    }

}
