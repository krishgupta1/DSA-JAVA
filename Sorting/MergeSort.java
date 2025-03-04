package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9,10};
        int[] result = merge(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
    public static int[] merge(int arr1[], int arr2[]){
        int i = 0;
        int j = 0;
        int k = 0;
        int res[] = new int[arr1.length + arr2.length];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                res[k] = arr1[i];
                i++; k++;
            }
            else{
                res[k] = arr2[j];
                k++;
                j++;
            }
        }

        while(i < arr1.length){
            res[k] = arr1[i];
            k++;
            i++;
        }
        while(j < arr2.length){
            res[k] = arr2[j];
            k++;
            j++;
        }
        return res;
    }
}
