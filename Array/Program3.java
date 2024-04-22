//largest element in given array

public class Program3 {
    public static void main(String[] args) {
        int[] arr = {5,4,6,8,9,10,147,3};
        int max = arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        System.out.println("Largest element in given array is:"+max);

    }
}
