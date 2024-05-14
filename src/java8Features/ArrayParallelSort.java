package java8Features;

import java.util.Arrays;

public class ArrayParallelSort {
    public static void main(String[] args) {
        int[] arr = {10,20,30,50,23};

        Arrays.parallelSort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
