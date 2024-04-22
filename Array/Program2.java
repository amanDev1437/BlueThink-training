import java.util.Scanner;
//print even index element
public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [5];

        for(int i=0;i<=arr.length-1;i++){
            int n = sc.nextInt();
            arr[i] = n;
        }
        for(int i=0;i<=arr.length-1;i++){
            if(i%2==0){
                System.out.println(arr[i]);
            }
            
        }
        sc.close();
    }
}
