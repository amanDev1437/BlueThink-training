import java.util.*;

class Program2{
    public static int largestElement(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;

    }

    public static void main(String[] args){
        int[] arr = {2,3,1,6,8,9,17};
        System.out.println(largestElement(arr));
    }
}