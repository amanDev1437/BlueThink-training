import java.util.*;

class SearchInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element to search");
        int n = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("Found at index:" + i);
                break;
            }
        }
        sc.close();

    }

}
