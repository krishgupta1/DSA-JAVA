package Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {88,55,44,33,22};
        bSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bSort(int[] arr) {
        for(int counter = 0; counter<=arr.length-1; counter++){
            for(int j = 0; j<arr.length-counter-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
