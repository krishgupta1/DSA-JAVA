package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {88,12,45,65,2};
        for(int counter = 0; counter <arr.length-1; counter++){
            int minIndex = counter;
            for(int j = counter + 1; j<arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[counter];
            arr[counter] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
