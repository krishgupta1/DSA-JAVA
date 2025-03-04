package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {5,2,6,4,1,3};
        int pivot = arr[arr.length-1];
        int i = -1;
        for(int j = 0; j<arr.length-1; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }   
        System.out.println(Arrays.toString(arr));
    }
}
